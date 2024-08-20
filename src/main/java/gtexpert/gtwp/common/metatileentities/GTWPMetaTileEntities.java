package gtexpert.gtwp.common.metatileentities;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

import gtexpert.gtwp.api.util.ModUtility;

public class GTWPMetaTileEntities {

    public static MetaTileEntitySawmill SAWMILL;

    public static void init() {
        SAWMILL = registerMetaTileEntity(10000, new MetaTileEntitySawmill(ModUtility.id("sawmill")));
    }
}
