package train.core.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import train.blocks.lantern.TileLantern;

public class PacketLantern implements IMessage {

    /** The key that was pressed. */
    int color;
    int xPos;
    int yPos;
    int zPos;
    public PacketLantern() {}

    public PacketLantern(int color, int x, int y, int z) {

        this.color = color;
        this.xPos = x;
        this.yPos = y;
        this.zPos = z;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {

        this.color = bbuf.readInt();
        this.xPos = bbuf.readInt();
        this.yPos = bbuf.readInt();
        this.zPos = bbuf.readInt();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {

        bbuf.writeInt(this.color);
        bbuf.writeInt(this.xPos);
        bbuf.writeInt(this.yPos);
        bbuf.writeInt(this.zPos);
    }

    public static class Handler implements IMessageHandler<PacketLantern, IMessage> {

        @Override
        public IMessage onMessage(PacketLantern message, MessageContext context) {

            TileEntity lantern = context.getServerHandler().player.world.getTileEntity(new BlockPos(message.xPos, message.yPos, message.zPos));

			/* "instanceof" is null-safe, but we check to avoid four unnecessary instanceof checks for when the value is null anyways. */
            if (lantern != null) {

                if (lantern instanceof TileLantern) {
                    ((TileLantern) lantern).setColor(message.color);
                }
            }


            return null;
        }
    }
}