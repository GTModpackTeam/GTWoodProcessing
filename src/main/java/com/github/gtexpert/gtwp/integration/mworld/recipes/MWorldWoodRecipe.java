package com.github.gtexpert.gtwp.integration.mworld.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class MWorldWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.MYSTICAL_WORLD;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "charred")
                            .log(Mods.MysticalWorld.getItem("charred_log", 1)).removeCharcoalRecipe()
                            .planks(Mods.MysticalWorld.getItem("charred_planks", 1), null)
                            .slab(Mods.MysticalWorld.getItem("charred_slab", 1), "charred_slab")
                            .fence(Mods.MysticalWorld.getItem("charred_fence", 1), "charred_fence")
                            .fenceGate(Mods.MysticalWorld.getItem("charred_fence_gate", 1), "charred_fence_gate")
                            .stairs(Mods.MysticalWorld.getItem("charred_stairs", 1), "charred_stairs")
                            .build());
        }
        return DEFAULT_ENTRIES;
    }

    public static void init() {
        for (WoodTypeEntry entry : getDefaultEntries()) {
            GTWPWoodRecipeLoader.removePlankRecipe(false, entry, Mods.Names.MYSTICAL_WORLD);

            GTWPWoodRecipeLoader.registerWoodTypeRecipe(false, entry);
            GTWPWoodRecipeLoader.addCuttingRecipe(entry);
            GTWPWoodRecipeLoader.addSawmillRecipe(entry);
        }
    }
}
