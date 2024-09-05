package com.github.gtexpert.gtwp.integration.iaf.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class IaFWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.ICE_AND_FIRE;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "dreadwood")
                            .log(Mods.IceAndFire.getItem("dreadwood_log", 1)).removeCharcoalRecipe()
                            .planks(Mods.IceAndFire.getItem("dreadwood_planks", 1), "dread_wood_planks")
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
