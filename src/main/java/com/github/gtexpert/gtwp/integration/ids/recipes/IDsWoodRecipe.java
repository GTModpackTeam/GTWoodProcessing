package com.github.gtexpert.gtwp.integration.ids.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class IDsWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.INTERGRATED_DYNAMICS;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "menril")
                            .log(Mods.IntegratedDynamics.getItem("menril_log", 1)).removeCharcoalRecipe()
                            .planks(Mods.IntegratedDynamics.getItem("menril_planks", 1), null)
                            .stairs(Mods.IntegratedDynamics.getItem("menril_planks_stairs", 1), null)
                            .door(Mods.IntegratedDynamics.getItem("menril_door", 1), "menril_door")
                            .build());
        }
        return DEFAULT_ENTRIES;
    }

    public static void init() {
        for (WoodTypeEntry entry : getDefaultEntries()) {
            GTWPWoodRecipeLoader.removePlankRecipe(false, entry, Mods.Names.INTERGRATED_DYNAMICS);
            GTWPWoodRecipeLoader.removeCharcoalRecipe(Mods.IntegratedDynamics.getItem("menril_log_filled", 1));

            GTWPWoodRecipeLoader.registerWoodTypeRecipe(false, entry);
            GTWPWoodRecipeLoader.addCuttingRecipe(entry);
            GTWPWoodRecipeLoader.addSawmillRecipe(entry);
        }
    }
}
