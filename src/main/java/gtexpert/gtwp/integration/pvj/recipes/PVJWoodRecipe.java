package gtexpert.gtwp.integration.pvj.recipes;

import java.util.Arrays;
import java.util.List;

import gregtech.loaders.WoodTypeEntry;
import gtexpert.gtwp.api.util.Mods;
import gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class PVJWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            final String mcModId = Mods.Names.PROJECT_VIBRANT_JOURNEYS;
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "willow")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_willow", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_willow", 1), "willow_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("willow_door_item", 1), "willow_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("willow_slab", 1), "willow_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("willow_fence", 1), "willow_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("willow_fence_gate", 1), "willow_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("willow_stairs", 1), "willow_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("willow_boat", 1), "willow_boat")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "mangrove")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_mangrove", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_mangrove", 1), "mangrove_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("mangrove_door_item", 1), "mangrove_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("mangrove_slab", 1), "mangrove_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("mangrove_fence", 1), "mangrove_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("mangrove_fence_gate", 1),
                                    "mangrove_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("mangrove_stairs", 1), "mangrove_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("mangrove_boat", 1), "mangrove_boat")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "palm")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_palm", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_palm", 1), "palm_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("palm_door_item", 1), "palm_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("palm_slab", 1), "palm_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("palm_fence", 1), "palm_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("palm_fence_gate", 1), "palm_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("palm_stairs", 1), "palm_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("palm_boat", 1), "palm_boat")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "redwood")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_redwood", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_redwood", 1), "redwood_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("redwood_door_item", 1), "redwood_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("redwood_slab", 1), "redwood_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("redwood_fence", 1), "redwood_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("redwood_fence_gate", 1),
                                    "redwood_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("redwood_stairs", 1), "redwood_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("redwood_boat", 1), "redwood_boat")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "fir")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_fir", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_fir", 1), "fir_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("fir_door_item", 1), "fir_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("fir_slab", 1), "fir_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("fir_fence", 1), "fir_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("fir_fence_gate", 1), "fir_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("fir_stairs", 1), "fir_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("fir_boat", 1), "fir_boat")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "pine")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_pine", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_pine", 1), "pine_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("pine_door_item", 1), "pine_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("pine_slab", 1), "pine_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("pine_fence", 1), "pine_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("pine_fence_gate", 1), "pine_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("pine_stairs", 1), "pine_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("pine_boat", 1), "pine_boat")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "aspen")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_aspen", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_aspen", 1), "aspen_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("aspen_door_item", 1), "aspen_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("aspen_slab", 1), "aspen_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("aspen_fence", 1), "aspen_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("aspen_fence_gate", 1), "aspen_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("aspen_stairs", 1), "aspen_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("aspen_boat", 1), "aspen_boat")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "maple")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_maple", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_maple", 1), "maple_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("maple_door_item", 1), "maple_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("maple_slab", 1), "maple_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("maple_fence", 1), "maple_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("maple_fence_gate", 1), "maple_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("maple_stairs", 1), "maple_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("maple_boat", 1), "maple_boat")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "baobab")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_baobab", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_baobab", 1), "baobab_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("baobab_door_item", 1), "baobab_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("baobab_slab", 1), "baobab_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("baobab_fence", 1), "baobab_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("baobab_fence_gate", 1), "baobab_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("baobab_stairs", 1), "baobab_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("baobab_boat", 1), "baobab_boat")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "cottonwood")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_cottonwood", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_cottonwood", 1), "cottonwood_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("cottonwood_door_item", 1), "cottonwood_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("cottonwood_slab", 1), "cottonwood_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("cottonwood_fence", 1), "cottonwood_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("cottonwood_fence_gate", 1),
                                    "cottonwood_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("cottonwood_stairs", 1), "cottonwood_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("cottonwood_boat", 1), "cottonwood_boat")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "juniper")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_juniper", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_juniper", 1), "juniper_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("juniper_door_item", 1), "juniper_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("juniper_slab", 1), "juniper_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("juniper_fence", 1), "juniper_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("juniper_fence_gate", 1),
                                    "juniper_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("juniper_stairs", 1), "juniper_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("juniper_boat", 1), "juniper_boat")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "cherry_blossom")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_cherry_blossom", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_cherry_blossom", 1),
                                    "cherry_blossom_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("cherry_blossom_door_item", 1),
                                    "cherry_blossom_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("cherry_blossom_slab", 1), "cherry_blossom_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("cherry_blossom_fence", 1),
                                    "cherry_blossom_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("cherry_blossom_fence_gate", 1),
                                    "cherry_blossom_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("cherry_blossom_stairs", 1),
                                    "cherry_blossom_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("cherry_blossom_boat", 1), "cherry_blossom_boat")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "jacaranda")
                            .log(Mods.ProjectVibrantJourneys.getItem("log_jacaranda", 1)).removeCharcoalRecipe()
                            .planks(Mods.ProjectVibrantJourneys.getItem("planks_jacaranda", 1), "jacaranda_planks")
                            .door(Mods.ProjectVibrantJourneys.getItem("jacaranda_door_item", 1), "jacaranda_door")
                            .slab(Mods.ProjectVibrantJourneys.getItem("jacaranda_slab", 1), "jacaranda_slab")
                            .fence(Mods.ProjectVibrantJourneys.getItem("jacaranda_fence", 1), "jacaranda_fence")
                            .fenceGate(Mods.ProjectVibrantJourneys.getItem("jacaranda_fence_gate", 1),
                                    "jacaranda_fence_gate")
                            .stairs(Mods.ProjectVibrantJourneys.getItem("jacaranda_stairs", 1), "jacaranda_stairs")
                            .boat(Mods.ProjectVibrantJourneys.getItem("jacaranda_boat", 1), "jacaranda_boat")
                            .registerAllUnificationInfo()
                            .build());
        }
        return DEFAULT_ENTRIES;
    }

    public static void init() {
        for (WoodTypeEntry entry : getDefaultEntries()) {
            GTWPWoodRecipeLoader.removePlankRecipe(false, entry, Mods.Names.PROJECT_VIBRANT_JOURNEYS);

            GTWPWoodRecipeLoader.registerWoodTypeRecipe(true, entry);
            GTWPWoodRecipeLoader.addCuttingRecipe(entry);
            GTWPWoodRecipeLoader.addSawmillRecipe(entry);
        }
    }
}
