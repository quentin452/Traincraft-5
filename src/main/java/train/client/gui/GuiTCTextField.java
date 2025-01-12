/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 *
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ChatAllowedCharacters;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiTCTextField extends Gui {
    /**
     * Have the font renderer from GuiScreen to render the textbox text into the screen.
     */
    private final FontRenderer fontRenderer;
    private final int xPos;
    private final int yPos;

    /**
     * The width of this text field.
     */
    private final int width;
    private final int height;

    /**
     * Have the current text beign edited on the textbox.
     */
    private String text = "";
    private int maxStringLength = 32;
    private int cursorCounter;
    private boolean enableBackgroundDrawing = true;

    /**
     * if true the textbox can lose focus by clicking elsewhere on the screen
     */
    private boolean canLoseFocus = true;

    /**
     * If this value is true along isEnabled, keyTyped will process the keys.
     */
    private boolean isFocused;

    /**
     * If this value is true along isFocused, keyTyped will process the keys.
     */
    private boolean isEnabled = true;

    /**
     * The current character index that should be used as start of the rendered text.
     */
    private int lineScrollOffset;
    private int cursorPosition;

    /**
     * other selection position, maybe the same as the cursor
     */
    private int selectionEnd;
    private int enabledColor = 14737632;
    private int disabledColor = 7368816;

    /**
     * True if this textbox is visible
     */
    private boolean visible = true;

    public GuiTCTextField(FontRenderer par1FontRenderer, int par2, int par3, int par4, int par5) {
        this.fontRenderer = par1FontRenderer;
        this.xPos = par2;
        this.yPos = par3;
        this.width = par4;
        this.height = par5;
    }

    /**
     * Increments the cursor counter
     */
    public void updateCursorCounter() {
        ++this.cursorCounter;
    }

    /**
     * Sets the text of the textbox.
     */
    public void setText(String par1Str) {
        if (par1Str.length() > this.maxStringLength) {
            this.text = par1Str.substring(0, this.maxStringLength);
        } else {
            this.text = par1Str;
        }

        this.setCursorPositionEnd();
    }

    /**
     * Returns the text beign edited on the textbox.
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return returns the text between the cursor and selectionEnd
     */
    public String getSelectedtext() {
        int i = Math.min(this.cursorPosition, this.selectionEnd);
        int j = Math.max(this.cursorPosition, this.selectionEnd);
        return this.text.substring(i, j);
    }

    /**
     * replaces selected text, or inserts text at the position on the cursor
     */
    public void writeText(String par1Str) {
        String s1 = "";
        String s2 = ChatAllowedCharacters.filerAllowedCharacters(par1Str);
        int i = Math.min(this.cursorPosition, this.selectionEnd);
        int j = Math.max(this.cursorPosition, this.selectionEnd);
        int k = this.maxStringLength - this.text.length() - (i - this.selectionEnd);

        if (!this.text.isEmpty()) {
            s1 = s1 + this.text.substring(0, i);
        }

        int l;

        if (k < s2.length()) {
            s1 = s1 + s2.substring(0, k);
            l = k;
        } else {
            s1 = s1 + s2;
            l = s2.length();
        }

        if (!this.text.isEmpty() && j < this.text.length()) {
            s1 = s1 + this.text.substring(j);
        }

        this.text = s1;
        this.moveCursorBy(i - this.selectionEnd + l);
    }

    /**
     * Deletes the specified number of words starting at the cursor position. Negative numbers will delete words left of the cursor.
     */
    public void deleteWords(int par1) {
        if (!this.text.isEmpty()) {
            if (this.selectionEnd != this.cursorPosition) {
                this.writeText("");
            } else {
                this.deleteFromCursor(this.getNthWordFromCursor(par1) - this.cursorPosition);
            }
        }
    }

    /**
     * delete the selected text, otherwsie deletes characters from either side of the cursor. params: delete num
     */
    public void deleteFromCursor(int par1) {
        if (!this.text.isEmpty()) {
            if (this.selectionEnd != this.cursorPosition) {
                this.writeText("");
            } else {
                boolean flag = par1 < 0;
                int j = flag ? this.cursorPosition + par1 : this.cursorPosition;
                int k = flag ? this.cursorPosition : this.cursorPosition + par1;
                String s = "";

                if (j >= 0) {
                    s = this.text.substring(0, j);
                }

                if (k < this.text.length()) {
                    s = s + this.text.substring(k);
                }

                this.text = s;

                if (flag) {
                    this.moveCursorBy(par1);
                }
            }
        }
    }

    /**
     * see @getNthNextWordFromPos() params: N, position
     */
    public int getNthWordFromCursor(int par1) {
        return this.getNthWordFromPos(par1, this.getCursorPosition());
    }

    /**
     * gets the position of the nth word. N may be negative, then it looks backwards. params: N, position
     */
    public int getNthWordFromPos(int par1, int par2) {
        return this.func_73798_a(par1, this.getCursorPosition(), true);
    }

    public int func_73798_a(int par1, int par2, boolean par3) {
        int k = par2;
        boolean flag1 = par1 < 0;
        int l = Math.abs(par1);

        for (int i1 = 0; i1 < l; ++i1) {
            if (flag1) {
                while (par3 && k > 0 && this.text.charAt(k - 1) == 32) {
                    --k;
                }

                while (k > 0 && this.text.charAt(k - 1) != 32) {
                    --k;
                }
            } else {
                int j1 = this.text.length();
                k = this.text.indexOf(32, k);

                if (k == -1) {
                    k = j1;
                } else {
                    while (par3 && k < j1 && this.text.charAt(k) == 32) {
                        ++k;
                    }
                }
            }
        }

        return k;
    }

    /**
     * Moves the text cursor by a specified number of characters and clears the selection
     */
    public void moveCursorBy(int par1) {
        this.setCursorPosition(this.selectionEnd + par1);
    }

    /**
     * sets the position of the cursor to the provided index
     */
    public void setCursorPosition(int par1) {
        this.cursorPosition = par1;
        int j = this.text.length();

        if (this.cursorPosition < 0) {
            this.cursorPosition = 0;
        }

        if (this.cursorPosition > j) {
            this.cursorPosition = j;
        }

        this.setSelectionPos(this.cursorPosition);
    }

    /**
     * sets the cursors position to the beginning
     */
    public void setCursorPositionZero() {
        this.setCursorPosition(0);
    }

    /**
     * sets the cursors position to after the text
     */
    public void setCursorPositionEnd() {
        this.setCursorPosition(this.text.length());
    }

    /**
     * Call this method from you GuiScreen to process the keys into textbox.
     */
    public boolean textboxKeyTyped(char par1, int par2) {
        if (this.isEnabled && this.isFocused) {
            switch (par1) {
                case 1:
                    this.setCursorPositionEnd();
                    this.setSelectionPos(0);
                    return true;
                case 3:
                    GuiScreen.setClipboardString(this.getSelectedtext());
                    return true;
                case 22:
                    this.writeText(GuiScreen.getClipboardString());
                    return true;
                case 24:
                    GuiScreen.setClipboardString(this.getSelectedtext());
                    this.writeText("");
                    return true;
                default:
                    switch (par2) {
                        case 14:
                            if (GuiScreen.isCtrlKeyDown()) {
                                this.deleteWords(-1);
                            } else {
                                this.deleteFromCursor(-1);
                            }

                            return true;
                        case 199:
                            if (GuiScreen.isShiftKeyDown()) {
                                this.setSelectionPos(0);
                            } else {
                                this.setCursorPositionZero();
                            }

                            return true;
                        case 203:
                            if (GuiScreen.isShiftKeyDown()) {
                                if (GuiScreen.isCtrlKeyDown()) {
                                    this.setSelectionPos(this.getNthWordFromPos(-1, this.getSelectionEnd()));
                                } else {
                                    this.setSelectionPos(this.getSelectionEnd() - 1);
                                }
                            } else if (GuiScreen.isCtrlKeyDown()) {
                                this.setCursorPosition(this.getNthWordFromCursor(-1));
                            } else {
                                this.moveCursorBy(-1);
                            }

                            return true;
                        case 205:
                            if (GuiScreen.isShiftKeyDown()) {
                                if (GuiScreen.isCtrlKeyDown()) {
                                    this.setSelectionPos(this.getNthWordFromPos(1, this.getSelectionEnd()));
                                } else {
                                    this.setSelectionPos(this.getSelectionEnd() + 1);
                                }
                            } else if (GuiScreen.isCtrlKeyDown()) {
                                this.setCursorPosition(this.getNthWordFromCursor(1));
                            } else {
                                this.moveCursorBy(1);
                            }

                            return true;
                        case 207:
                            if (GuiScreen.isShiftKeyDown()) {
                                this.setSelectionPos(this.text.length());
                            } else {
                                this.setCursorPositionEnd();
                            }

                            return true;
                        case 211:
                            if (GuiScreen.isCtrlKeyDown()) {
                                this.deleteWords(1);
                            } else {
                                this.deleteFromCursor(1);
                            }

                            return true;
                        default:
                            if (ChatAllowedCharacters.isAllowedCharacter(par1)) {
                                this.writeText(Character.toString(par1));
                                return true;
                            } else {
                                return false;
                            }
                    }
            }
        } else {
            return false;
        }
    }

    /**
     * Args: x, y, buttonClicked
     */
    public void mouseClicked(int par1, int par2, int par3) {
        boolean flag = par1 >= this.xPos && par1 < this.xPos + this.width && par2 >= this.yPos && par2 < this.yPos + this.height;

        if (this.canLoseFocus) {
            this.setFocused(this.isEnabled && flag);
        }

        if (this.isFocused && par3 == 0) {
            int l = par1 - this.xPos;

            if (this.enableBackgroundDrawing) {
                l -= 4;
            }

            String s = this.fontRenderer.trimStringToWidth(this.text.substring(this.lineScrollOffset), this.getWidth());
            this.setCursorPosition(this.fontRenderer.trimStringToWidth(s, l).length() + this.lineScrollOffset);
        }
    }

    /**
     * Draws the textbox
     */
    public void drawTextBox() {
        if (this.getVisible()) {
            if (this.getEnableBackgroundDrawing()) {
                //drawRect(this.xPos - 1, this.yPos - 1, this.xPos + this.width + 1, this.yPos + this.height + 1, -6250336);
                drawRect(this.xPos, this.yPos, this.xPos + this.width, this.yPos + this.height, 0xff727272);
            }

            int i = this.isEnabled ? this.enabledColor : this.disabledColor;
            int j = this.cursorPosition - this.lineScrollOffset;
            int k = this.selectionEnd - this.lineScrollOffset;
            String s = this.fontRenderer.trimStringToWidth(this.text.substring(this.lineScrollOffset), this.getWidth());
            boolean flag = j >= 0 && j <= s.length();
            boolean flag1 = this.isFocused && this.cursorCounter / 6 % 2 == 0 && flag;
            int l = this.enableBackgroundDrawing ? this.xPos + 4 : this.xPos;
            int i1 = this.enableBackgroundDrawing ? this.yPos + (this.height - 8) / 2 : this.yPos;
            int j1 = l;

            if (k > s.length()) {
                k = s.length();
            }

            if (!s.isEmpty()) {
                String s1 = flag ? s.substring(0, j) : s;
                j1 = this.fontRenderer.drawStringWithShadow(s1, l, i1, i);
            }

            boolean flag2 = this.cursorPosition < this.text.length() || this.text.length() >= this.getMaxStringLength();
            int k1 = j1;

            if (!flag) {
                k1 = j > 0 ? l + this.width : l;
            } else if (flag2) {
                k1 = j1 - 1;
                --j1;
            }

            if (!s.isEmpty() && flag && j < s.length()) {
                this.fontRenderer.drawStringWithShadow(s.substring(j), j1, i1, i);
            }

            if (flag1) {
                if (flag2) {
                    Gui.drawRect(k1, i1 - 1, k1 + 1, i1 + 1 + this.fontRenderer.FONT_HEIGHT, -3092272);
                } else {
                    this.fontRenderer.drawStringWithShadow("_", k1, i1, i);
                }
            }

            if (k != j) {
                int l1 = l + this.fontRenderer.getStringWidth(s.substring(0, k));
                this.drawCursorVertical(k1, i1 - 1, l1 - 1, i1 + 1 + this.fontRenderer.FONT_HEIGHT);
            }
        }
    }

    /**
     * Draws the vertical line cursor in the textbox.
     */
    private void drawCursorVertical(int par1, int par2, int par3, int par4) {
        int i1;

        if (par1 < par3) {
            i1 = par1;
            par1 = par3;
            par3 = i1;
        }

        if (par2 < par4) {
            i1 = par2;
            par2 = par4;
            par4 = i1;
        }

        Tessellator tessellator = Tessellator.instance;
        GL11.glColor4f(0.0F, 0.0F, 255.0F, 255.0F);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_COLOR_LOGIC_OP);
        GL11.glLogicOp(GL11.GL_OR_REVERSE);
        tessellator.startDrawingQuads();
        tessellator.addVertex((double) par1, (double) par4, 0.0D);
        tessellator.addVertex((double) par3, (double) par4, 0.0D);
        tessellator.addVertex((double) par3, (double) par2, 0.0D);
        tessellator.addVertex((double) par1, (double) par2, 0.0D);
        tessellator.draw();
        GL11.glDisable(GL11.GL_COLOR_LOGIC_OP);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
    }

    public void setMaxStringLength(int par1) {
        this.maxStringLength = par1;

        if (this.text.length() > par1) {
            this.text = this.text.substring(0, par1);
        }
    }

    /**
     * Returns the maximum number of character that can be contained in this textbox.
     * @return int max string length
     */
    public int getMaxStringLength() {
        return this.maxStringLength;
    }

    /**
     * Returns the current position of the cursor.
     * @return int cursor position
     */
    public int getCursorPosition() {
        return this.cursorPosition;
    }

    /**
     * Get enable drawing background and outline.
     * @return boolean enable background drawing
     */
    public boolean getEnableBackgroundDrawing() {
        return this.enableBackgroundDrawing;
    }

    /**
     * Enable drawing background and outline.
     * @param enableBackgroundDrawing boolean enable background drawing
     */
    public void setEnableBackgroundDrawing(boolean enableBackgroundDrawing) {
        this.enableBackgroundDrawing = enableBackgroundDrawing;
    }

    /**
     * Sets the text colour for this textbox (disabled text will not use this colour).
     * @param enabledColor int text colour.
     */
    public void setTextColor(int enabledColor) {
        this.enabledColor = enabledColor;
    }

    /**
     * Sets the text colour for when this textbox is disabled.
     * @param disabledColor int text colour.
     */
    public void setDisabledTextColour(int disabledColor) {
        this.disabledColor = disabledColor;
    }

    /**
     * Setter for the focused field.
     * @param isFocused boolean focused
     */
    public void setFocused(boolean isFocused) {
        if (isFocused && !this.isFocused) {
            this.cursorCounter = 0;
        }

        this.isFocused = isFocused;
    }

    /**
     * Getter for the focused field.
     * @return boolean isFocused
     */
    public boolean isFocused() {
        return this.isFocused;
    }

    public void setEnabled(boolean par1) {
        this.isEnabled = par1;
    }

    /**
     * The side of the selection that is not the cursor, may be the same as the cursor.
     * @return int selection end
     */
    public int getSelectionEnd() {
        return this.selectionEnd;
    }

    /**
     * returns the width of the textbox depending on if the box is enabled.
     * @return int width
     */
    public int getWidth() {
        return this.getEnableBackgroundDrawing() ? this.width - 8 : this.width;
    }

    /**
     * Sets the position of the selection anchor (i.e. position the selection was started at).
     * @param selectionEnd int selection anchor
     */
    public void setSelectionPos(int selectionEnd) {
        int j = this.text.length();

        if (selectionEnd > j) {
            selectionEnd = j;
        }

        if (selectionEnd < 0) {
            selectionEnd = 0;
        }

        this.selectionEnd = selectionEnd;

        if (this.fontRenderer != null) {
            if (this.lineScrollOffset > j) {
                this.lineScrollOffset = j;
            }

            int k = this.getWidth();
            String s = this.fontRenderer.trimStringToWidth(this.text.substring(this.lineScrollOffset), k);
            int l = s.length() + this.lineScrollOffset;

            if (selectionEnd == this.lineScrollOffset) {
                this.lineScrollOffset -= this.fontRenderer.trimStringToWidth(this.text, k, true).length();
            }

            if (selectionEnd > l) {
                this.lineScrollOffset += selectionEnd - l;
            } else if (selectionEnd <= this.lineScrollOffset) {
                this.lineScrollOffset -= this.lineScrollOffset - selectionEnd;
            }

            if (this.lineScrollOffset < 0) {
                this.lineScrollOffset = 0;
            }

            if (this.lineScrollOffset > j) {
                this.lineScrollOffset = j;
            }
        }
    }

    /**
     * When set to true the textbox can lose focus by clicking elsewhere on the screen.
     */
    public void setCanLoseFocus(boolean canLoseFocus) {
        this.canLoseFocus = canLoseFocus;
    }

    /**
     * @return {@code true} if this textbox is visible
     */
    public boolean getVisible() {
        return this.visible;
    }

    /**
     * Sets whether or not this textbox is visible.
     * @param visible boolean visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
