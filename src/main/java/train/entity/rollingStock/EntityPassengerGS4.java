package train.entity.rollingStock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.skin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.Info;
import train.library.ItemIDs;

import java.util.List;
import java.util.UUID;

public class EntityPassengerGS4 extends GenericRailTransport {

    public EntityPassengerGS4(World worldObj) {
        super(worldObj);
    }

    public EntityPassengerGS4(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityPassengerGS4((World)null), Info.modID, Traincraft.tcTab);


    //main stats
    @Override
    public String transportName(){return "Passenger GS4";}
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
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    @Override
    public float weightKg(){return 10f;}

    //Model stuff
    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new train.render.models.ModelGS4Passenger()};}
    @Override
    public float[][] modelOffsets(){return new float[][]{{0.0f, 0.03f, 0.0f}};}
    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 180.0f, 180.0f}};}
    @Override
    public void registerSkins(){
        String description ="";
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_Orange.png","Orange", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_White.png","White", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_Yellow.png","Yellow", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_Brown.png","Brown", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_Green.png","Green", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_Lime.png","Lime", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_Red.png","Red", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_Grey.png","Grey", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_Green.png","Green", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_LightGrey.png","LightGrey", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_Blue.png","Blue", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_Black.png","Black", description));
        SkinRegistry.addSkin(this.getClass(),
            new skin(Info.modID,"textures/trains/GS4_Passenger_LightBlue.png","LightBlue", description));
    }
    @Override
    public String getDefaultSkin(){
        return Info.modID+":"+"Orange";
    }


    //recipe
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, new ItemStack(ItemIDs.bogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), 
                null, null, new ItemStack(ItemIDs.steelcab.item, 1), 
                null, null, new ItemStack(ItemIDs.seats.item, 1)        };
    }


    //these are separated for being fiddly.
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0,1.2f, 0f}};}
    @Override
    public float[] getHitboxSize(){return new float[]{1.5499999523162842f,2.1f,1.1f};}
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