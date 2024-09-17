package com.github.gtexpert.gtwp.integration.gtfo.loaders.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.common.ConfigHolder;
import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class GTFOWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.GREGTECH_FOOD_OPTION;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "banana")
                            .log(Mods.GregTechFoodOption.getItem("gtfo_log_0", 1)).removeCharcoalRecipe()
                            .planks(Mods.GregTechFoodOption.getItem("gtfo_planks_0", 1), null)
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "orange")
                            .log(Mods.GregTechFoodOption.getItem("gtfo_log_0", 1, 4)).removeCharcoalRecipe()
                            .planks(Mods.GregTechFoodOption.getItem("gtfo_planks_0", 1, 1), null)
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "mango")
                            .log(Mods.GregTechFoodOption.getItem("gtfo_log_0", 1, 8)).removeCharcoalRecipe()
                            .planks(Mods.GregTechFoodOption.getItem("gtfo_planks_0", 1, 2), null)
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "apricot")
                            .log(Mods.GregTechFoodOption.getItem("gtfo_log_0", 1, 12)).removeCharcoalRecipe()
                            .planks(Mods.GregTechFoodOption.getItem("gtfo_planks_0", 1, 3), null)
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "lemon")
                            .log(Mods.GregTechFoodOption.getItem("gtfo_log_1", 1)).removeCharcoalRecipe()
                            .planks(Mods.GregTechFoodOption.getItem("gtfo_planks_0", 1, 4), null)
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "lime")
                            .log(Mods.GregTechFoodOption.getItem("gtfo_log_1", 1, 4)).removeCharcoalRecipe()
                            .planks(Mods.GregTechFoodOption.getItem("gtfo_planks_0", 1, 5), null)
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "olive")
                            .log(Mods.GregTechFoodOption.getItem("gtfo_log_1", 1, 8)).removeCharcoalRecipe()
                            .planks(Mods.GregTechFoodOption.getItem("gtfo_planks_0", 1, 6), null)
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "rainbowwood")
                            .log(Mods.GregTechFoodOption.getItem("gtfo_log_1", 1, 12)).removeCharcoalRecipe()
                            .planks(Mods.GregTechFoodOption.getItem("gtfo_planks_0", 1, 7), null)
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "nutmeg")
                            .log(Mods.GregTechFoodOption.getItem("gtfo_log_2", 1)).removeCharcoalRecipe()
                            .planks(Mods.GregTechFoodOption.getItem("gtfo_planks_0", 1, 8), null)
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "coconut")
                            .log(Mods.GregTechFoodOption.getItem("gtfo_log_2", 1, 4)).removeCharcoalRecipe()
                            .planks(Mods.GregTechFoodOption.getItem("gtfo_planks_0", 1, 9), null)
                            .build());
        }
        return DEFAULT_ENTRIES;
    }

    public static void init() {
        for (WoodTypeEntry entry : getDefaultEntries()) {
            GTWPWoodRecipeLoader.removePlankRecipe(true, entry);
            if (!ConfigHolder.recipes.hardWoodRecipes) {
                GTWPWoodRecipeLoader.removePlankRecipe(false, entry, Mods.Names.GREGTECH);
            }

            GTWPWoodRecipeLoader.registerWoodTypeRecipe(false, entry);
            GTWPWoodRecipeLoader.addSawmillRecipe(entry);
        }
    }
}
