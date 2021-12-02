package train.blocks.bench;

import ebf.tim.blocks.TileEntityStorage;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import static ebf.tim.utility.CommonUtil.translate;
import org.lwjgl.opengl.GL11;
import train.library.Info;

public class GuiTrainCraftingBlock extends GuiContainer {
	public GuiTrainCraftingBlock(InventoryPlayer invPlayer, TileEntityStorage inv) {
		super(new ContainerTrainWorkbench(invPlayer, inv));
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		this.fontRendererObj.drawString("Train Workbench", 8, 6, 4210752);
		this.fontRendererObj.drawString(translate("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
		String var4 = Info.guiPrefix+"crafting_table.png";
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,var4));
		int var5 = (this.width - this.xSize) / 2;
		int var6 = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
	}
}
