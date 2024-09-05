package com.github.gtexpert.gtwp.integration.bop.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class BoPWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.BIOMES_O_PLENTY;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "sacred_oak")
                            .log(Mods.BoP.getItem("log_0", 1, 4)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 0), "sacred_oak_planks")
                            .slab(Mods.BoP.getItem("wood_slab_0", 1, 0), "sacred_oak_wooden_slab")
                            .stairs(Mods.BoP.getItem("sacred_oak_stairs", 1), "sacred_oak_stairs")
                            .fenceGate(Mods.BoP.getItem("sacred_oak_fence_gate", 1), "sacred_oak_fence_gate")
                            .fence(Mods.BoP.getItem("sacred_oak_fence", 1), "sacred_oak_fence")
                            .door(Mods.BoP.getItem("sacred_oak_door", 1), "sacred_oak_door")
                            .boat(Mods.BoP.getItem("boat_sacred_oak", 1), "boat_sacred_oak")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "cherry")
                            .log(Mods.BoP.getItem("log_0", 1, 5)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 1), "cherry_planks")
                            .slab(Mods.BoP.getItem("wood_slab_0", 1, 1), "cherry_wooden_slab")
                            .stairs(Mods.BoP.getItem("cherry_stairs", 1), "cherry_stairs")
                            .fenceGate(Mods.BoP.getItem("cherry_fence_gate", 1), "cherry_fence_gate")
                            .fence(Mods.BoP.getItem("cherry_fence", 1), "cherry_fence")
                            .door(Mods.BoP.getItem("cherry_door", 1), "cherry_door")
                            .boat(Mods.BoP.getItem("boat_cherry", 1), "boat_cherry")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "umbran")
                            .log(Mods.BoP.getItem("log_0", 1, 6)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 2), "umbran_planks")
                            .slab(Mods.BoP.getItem("wood_slab_0", 1, 2), "umbran_wooden_slab")
                            .stairs(Mods.BoP.getItem("umbran_stairs", 1), "umbran_stairs")
                            .fenceGate(Mods.BoP.getItem("umbran_fence_gate", 1), "umbran_fence_gate")
                            .fence(Mods.BoP.getItem("umbran_fence", 1), "umbran_fence")
                            .door(Mods.BoP.getItem("umbran_door", 1), "umbran_door")
                            .boat(Mods.BoP.getItem("boat_umbran", 1), "boat_umbran")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "fir")
                            .log(Mods.BoP.getItem("log_0", 1, 7)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 3), "fir_planks")
                            .slab(Mods.BoP.getItem("wood_slab_0", 1, 3), "fir_wooden_slab")
                            .stairs(Mods.BoP.getItem("fir_stairs", 1), "fir_stairs")
                            .fenceGate(Mods.BoP.getItem("fir_fence_gate", 1), "fir_fence_gate")
                            .fence(Mods.BoP.getItem("fir", 1), "fir")
                            .door(Mods.BoP.getItem("fir_door", 1), "fir_door")
                            .boat(Mods.BoP.getItem("boat_fir", 1), "boat_fir")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "ethereal")
                            .log(Mods.BoP.getItem("log_1", 1, 4)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 4), "ethereal_planks")
                            .slab(Mods.BoP.getItem("wood_slab_0", 1, 4), "ethereal_wooden_slab")
                            .stairs(Mods.BoP.getItem("ethereal_stairs", 1), "ethereal_stairs")
                            .fenceGate(Mods.BoP.getItem("ethereal_fence_gate", 1), "ethereal_fence_gate")
                            .fence(Mods.BoP.getItem("ethereal_fence", 1), "ethereal_fence")
                            .door(Mods.BoP.getItem("ethereal_door", 1), "ethereal_door")
                            .boat(Mods.BoP.getItem("boat_ethereal", 1), "boat_ethereal")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "magic")
                            .log(Mods.BoP.getItem("log_1", 1, 5)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 5), "magic_planks")
                            .slab(Mods.BoP.getItem("wood_slab_0", 1, 5), "magic_wooden_slab")
                            .stairs(Mods.BoP.getItem("magic_stairs", 1), "magic_stairs")
                            .fenceGate(Mods.BoP.getItem("magic_fence_gate", 1), "magic_fence_gate")
                            .fence(Mods.BoP.getItem("magic_fence", 1), "magic_fence")
                            .door(Mods.BoP.getItem("magic_door", 1), "magic_door")
                            .boat(Mods.BoP.getItem("boat_magic", 1), "boat_magic")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "mangrove")
                            .log(Mods.BoP.getItem("log_1", 1, 6)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 6), "mangrove_planks")
                            .slab(Mods.BoP.getItem("wood_slab_0", 1, 6), "mangrove_wooden_slab")
                            .stairs(Mods.BoP.getItem("mangrove_stairs", 1), "mangrove_stairs")
                            .fenceGate(Mods.BoP.getItem("mangrove_fence_gate", 1), "mangrove_fence_gate")
                            .fence(Mods.BoP.getItem("mangrove_fence", 1), "mangrove_fence")
                            .door(Mods.BoP.getItem("mangrove_door", 1), "mangrove_door")
                            .boat(Mods.BoP.getItem("boat_mangrove", 1), "boat_mangrove")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "palm")
                            .log(Mods.BoP.getItem("log_1", 1, 7)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 7), "palm_planks")
                            .slab(Mods.BoP.getItem("wood_slab_0", 1, 7), "palm_wooden_slab")
                            .stairs(Mods.BoP.getItem("palm_stairs", 1), "palm_stairs")
                            .fenceGate(Mods.BoP.getItem("palm_fence_gate", 1), "palm_fence_gate")
                            .fence(Mods.BoP.getItem("palm_fence", 1), "palm_fence")
                            .door(Mods.BoP.getItem("palm_door", 1), "palm_door")
                            .boat(Mods.BoP.getItem("boat_palm", 1), "boat_palm")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "redwood")
                            .log(Mods.BoP.getItem("log_2", 1, 4)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 8), "redwood_planks")
                            .slab(Mods.BoP.getItem("wood_slab_1", 1, 0), "redwood_wooden_slab")
                            .stairs(Mods.BoP.getItem("redwood_stairs", 1), "redwood_stairs")
                            .fenceGate(Mods.BoP.getItem("redwood_fence_gate", 1), "redwood_fence_gate")
                            .fence(Mods.BoP.getItem("redwood_fence", 1), "redwood_fence")
                            .door(Mods.BoP.getItem("redwood_door", 1), "redwood_door")
                            .boat(Mods.BoP.getItem("boat_redwood", 1), "boat_redwood")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "willow")
                            .log(Mods.BoP.getItem("log_2", 1, 5)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 9), "willow_planks")
                            .slab(Mods.BoP.getItem("wood_slab_1", 1, 1), "willow_wooden_slab")
                            .stairs(Mods.BoP.getItem("willow_stairs", 1), "willow_stairs")
                            .fenceGate(Mods.BoP.getItem("willow_fence_gate", 1), "willow_fence_gate")
                            .fence(Mods.BoP.getItem("willow_fence", 1), "willow_fence")
                            .door(Mods.BoP.getItem("willow_door", 1), "willow_door")
                            .boat(Mods.BoP.getItem("boat_willow", 1), "boat_willow")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "pine")
                            .log(Mods.BoP.getItem("log_2", 1, 6)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 10), "pine_planks")
                            .slab(Mods.BoP.getItem("wood_slab_1", 1, 2), "pine_wooden_slab")
                            .stairs(Mods.BoP.getItem("pine_stairs", 1), "pine_stairs")
                            .fenceGate(Mods.BoP.getItem("pine_fence_gate", 1), "pine_fence_gate")
                            .fence(Mods.BoP.getItem("pine_fence", 1), "pine_fence")
                            .door(Mods.BoP.getItem("pine_door", 1), "pine_door")
                            .boat(Mods.BoP.getItem("boat_pine", 1), "boat_pine")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "hellbark")
                            .log(Mods.BoP.getItem("log_2", 1, 7)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 11), "hellbark_planks")
                            .slab(Mods.BoP.getItem("wood_slab_1", 1, 3), "hellbark_wooden_slab")
                            .stairs(Mods.BoP.getItem("hellbark_stairs", 1), "hellbark_stairs")
                            .fenceGate(Mods.BoP.getItem("hellbark_fence_gate", 1), "hellbark_fence_gate")
                            .fence(Mods.BoP.getItem("hellbark_fence", 1), "hellbark_fence")
                            .door(Mods.BoP.getItem("hellbark_door", 1), "hellbark_door")
                            .boat(Mods.BoP.getItem("boat_hellbark", 1), "boat_hellbark")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "jacaranda")
                            .log(Mods.BoP.getItem("log_3", 1, 4)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 12), "jacaranda_planks")
                            .slab(Mods.BoP.getItem("wood_slab_1", 1, 4), "jacaranda_wooden_slab")
                            .stairs(Mods.BoP.getItem("jacaranda_stairs", 1), "jacaranda_stairs")
                            .fenceGate(Mods.BoP.getItem("jacaranda_fence_gate", 1), "jacaranda_fence_gate")
                            .fence(Mods.BoP.getItem("jacaranda_fence", 1), "jacaranda_fence")
                            .door(Mods.BoP.getItem("jacaranda_door", 1), "jacaranda_door")
                            .boat(Mods.BoP.getItem("boat_jacaranda", 1), "boat_jacaranda")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "mahogany")
                            .log(Mods.BoP.getItem("log_3", 1, 5)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 13), "mahogany_planks")
                            .slab(Mods.BoP.getItem("wood_slab_1", 1, 5), "mahogany_wooden_slab")
                            .stairs(Mods.BoP.getItem("mahogany_stairs", 1), "mahogany_stairs")
                            .fenceGate(Mods.BoP.getItem("mahogany_fence_gate", 1), "mahogany_fence_gate")
                            .fence(Mods.BoP.getItem("mahogany_fence", 1), "mahogany_fence")
                            .door(Mods.BoP.getItem("mahogany_door", 1), "mahogany_door")
                            .boat(Mods.BoP.getItem("boat_mahogany", 1), "boat_mahogany")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "ebony")
                            .log(Mods.BoP.getItem("log_3", 1, 6)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 14), "ebony_planks")
                            .slab(Mods.BoP.getItem("wood_slab_1", 1, 6), "ebony_wooden_slab")
                            .stairs(Mods.BoP.getItem("ebony_stairs", 1), "ebony_stairs")
                            .fenceGate(Mods.BoP.getItem("ebony_fence_gate", 1), "ebony_fence_gate")
                            .fence(Mods.BoP.getItem("ebony_fence", 1), "ebony_fence")
                            .door(Mods.BoP.getItem("ebony_door", 1), "ebony_door")
                            .boat(Mods.BoP.getItem("boat_ebony", 1), "boat_ebony")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "eucalyptus")
                            .log(Mods.BoP.getItem("log_3", 1, 7)).removeCharcoalRecipe()
                            .planks(Mods.BoP.getItem("planks_0", 1, 15), "eucalyptus_planks")
                            .slab(Mods.BoP.getItem("wood_slab_1", 1, 7), "eucalyptus_wooden_slab")
                            .stairs(Mods.BoP.getItem("eucalyptus_stairs", 1), "eucalyptus_stairs")
                            .fenceGate(Mods.BoP.getItem("eucalyptus_fence_gate", 1), "eucalyptus_fence_gate")
                            .fence(Mods.BoP.getItem("eucalyptus_fence", 1), "eucalyptus_fence")
                            .door(Mods.BoP.getItem("eucalyptus_door", 1), "eucalyptus_door")
                            .boat(Mods.BoP.getItem("boat_eucalyptus", 1), "boat_eucalyptus")
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

        // Remove Dead Wood Smelting
        GTWPWoodRecipeLoader.removeCharcoalRecipe(Mods.BoP.getItem("log_4", 1, 5));
    }
}
