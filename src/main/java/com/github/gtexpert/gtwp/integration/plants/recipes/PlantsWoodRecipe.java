package com.github.gtexpert.gtwp.integration.plants.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class PlantsWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.PLANTS;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "crystal")
                            .log(Mods.Plants.getItem("crystal_log", 1, 0)).removeCharcoalRecipe()
                            .planks(Mods.Plants.getItem("crystal_planks", 1, 0), "recipe150")
                            .slab(Mods.Plants.getItem("crystal_slab", 1), "recipe154")
                            .stairs(Mods.Plants.getItem("crystal_stairs", 1), "recipe152")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "dark_crystal")
                            .log(Mods.Plants.getItem("crystal_log", 1, 1)).removeCharcoalRecipe()
                            .planks(Mods.Plants.getItem("crystal_planks", 1, 1), "recipe151")
                            .slab(Mods.Plants.getItem("dark_crystal_slab", 1), "recipe156")
                            .stairs(Mods.Plants.getItem("dark_crystal_stairs", 1), "recipe153")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "ash")
                            .log(Mods.Plants.getItem("nether_log", 1, 0)).removeCharcoalRecipe()
                            .planks(Mods.Plants.getItem("planks", 1, 0), "recipe158")
                            .slab(Mods.Plants.getItem("ash_slab", 1), "recipe170")
                            .stairs(Mods.Plants.getItem("ash_stairs", 1), "recipe164")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "blaze")
                            .log(Mods.Plants.getItem("nether_log", 1, 1)).removeCharcoalRecipe()
                            .planks(Mods.Plants.getItem("planks", 1, 1), "recipe159")
                            .slab(Mods.Plants.getItem("blaze_slab", 1), "recipe172")
                            .stairs(Mods.Plants.getItem("blaze_stairs", 1), "recipe165")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "black_kauri")
                            .log(Mods.Plants.getItem("log_0", 1, 0)).removeCharcoalRecipe()
                            .planks(Mods.Plants.getItem("planks", 1, 2), "recipe160")
                            .slab(Mods.Plants.getItem("black_kauri_slab", 1), "recipe174")
                            .stairs(Mods.Plants.getItem("black_kauri_stairs", 1), "recipe166")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "brazillian_pine")
                            .log(Mods.Plants.getItem("log_0", 1, 1)).removeCharcoalRecipe()
                            .planks(Mods.Plants.getItem("planks", 1, 3), "recipe161")
                            .slab(Mods.Plants.getItem("brazillian_pine_slab", 1), "recipe176")
                            .stairs(Mods.Plants.getItem("brazillian_pine_stairs", 1), "recipe167")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "incense_cedar")
                            .log(Mods.Plants.getItem("log_0", 1, 2)).removeCharcoalRecipe()
                            .planks(Mods.Plants.getItem("planks", 1, 4), "recipe162")
                            .slab(Mods.Plants.getItem("incense_cedar_slab", 1), "recipe178")
                            .stairs(Mods.Plants.getItem("incense_cedar_stairs", 1), "recipe168")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "murray_pine")
                            .log(Mods.Plants.getItem("log_0", 1, 3)).removeCharcoalRecipe()
                            .planks(Mods.Plants.getItem("planks", 1, 5), "recipe163")
                            .slab(Mods.Plants.getItem("murray_pine_slab", 1), "recipe180")
                            .stairs(Mods.Plants.getItem("murray_pine_stairs", 1), "recipe169")
                            .build());
        }
        return DEFAULT_ENTRIES;
    }

    public static void init() {
        for (WoodTypeEntry entry : getDefaultEntries()) {
            GTWPWoodRecipeLoader.removePlankRecipe(false, entry, Mods.Names.PLANTS);

            GTWPWoodRecipeLoader.registerWoodTypeRecipe(false, entry);
            GTWPWoodRecipeLoader.addCuttingRecipe(entry);
            GTWPWoodRecipeLoader.addSawmillRecipe(entry);
        }
    }
}
