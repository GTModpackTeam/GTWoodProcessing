package gtexpert.gtwp.integration.advrocketry.recipes;

import gregtech.api.recipes.ModHandler;
import gregtech.loaders.WoodTypeEntry;

import gtexpert.gtwp.api.util.Mods;
import gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

import java.util.Arrays;
import java.util.List;

public class AdvancedRocketryWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.AdvancedRocketry.name();
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "alien")
                            .planks(Mods.AdvancedRocketry.getItem("planks", 1), null)
                            .log(Mods.AdvancedRocketry.getItem("alienwood", 1))
                            .registerAllUnificationInfo()
                            .build());
        }
        return DEFAULT_ENTRIES;
    }

    public static void init() {
        ModHandler.removeRecipeByName(Mods.AdvancedRocketry.getResource("alienwoodplanks"));

        for (WoodTypeEntry entry : getDefaultEntries()) {
            GTWPWoodRecipeLoader.registerWoodTypeRecipe(false, entry);
            GTWPWoodRecipeLoader.addCuttingRecipe(entry);
            GTWPWoodRecipeLoader.addSawmillRecipe(entry);
        }
    }
}
