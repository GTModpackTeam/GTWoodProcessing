package com.github.gtexpert.gtwp.common.metatileentities;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

import com.github.gtexpert.gtwp.api.util.ModUtility;
import com.github.gtexpert.gtwp.common.GTWPConfigHolder;

public class GTWPMetaTileEntities {

    public static MetaTileEntitySawmill SAWMILL;

    public static void init() {
        SAWMILL = registerMetaTileEntity(GTWPConfigHolder.machineID, new MetaTileEntitySawmill(ModUtility.id("sawmill")));
    }
}
