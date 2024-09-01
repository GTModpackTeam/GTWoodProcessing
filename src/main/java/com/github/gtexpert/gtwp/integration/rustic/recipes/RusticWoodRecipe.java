package com.github.gtexpert.gtwp.integration.rustic.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class RusticWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.RUSTIC;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "olive")
                            .log(Mods.Rustic.getItem("log", 1, 0)).removeCharcoalRecipe()
                            .planks(Mods.Rustic.getItem("planks", 1, 0), "olive_planks")
                            .slab(Mods.Rustic.getItem("olive_slab_item", 1), "olive_slab")
                            .fence(Mods.Rustic.getItem("fence_olive", 1), "olive_fence")
                            .fenceGate(Mods.Rustic.getItem("fence_gate_olive", 1), "olive_fence_gate")
                            .stairs(Mods.Rustic.getItem("stairs_olive", 1), "olive_stairs")
                            .door(Mods.Rustic.getItem("olive_door", 1), "olive_door")
                            .registerAllOres()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "ironwood")
                            .log(Mods.Rustic.getItem("log", 1, 1)).removeCharcoalRecipe()
                            .planks(Mods.Rustic.getItem("planks", 1, 1), "ironwood_planks")
                            .slab(Mods.Rustic.getItem("ironwood_slab_item", 1), "ironwood_slab")
                            .fence(Mods.Rustic.getItem("fence_ironwood", 1), "ironwood_fence")
                            .fenceGate(Mods.Rustic.getItem("fence_gate_ironwood", 1), "ironwood_fence_gate")
                            .stairs(Mods.Rustic.getItem("stairs_ironwood", 1), "ironwood_stairs")
                            .door(Mods.Rustic.getItem("ironwood_door", 1), "ironwood_door")
                            .registerAllOres()
                            .build());
        }
        return DEFAULT_ENTRIES;
    }

    public static void init() {
        for (WoodTypeEntry entry : getDefaultEntries()) {
            GTWPWoodRecipeLoader.removePlankRecipe(false, entry, Mods.Names.RUSTIC);

            GTWPWoodRecipeLoader.registerWoodTypeRecipe(false, entry);
            GTWPWoodRecipeLoader.addCuttingRecipe(entry);
            GTWPWoodRecipeLoader.addSawmillRecipe(entry);
        }
    }
}
