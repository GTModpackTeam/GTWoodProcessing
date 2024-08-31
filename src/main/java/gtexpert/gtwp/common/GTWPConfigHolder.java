package gtexpert.gtwp.common;

import net.minecraftforge.common.config.Config;

import gtexpert.gtwp.api.ModValues;

@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/" + ModValues.MODID,
        category = "GTWoodProcessing")
public class GTWPConfigHolder {

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
