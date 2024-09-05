package com.github.gtexpert.gtwp.integration.advrocketry.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.api.recipes.ModHandler;
import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class AdvancedRocketryWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.ADVANCED_ROCKETRY;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "alien")
                            .log(Mods.AdvancedRocketry.getItem("alienwood", 1)).removeCharcoalRecipe()
                            .planks(Mods.AdvancedRocketry.getItem("planks", 1), "advancedrocketry_alien_plank")
                            .build());
        }
        return DEFAULT_ENTRIES;
    }

    public static void init() {
        ModHandler.removeRecipeByName(Mods.AdvancedRocketry.getResource("alienwoodplanks"));

        for (WoodTypeEntry entry : getDefaultEntries()) {
            GTWPWoodRecipeLoader.removePlankRecipe(false, entry);

            GTWPWoodRecipeLoader.registerWoodTypeRecipe(false, entry);
            GTWPWoodRecipeLoader.addCuttingRecipe(entry);
            GTWPWoodRecipeLoader.addSawmillRecipe(entry);
        }
    }
}
