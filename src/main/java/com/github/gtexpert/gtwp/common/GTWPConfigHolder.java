package com.github.gtexpert.gtwp.common;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.ModValues;

@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/" + ModValues.MODID,
        category = "GTWoodProcessing")
public class GTWPConfigHolder {

    @Config.Comment({ "Start machine ID", "Default: 10000" })
    public static int machineID = 10000;

    @Config.Name("Gregtech Override")
    @Config.RequiresMcRestart
    public static final GregtechOverride ceuOverride = new GregtechOverride();

    public static class GregtechOverride {

        @Config.Comment({ "Making Planks even more difficult.",
                "CEu's hardWoodRecipes & nerfWoodCrafting to true to reflect.", "Default: false" })
        public boolean moreNerfPlankCrafting = false;

        @Config.Comment({ "Making Sticks even more difficult.",
                "CEu's harderRods to true to reflect.", "Default: false" })
        public boolean moreNerfStickCrafting = false;
    }
}
