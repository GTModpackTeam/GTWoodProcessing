package com.github.gtexpert.gtwp.integration.tc.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class TCWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.THAUMCRAFT;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "silverwood")
                            .log(Mods.Thaumcraft.getItem("log_silverwood", 1)).removeCharcoalRecipe()
                            .planks(Mods.Thaumcraft.getItem("plank_silverwood", 1), "planksilverwood")
                            .slab(Mods.Thaumcraft.getItem("slab_silverwood", 1), "slabsilverwood")
                            .stairs(Mods.Thaumcraft.getItem("stairs_silverwood", 1), "stairssilverwood")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "greatwood")
                            .log(Mods.Thaumcraft.getItem("log_greatwood", 1)).removeCharcoalRecipe()
                            .planks(Mods.Thaumcraft.getItem("plank_greatwood", 1), "plankgreatwood")
                            .slab(Mods.Thaumcraft.getItem("slab_greatwood", 1), "slabgreatwood")
                            .stairs(Mods.Thaumcraft.getItem("stairs_greatwood", 1), "stairsgreatwood")
                            .build());
        }
        return DEFAULT_ENTRIES;
    }

    public static void init() {
        for (WoodTypeEntry entry : getDefaultEntries()) {
            GTWPWoodRecipeLoader.removePlankRecipe(false, entry, Mods.Names.THAUMCRAFT);

            GTWPWoodRecipeLoader.registerWoodTypeRecipe(false, entry);
            GTWPWoodRecipeLoader.addCuttingRecipe(entry);
            GTWPWoodRecipeLoader.addSawmillRecipe(entry);
        }
    }
}
