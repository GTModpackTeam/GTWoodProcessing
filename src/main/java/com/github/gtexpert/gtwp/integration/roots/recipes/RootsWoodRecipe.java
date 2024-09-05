package com.github.gtexpert.gtwp.integration.roots.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class RootsWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.ROOTS;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "wildwood")
                            .log(Mods.Roots.getItem("wildwood_log", 1)).removeCharcoalRecipe()
                            .planks(Mods.Roots.getItem("wildwood_planks", 1), null)
                            .door(Mods.Roots.getItem("wildwood_door", 1), "wildwood_door")
                            .slab(Mods.Roots.getItem("wildwood_slab", 1), "wildwood_slab")
                            .fence(Mods.Roots.getItem("wildwood_fence", 1), "wildwood_fence")
                            .fenceGate(Mods.Roots.getItem("wildwood_fence_gate", 1), "wildwood_fence_gate")
                            .stairs(Mods.Roots.getItem("wildwood_stairs", 1), "wildwood_stairs")
                            .registerAllOres()
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
