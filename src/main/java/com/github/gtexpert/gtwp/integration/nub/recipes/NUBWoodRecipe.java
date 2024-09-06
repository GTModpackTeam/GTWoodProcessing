package com.github.gtexpert.gtwp.integration.nub.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class NUBWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.NETHER_UPDATE_BACKPORT;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "crimson")
                            .log(Mods.NetherUpdateBackport.getItem("crimsonstem", 1)).removeCharcoalRecipe()
                            .planks(Mods.NetherUpdateBackport.getItem("crimsonplanks", 1), "crimsonplanksrecipe")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "warped")
                            .log(Mods.NetherUpdateBackport.getItem("warpedstem", 1)).removeCharcoalRecipe()
                            .planks(Mods.NetherUpdateBackport.getItem("warpedplanks", 1), "warpedplanksrecipe")
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
