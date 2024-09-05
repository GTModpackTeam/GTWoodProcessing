package com.github.gtexpert.gtwp.integration.exu.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class ExUWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.EXTRA_UTILITIES;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "ironwood_1")
                            .log(Mods.ExtraUtilities.getItem("ironwood_log", 1, 0)).removeCharcoalRecipe()
                            .planks(Mods.ExtraUtilities.getItem("ironwood_planks", 1, 0), "ironwood_log_to_planks_raw")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "ironwood_2")
                            .log(Mods.ExtraUtilities.getItem("ironwood_log", 1, 1)).removeCharcoalRecipe()
                            .planks(Mods.ExtraUtilities.getItem("ironwood_planks", 1, 1),
                                    "ironwood_log_to_planks_burnt")
                            .build());
        }
        return DEFAULT_ENTRIES;
    }

    public static void init() {
        for (WoodTypeEntry entry : getDefaultEntries()) {
            GTWPWoodRecipeLoader.removePlankRecipe(false, entry);

            GTWPWoodRecipeLoader.registerWoodTypeRecipe(false, entry);
            GTWPWoodRecipeLoader.addCuttingRecipe(entry);
            GTWPWoodRecipeLoader.addSawmillRecipe(entry);
        }
    }
}
