package com.github.gtexpert.gtwp.integration.wizardry.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class WizardryWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.WIZARDRY;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "wisdom")
                            .log(Mods.Wizardry.getItem("wisdom_wood_log", 1)).removeCharcoalRecipe()
                            .planks(Mods.Wizardry.getItem("wisdom_wood_planks", 1), "wisdom_wood/planks")
                            .slab(Mods.Wizardry.getItem("wisdom_wood_slab", 1), "wisdom_wood/slab")
                            .fence(Mods.Wizardry.getItem("wisdom_wood_fence", 1), "wisdom_wood/fence")
                            .fenceGate(Mods.Wizardry.getItem("wisdom_wood_fence_gate", 1), "wisdom_wood/fence_gate")
                            .stairs(Mods.Wizardry.getItem("wisdom_wood_stairs", 1), "wisdom_wood/stairs")
                            .door(Mods.Wizardry.getItem("wisdom_wood_door", 1), "wisdom_wood/door")
                            .registerAllUnificationInfo()
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
