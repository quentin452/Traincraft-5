package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.skin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityPassengerRheingoldDining2 extends GenericRailTransport {

    public EntityPassengerRheingoldDining2(World worldObj) {
        super(worldObj);
    }

    public EntityPassengerRheingoldDining2(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPassengerRheingoldDining2((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Rheingold Dining Alternate";}
    @Override
    public String transportcountry(){return "Undefined";}
    @Override
    public String transportYear(){return "Undefined";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.WORKCAR.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelRheingoldPassenger_Dining2()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.05f, 0.15f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 180.0f, 180.0f}};}
    @Override
    public void registerSkins(){
        String description ="";
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/Rheingold_passenger_dining2_Blue.png","Blue", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/Rheingold_passenger_dining2_Red.png","Red", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/Rheingold_passenger_dining2_Green.png","Green", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/Rheingold_passenger_dining2_LightBlue.png","LightBlue", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/Rheingold_passenger_dining2_Magenta.png","Magenta", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/Rheingold_passenger_dining2_Lime.png","Lime", description));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Blue";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), 
                null, null, new ItemStack(ItemIDs.steelcab.item, 1), 
                null, null, new ItemStack(Blocks.crafting_table, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{1.934999942779541f,2.1f,1.1f};}
    @Override
    public float[] bogieLengthFromCenter() {return new float[]{0.0f, -0.0f};}



    //these only change in very specific use cases.
    @Override
    public boolean shouldRiderSit(){
        return false;
    }
    @Override
    public Item getItem(){return thisItem;}
    @Override
    public float getMaxFuel(){return 1;}

}