package com.github.gtexpert.gtwp.integration.twilight.recipes;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.ItemStack;

import gregtech.api.recipes.ModHandler;
import gregtech.api.util.GTUtility;
import gregtech.common.ConfigHolder;
import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.common.GTWPConfigHolder;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class TwilightWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.TWILIGHT_FOREST;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "oak")
                            .log(Mods.TwilightForest.getItem("twilight_log", 1, 0)).removeCharcoalRecipe()
                            .planks(Mods.TwilightForest.getItem("twilight_oak_planks", 1), "wood/twilight_oak_planks")
                            .slab(Mods.TwilightForest.getItem("twilight_oak_slab", 1), "wood/twilight_oak_slab")
                            .fence(Mods.TwilightForest.getItem("twilight_oak_fence", 1), "wood/twilight_oak_fence")
                            .fenceGate(Mods.TwilightForest.getItem("twilight_oak_gate", 1), "wood/twilight_oak_gate")
                            .stairs(Mods.TwilightForest.getItem("twilight_oak_stairs", 1), "wood/twilight_oak_stairs")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "canopy")
                            .log(Mods.TwilightForest.getItem("twilight_log", 1, 1)).removeCharcoalRecipe()
                            .planks(Mods.TwilightForest.getItem("canopy_planks", 1), "wood/canopy_planks")
                            .slab(Mods.TwilightForest.getItem("canopy_slab", 1), "wood/canopy_slab")
                            .fence(Mods.TwilightForest.getItem("canopy_fence", 1), "wood/canopy_fence")
                            .fenceGate(Mods.TwilightForest.getItem("canopy_gate", 1), "wood/canopy_gate")
                            .stairs(Mods.TwilightForest.getItem("canopy_stairs", 1), "wood/canopy_stairs")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "mangrove")
                            .log(Mods.TwilightForest.getItem("twilight_log", 1, 2)).removeCharcoalRecipe()
                            .planks(Mods.TwilightForest.getItem("mangrove_planks", 1), "wood/mangrove_planks")
                            .slab(Mods.TwilightForest.getItem("mangrove_slab", 1), "wood/mangrove_slab")
                            .fence(Mods.TwilightForest.getItem("mangrove_fence", 1), "wood/mangrove_fence")
                            .fenceGate(Mods.TwilightForest.getItem("mangrove_gate", 1), "wood/mangrove_gate")
                            .stairs(Mods.TwilightForest.getItem("mangrove_stairs", 1), "wood/mangrove_stairs")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "dark")
                            .log(Mods.TwilightForest.getItem("twilight_log", 1, 3)).removeCharcoalRecipe()
                            .planks(Mods.TwilightForest.getItem("dark_planks", 1), "wood/darkwood_planks")
                            .slab(Mods.TwilightForest.getItem("dark_slab", 1), "wood/darkwood_slab")
                            .fence(Mods.TwilightForest.getItem("dark_fence", 1), "wood/darkwood_fence")
                            .fenceGate(Mods.TwilightForest.getItem("dark_gate", 1), "wood/darkwood_gate")
                            .stairs(Mods.TwilightForest.getItem("dark_stairs", 1), "wood/darkwood_stairs")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "time")
                            .log(Mods.TwilightForest.getItem("magic_log", 1, 0)).removeCharcoalRecipe()
                            .planks(Mods.TwilightForest.getItem("time_planks", 1), "wood/time_planks")
                            .slab(Mods.TwilightForest.getItem("time_slab", 1), "wood/time_slab")
                            .fence(Mods.TwilightForest.getItem("time_fence", 1), "wood/time_fence")
                            .fenceGate(Mods.TwilightForest.getItem("time_gate", 1), "wood/time_gate")
                            .stairs(Mods.TwilightForest.getItem("time_stairs", 1), "wood/time_stairs")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "trans")
                            .log(Mods.TwilightForest.getItem("magic_log", 1, 1)).removeCharcoalRecipe()
                            .planks(Mods.TwilightForest.getItem("trans_planks", 1), "wood/trans_planks")
                            .slab(Mods.TwilightForest.getItem("trans_slab", 1), "wood/trans_slab")
                            .fence(Mods.TwilightForest.getItem("trans_fence", 1), "wood/trans_fence")
                            .fenceGate(Mods.TwilightForest.getItem("trans_gate", 1), "wood/trans_gate")
                            .stairs(Mods.TwilightForest.getItem("trans_stairs", 1), "wood/trans_stairs")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "mine")
                            .log(Mods.TwilightForest.getItem("magic_log", 1, 2)).removeCharcoalRecipe()
                            .planks(Mods.TwilightForest.getItem("mine_planks", 1), "wood/mine_planks")
                            .slab(Mods.TwilightForest.getItem("mine_slab", 1), "wood/mine_slab")
                            .fence(Mods.TwilightForest.getItem("mine_fence", 1), "wood/mine_fence")
                            .fenceGate(Mods.TwilightForest.getItem("mine_gate", 1), "wood/mine_gate")
                            .stairs(Mods.TwilightForest.getItem("mine_stairs", 1), "wood/mine_stairs")
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "sort")
                            .log(Mods.TwilightForest.getItem("magic_log", 1, 3)).removeCharcoalRecipe()
                            .planks(Mods.TwilightForest.getItem("sort_planks", 1), "wood/sort_planks")
                            .slab(Mods.TwilightForest.getItem("sort_slab", 1), "wood/sort_slab")
                            .fence(Mods.TwilightForest.getItem("sort_fence", 1), "wood/sort_fence")
                            .fenceGate(Mods.TwilightForest.getItem("sort_gate", 1), "wood/sort_gate")
                            .stairs(Mods.TwilightForest.getItem("sort_stairs", 1), "wood/sort_stairs")
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

        // Giant Log
        ItemStack oakPlank = Mods.Vanilla.getItem("planks");
        ItemStack giantLog = Mods.TwilightForest.getItem("giant_log");
        ModHandler.removeRecipeByName(Mods.TwilightForest.getResource("giant_blocks/giant_log"));

        // nerf regular log -> plank crafting, if enabled
        int plank_normal = GTWPConfigHolder.ceuOverride.moreNerfPlankCrafting ? 16 : 32;
        plank_normal = ConfigHolder.recipes.nerfWoodCrafting ? plank_normal : 64;
        int plank_saw = GTWPConfigHolder.ceuOverride.moreNerfPlankCrafting ? 32 : 64;
        plank_saw = ConfigHolder.recipes.nerfWoodCrafting ? plank_saw : 64;

        ModHandler.addShapelessRecipe("giant_plank",
                GTUtility.copy(plank_normal, oakPlank), giantLog);
        ModHandler.addMirroredShapedRecipe("giant_plank_saw",
                GTUtility.copy(plank_saw, oakPlank), "s", "L",
                'L', giantLog);
    }
}
