package com.github.gtexpert.gtwp.integration.natura.recipes;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.ore.OrePrefix.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import gregtech.api.GTValues;
import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.api.util.GTUtility;
import gregtech.common.ConfigHolder;
import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.common.GTWPConfigHolder;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class NaturaWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;
    private static final String mcModId = Mods.Names.NATURA;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            return DEFAULT_ENTRIES = Arrays.asList(
                    // Overworld
                    new WoodTypeEntry.Builder(mcModId, "maple")
                            .log(Mods.Natura.getItem("overworld_logs", 1, 0)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("overworld_planks", 1, 0), "overworld/planks/maple_planks")
                            .slab(Mods.Natura.getItem("overworld_slab", 1, 1), "overworld/slabs/maple_slabs")
                            .stairs(Mods.Natura.getItem("overworld_stairs_maple"), "overworld/stairs/maple_stairs")
                            .fenceGate(Mods.Natura.getItem("maple_fence_gate"),
                                    "decorative/overworld/fence_gate/maple_fence_gate")
                            .fence(Mods.Natura.getItem("maple_fence"), "decorative/overworld/fence/maple_fence")
                            .door(Mods.Natura.getItem("overworld_doors", 1, 6), "overworld/doors/maple_door")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "silverbell")
                            .log(Mods.Natura.getItem("overworld_logs", 1, 1)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("overworld_planks", 1, 1), "overworld/planks/silverbell_planks")
                            .slab(Mods.Natura.getItem("overworld_slab", 1, 1), "overworld/slabs/silverbell_slabs")
                            .stairs(Mods.Natura.getItem("overworld_stairs_silverbell"),
                                    "overworld/stairs/silverbell_stairs")
                            .fenceGate(Mods.Natura.getItem("silverbell_fence_gate"),
                                    "decorative/overworld/fence_gate/silverbell_fence_gate")
                            .fence(Mods.Natura.getItem("silverbell_fence"),
                                    "decorative/overworld/fence/silverbell_fence")
                            .door(Mods.Natura.getItem("overworld_doors", 1, 7), "overworld/doors/silverbell_door")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "amaranth")
                            .log(Mods.Natura.getItem("overworld_logs", 1, 2)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("overworld_planks", 1, 2), "overworld/planks/amaranth_planks")
                            .slab(Mods.Natura.getItem("overworld_slab", 1, 2), "overworld/slabs/amaranth_slabs")
                            .stairs(Mods.Natura.getItem("overworld_stairs_amaranth"),
                                    "overworld/stairs/amaranth_stairs")
                            .fenceGate(Mods.Natura.getItem("amaranth_fence_gate"),
                                    "decorative/overworld/fence_gate/amaranth_fence_gate")
                            .fence(Mods.Natura.getItem("amaranth_fence"), "overworld/fence/amaranth_fence")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "tiger")
                            .log(Mods.Natura.getItem("overworld_logs", 1, 3)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("overworld_planks", 1, 3), "overworld/planks/tiger_planks")
                            .slab(Mods.Natura.getItem("overworld_slab", 1, 3), "overworld/slabs/tiger_slabs")
                            .stairs(Mods.Natura.getItem("overworld_stairs_tiger"), "overworld/stairs/tiger_stairs")
                            .fenceGate(Mods.Natura.getItem("tiger_fence_gate"),
                                    "decorative/overworld/fence_gate/tiger_fence_gate")
                            .fence(Mods.Natura.getItem("tiger_fence"), "decorative/overworld/fence/tiger_fence")
                            .door(Mods.Natura.getItem("overworld_doors", 1, 5), "overworld/doors/tiger_door")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "willow")
                            .log(Mods.Natura.getItem("overworld_logs2", 1, 0)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("overworld_planks", 1, 4), "overworld/planks/willow_planks")
                            .slab(Mods.Natura.getItem("overworld_slab", 1, 4), "overworld/slabs/willow_slabs")
                            .stairs(Mods.Natura.getItem("overworld_stairs_willow"), "overworld/stairs/willow_stairs")
                            .fenceGate(Mods.Natura.getItem("willow_fence_gate"),
                                    "decorative/overworld/fence_gate/willow_fence_gate")
                            .fence(Mods.Natura.getItem("willow_fence"), "overworld/fence/willow_fence")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "eucalyptus")
                            .log(Mods.Natura.getItem("overworld_logs2", 1, 1)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("overworld_planks", 1, 5), "overworld/planks/eucalyptus_planks")
                            .slab(Mods.Natura.getItem("overworld_slab2", 1, 0), "overworld/slabs/eucalyptus_slabs")
                            .stairs(Mods.Natura.getItem("overworld_stairs_eucalyptus"),
                                    "overworld/stairs/eucalyptus_stairs")
                            .fenceGate(Mods.Natura.getItem("eucalyptus_fence_gate"),
                                    "decorative/overworld/fence_gate/eucalyptus_fence_gate")
                            .fence(Mods.Natura.getItem("eucalyptus_fence"),
                                    "decorative/overworld/fence/eucalyptus_fence")
                            .door(Mods.Natura.getItem("overworld_doors", 1, 0), "overworld/doors/eucalyptus_door")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "hopseed")
                            .log(Mods.Natura.getItem("overworld_logs2", 1, 2)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("overworld_planks", 1, 6), "overworld/planks/hopseed_planks")
                            .slab(Mods.Natura.getItem("overworld_slab2", 1, 1), "overworld/slabs/hopseed_slabs")
                            .stairs(Mods.Natura.getItem("overworld_stairs_hopseed"), "overworld/stairs/hopseed_stairs")
                            .fenceGate(Mods.Natura.getItem("hopseed_fence_gate"),
                                    "decorative/overworld/fence_gate/hopseed_fence_gate")
                            .fence(Mods.Natura.getItem("hopseed_fence"), "decorative/overworld/fence/hopseed_fence")
                            .door(Mods.Natura.getItem("overworld_doors", 1, 1), "overworld/doors/hopseed_door")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "sakura")
                            .log(Mods.Natura.getItem("overworld_logs2", 1, 3)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("overworld_planks", 1, 7), "overworld/planks/sakura_planks")
                            .slab(Mods.Natura.getItem("overworld_slab2", 1, 2), "overworld/slabs/sakura_slabs")
                            .stairs(Mods.Natura.getItem("overworld_stairs_sakura"), "overworld/stairs/sakura_stairs")
                            .fenceGate(Mods.Natura.getItem("sakura_fence_gate"),
                                    "decorative/overworld/fence_gate/sakura_fence_gate")
                            .fence(Mods.Natura.getItem("sakura_fence"), "decorative/overworld/fence/sakura_fence")
                            .door(Mods.Natura.getItem("overworld_doors", 1, 2), "overworld/doors/sakura_door")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "redwood")
                            .log(Mods.Natura.getItem("redwood_logs", 1, 1)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("overworld_planks", 1, 8), "overworld/planks/redwood_planks")
                            .slab(Mods.Natura.getItem("overworld_slab2", 1, 3), "overworld/slabs/redwood_slabs")
                            .stairs(Mods.Natura.getItem("overworld_stairs_redwood"), "overworld/stairs/redwood_stairs")
                            .fenceGate(Mods.Natura.getItem("redwood_fence_gate"),
                                    "decorative/overworld/fence_gate/redwood_fence_gate")
                            .fence(Mods.Natura.getItem("redwood_fence"), "decorative/overworld/fence/redwood_fence")
                            .door(Mods.Natura.getItem("overworld_doors", 1, 3), "overworld/doors/redwood_door")
                            .registerAllUnificationInfo()
                            .build(),
                    // Nether
                    new WoodTypeEntry.Builder(mcModId, "ghostwood")
                            .log(Mods.Natura.getItem("nether_logs", 1, 0)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("nether_planks", 1, 0), "nether/planks/ghostwood_planks")
                            .slab(Mods.Natura.getItem("nether_slab", 1, 0), "nether/slabs/ghostwood_slabs")
                            .stairs(Mods.Natura.getItem("nether_stairs_ghostwood"), "nether/stairs/ghostwood_stairs")
                            .fenceGate(Mods.Natura.getItem("ghostwood_fence_gate"),
                                    "decorative/nether/fence_gate/ghostwood_fence_gate")
                            .fence(Mods.Natura.getItem("ghostwood_fence"), "decorative/nether/fence/ghostwood_fence")
                            .door(Mods.Natura.getItem("nether_doors", 1, 0), "nether/doors/ghostwood_door")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "darkwood")
                            .log(Mods.Natura.getItem("nether_logs", 1, 1)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("nether_planks", 1, 2), "nether/planks/darkwood_planks")
                            .slab(Mods.Natura.getItem("nether_slab", 1, 2), "nether/slabs/darkwood_slabs")
                            .stairs(Mods.Natura.getItem("nether_stairs_darkwood"), "nether/stairs/darkwood_stairs")
                            .fenceGate(Mods.Natura.getItem("darkwood_fence_gate"),
                                    "decorative/nether/fence_gate/darkwood_fence_gate")
                            .fence(Mods.Natura.getItem("darkwood_fence"), "decorative/nether/fence/darkwood_fence")
                            .door(Mods.Natura.getItem("nether_doors", 1, 2), "nether/doors/darkwood_door")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "fusewood")
                            .log(Mods.Natura.getItem("nether_logs", 1, 2)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("nether_planks", 1, 3), "nether/planks/fusewood_planks")
                            .slab(Mods.Natura.getItem("nether_slab", 1, 3), "nether/slabs/fusewood_slabs")
                            .stairs(Mods.Natura.getItem("nether_stairs_fusewood"), "nether/stairs/fusewood_stairs")
                            .fenceGate(Mods.Natura.getItem("fusewood_fence_gate"),
                                    "decorative/nether/fence_gate/fusewood_fence_gate")
                            .fence(Mods.Natura.getItem("fusewood_fence"), "decorative/nether/fence/fusewood_fence")
                            .door(Mods.Natura.getItem("nether_doors", 1, 3), "nether/doors/fusewood_door")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "bloodwood")
                            .log(Mods.Natura.getItem("nether_logs2", 1, GTValues.W)).removeCharcoalRecipe()
                            .planks(Mods.Natura.getItem("nether_planks", 1, 1), "nether/planks/bloodwood_planks")
                            .slab(Mods.Natura.getItem("nether_slab", 1, 1), "nether/slabs/bloodwood_slabs")
                            .stairs(Mods.Natura.getItem("nether_stairs_bloodwood"), "nether/stairs/bloodwood_stairs")
                            .fenceGate(Mods.Natura.getItem("bloodwood_fence_gate"),
                                    "decorative/nether/fence_gate/bloodwood_fence_gate")
                            .fence(Mods.Natura.getItem("bloodwood_fence"), "decorative/nether/fence/bloodwood_fence")
                            .door(Mods.Natura.getItem("nether_doors", 1, 1), "nether/doors/bloodwood_door")
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
        // Redwood Bark
        ItemStack log = Mods.Natura.getItem("redwood_logs", 1, 0);
        ItemStack door = Mods.Natura.getItem("overworld_doors", 1, 4);
        GTWPWoodRecipeLoader.removeCharcoalRecipe(log);
        if (ConfigHolder.recipes.hardWoodRecipes) {
            // hard plank -> door crafting
            ModHandler.removeRecipeByName(new ResourceLocation(mcModId, "overworld/doors/redwood_bark_door"));
            ModHandler.addShapedRecipe(mcModId + "/overworld/doors/redwood_bark_door",
                    door.copy(),
                    "PTd", "PRS", "PPs",
                    'P', log.copy(),
                    'T', new ItemStack(Blocks.TRAPDOOR),
                    'R', new UnificationEntry(ring, Materials.Iron),
                    'S', new UnificationEntry(screw, Materials.Iron));

            // plank -> door assembling
            RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                    .inputs(new ItemStack(Blocks.TRAPDOOR))
                    .inputs(GTUtility.copy(4, log))
                    .fluidInputs(Materials.Iron.getFluid(GTValues.L / 9))
                    .outputs(door.copy())
                    .duration(400).EUt(4).buildAndRegister();
        } else {
            RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(6, log))
                    .outputs(GTUtility.copy(3, door))
                    .circuitMeta(6)
                    .duration(600).EUt(4)
                    .buildAndRegister();
        }
        // Redwood Root
        GTWPWoodRecipeLoader.removeCharcoalRecipe(Mods.Natura.getItem("redwood_logs", 1, 2));

        // Sticks, Buttons, Pressure Plates, Trap Doors, Workbenches and Bookshelves
        miscRecipe();
    }

    /**
     * Replaces Stick, Button, Pressure Plate, Trap Door, Workbench and Bookshelf Recipe
     * Sticks -> Craft recipe only. No Lathe Recipe.
     * Pressure Plate and Workbench -> Assembler recipe only. No Crafting Recipe.
     */
    public static void miscRecipe() {
        int stick_normal = GTWPConfigHolder.ceuOverride.moreNerfStickCrafting ? 1 : 2;
        stick_normal = ConfigHolder.recipes.harderRods ? stick_normal : 4;
        int stick_saw = GTWPConfigHolder.ceuOverride.moreNerfStickCrafting ? 2 : 4;
        stick_saw = ConfigHolder.recipes.harderRods ? stick_saw : 6;

        // Replaces CEu Recipe
        // Pressure Plate: Change to require Integrated Circuit Number 10
        if (ConfigHolder.recipes.hardRedstoneRecipes) {
            GTRecipeHandler.removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                    OreDictUnifier.get(spring, Materials.Iron),
                    GTUtility.copy(2, OreDictUnifier.get(OrePrefix.plank, Materials.Wood)));
            RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                    .circuitMeta(10)
                    .input(spring, Materials.Iron)
                    .input(plank, Materials.Wood, 2)
                    .outputs(new ItemStack(Blocks.WOODEN_PRESSURE_PLATE, 2))
                    .duration(100).EUt(VA[ULV]).buildAndRegister();
        }
        // Crafting Table: Change to require Integrated Circuit Number 10
        if (ConfigHolder.recipes.hardMiscRecipes) {
            GTRecipeHandler.removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                    OreDictUnifier.get("logWood"),
                    new ItemStack(Items.FLINT));
            RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                    .circuitMeta(10)
                    .input("logWood", 1)
                    .inputs(new ItemStack(Items.FLINT))
                    .outputs(new ItemStack(Blocks.CRAFTING_TABLE))
                    .duration(80).EUt(6).buildAndRegister();
        }
        // Bookshelf: Change to require Integrated Circuit Number 10
        GTRecipeHandler.removeRecipesByInputs(RecipeMaps.ASSEMBLER_RECIPES,
                GTUtility.copy(6, OreDictUnifier.get(plank, Materials.Wood)),
                new ItemStack(Items.BOOK, 3));
        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .circuitMeta(10)
                .input(OrePrefix.plank, Materials.Wood, 6)
                .inputs(new ItemStack(Items.BOOK, 3))
                .outputs(new ItemStack(Blocks.BOOKSHELF))
                .duration(100).EUt(4)
                .buildAndRegister();

        Map<String, Integer> woodMetaMap = new HashMap<>();
        woodMetaMap.put("maple", 0);
        woodMetaMap.put("silverbell", 1);
        woodMetaMap.put("amaranth", 2);
        woodMetaMap.put("tiger", 3);
        woodMetaMap.put("willow", 4);
        woodMetaMap.put("eucalyptus", 5);
        woodMetaMap.put("hopseed", 6);
        woodMetaMap.put("sakura", 7);
        woodMetaMap.put("redwood", 8);
        woodMetaMap.put("ghostwood", 0);
        woodMetaMap.put("bloodwood", 1);
        woodMetaMap.put("darkwood", 2);
        woodMetaMap.put("fusewood", 3);

        for (WoodTypeEntry entry : getDefaultEntries()) {
            if (woodMetaMap.containsKey(entry.woodName)) {
                int meta = woodMetaMap.get(entry.woodName);
                // Overworld Wood
                if (!entry.woodName.equals("ghostwood") && !entry.woodName.equals("bloodwood") &&
                        !entry.woodName.equals("darkwood") && !entry.woodName.equals("fusewood")) {
                    ItemStack Stick = Mods.Natura.getItem("sticks", 1, meta);
                    ItemStack Button = Mods.Natura.getItem(entry.woodName + "_button");
                    ItemStack PressurePlate = Mods.Natura.getItem(entry.woodName + "_pressure_plate");
                    ItemStack TrapDoor = Mods.Natura.getItem(entry.woodName + "_trap_door");
                    ItemStack Workbench = Mods.Natura.getItem("overworld_workbenches", 1, meta);
                    ItemStack Bookshelf = Mods.Natura.getItem("overworld_bookshelves", 1, meta);

                    // Stick
                    ModHandler.removeRecipeByName(
                            new ResourceLocation(mcModId, "overworld/sticks/" + entry.woodName + "_sticks"));
                    ModHandler.addMirroredShapedRecipe(entry.woodName + "_stick_normal",
                            GTUtility.copy(stick_normal, Stick), "P ", " P",
                            'P', entry.planks);
                    ModHandler.addMirroredShapedRecipe(entry.woodName + "_stick_saw", GTUtility.copy(stick_saw, Stick),
                            "Ps", " P",
                            'P', entry.planks);

                    // Button and Pressure Plate
                    if (ConfigHolder.recipes.hardRedstoneRecipes) {
                        // Button
                        ModHandler.removeRecipeByName(
                                new ResourceLocation(mcModId,
                                        "decorative/overworld/button/" + entry.woodName + "_button"));
                        ModHandler.addMirroredShapedRecipe(entry.woodName + "_button", GTUtility.copy(6, Button), "sP",
                                'P', PressurePlate);
                        RecipeMaps.CUTTER_RECIPES.recipeBuilder()
                                .inputs(PressurePlate.copy())
                                .outputs(GTUtility.copy(12, Button))
                                .duration(50).EUt(VA[ULV])
                                .buildAndRegister();

                        // Pressure Plate
                        ModHandler.removeRecipeByName(new ResourceLocation(mcModId,
                                "decorative/overworld/pressure_plate/" + entry.woodName + "_pressure_plate"));
                        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                                .circuitMeta(11)
                                .input(spring, Materials.Iron)
                                .inputs(GTUtility.copy(2, entry.planks))
                                .outputs(GTUtility.copy(2, PressurePlate))
                                .duration(100).EUt(VA[ULV]).buildAndRegister();
                    }

                    // Trap Door
                    if (ConfigHolder.recipes.hardWoodRecipes) {
                        ModHandler.removeRecipeByName(new ResourceLocation(mcModId,
                                "decorative/overworld/trap_door/" + entry.woodName + "_trap_door"));
                    }
                    RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                            .circuitMeta(13)
                            .inputs(GTUtility.copy(3, entry.planks))
                            .outputs(GTUtility.copy(2, TrapDoor))
                            .duration(100).EUt(4)
                            .buildAndRegister();

                    // Workbench
                    if (ConfigHolder.recipes.hardMiscRecipes) {
                        ModHandler.removeRecipeByName(new ResourceLocation(mcModId,
                                "decorative/overworld/workbench/" + entry.woodName + "_workbench"));
                        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder().duration(80).EUt(6)
                                .circuitMeta(11)
                                .inputs(GTUtility.copy(entry.log))
                                .inputs(new ItemStack(Items.FLINT))
                                .outputs(Workbench).buildAndRegister();
                    }

                    // Bookshelf
                    if (ConfigHolder.recipes.removeVanillaBlockRecipes) {
                        ModHandler.removeRecipeByName(new ResourceLocation(mcModId,
                                "decorative/overworld/bookshelf/" + entry.woodName + "_bookshelf"));
                    }
                    RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                            .circuitMeta(11)
                            .inputs(GTUtility.copy(6, entry.planks))
                            .inputs(new ItemStack(Items.BOOK, 3))
                            .outputs(Bookshelf)
                            .duration(100).EUt(4)
                            .buildAndRegister();
                } else {
                    // Nether Wood
                    int stickMeta = entry.woodName.equals("ghostwood") ? 9 :
                            entry.woodName.equals("darkwood") ? 10 :
                                    entry.woodName.equals("fusewood") ? 11 : 12;

                    ItemStack Stick = Mods.Natura.getItem("sticks", 1, stickMeta);
                    ItemStack Button = Mods.Natura.getItem(entry.woodName + "_button");
                    ItemStack PressurePlate = Mods.Natura.getItem(entry.woodName + "_pressure_plate");
                    ItemStack TrapDoor = Mods.Natura.getItem(entry.woodName + "_trap_door");
                    ItemStack Workbench = Mods.Natura.getItem("nether_workbenches", 1, meta);
                    ItemStack Bookshelf = Mods.Natura.getItem("nether_bookshelves", 1, meta);

                    // Stick
                    ModHandler.removeRecipeByName(
                            new ResourceLocation(mcModId, "nether/sticks/" + entry.woodName + "_sticks"));
                    ModHandler.addMirroredShapedRecipe(entry.woodName + "_stick_normal",
                            GTUtility.copy(stick_normal, Stick), "P ", " P",
                            'P', entry.planks);
                    ModHandler.addMirroredShapedRecipe(entry.woodName + "_stick_saw", GTUtility.copy(stick_saw, Stick),
                            "Ps", " P",
                            'P', entry.planks);

                    // Button and Pressure Plate
                    if (ConfigHolder.recipes.hardRedstoneRecipes) {
                        // Button
                        ModHandler.removeRecipeByName(
                                new ResourceLocation(mcModId,
                                        "decorative/nether/button/" + entry.woodName + "_button"));
                        ModHandler.addMirroredShapedRecipe(entry.woodName + "_button", GTUtility.copy(6, Button), "sP",
                                'P', PressurePlate);
                        RecipeMaps.CUTTER_RECIPES.recipeBuilder()
                                .inputs(PressurePlate.copy())
                                .outputs(GTUtility.copy(12, Button))
                                .duration(50).EUt(VA[ULV])
                                .buildAndRegister();

                        // Pressure Plate
                        ModHandler.removeRecipeByName(new ResourceLocation(mcModId,
                                "decorative/nether/pressure_plate/" + entry.woodName + "_pressure_plate"));
                        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                                .circuitMeta(11)
                                .input(spring, Materials.Iron)
                                .inputs(GTUtility.copy(2, entry.planks))
                                .outputs(GTUtility.copy(2, PressurePlate))
                                .duration(100).EUt(VA[ULV]).buildAndRegister();
                    }

                    // Trap Door
                    if (ConfigHolder.recipes.hardWoodRecipes) {
                        ModHandler.removeRecipeByName(new ResourceLocation(mcModId,
                                "decorative/nether/trap_door/" + entry.woodName + "_trap_door"));
                    }
                    RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                            .circuitMeta(13)
                            .inputs(GTUtility.copy(3, entry.planks))
                            .outputs(GTUtility.copy(2, TrapDoor))
                            .duration(100).EUt(4)
                            .buildAndRegister();

                    // Workbench
                    if (ConfigHolder.recipes.hardMiscRecipes) {
                        ModHandler.removeRecipeByName(new ResourceLocation(mcModId,
                                "decorative/nether/workbench/" + entry.woodName + "_workbench"));
                        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder().duration(80).EUt(6)
                                .circuitMeta(11)
                                .inputs(GTUtility.copy(entry.log))
                                .inputs(new ItemStack(Items.FLINT))
                                .outputs(Workbench).buildAndRegister();
                    }

                    // Bookshelf
                    if (ConfigHolder.recipes.removeVanillaBlockRecipes) {
                        ModHandler.removeRecipeByName(new ResourceLocation(mcModId,
                                "decorative/nether/bookshelf/" + entry.woodName + "_bookshelf"));
                    }
                    RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                            .circuitMeta(11)
                            .inputs(GTUtility.copy(6, entry.planks))
                            .inputs(new ItemStack(Items.BOOK, 3))
                            .outputs(Bookshelf)
                            .duration(100).EUt(4)
                            .buildAndRegister();
                }
            }
        }
    }
}
