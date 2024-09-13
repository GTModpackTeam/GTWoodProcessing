package com.github.gtexpert.gtwp.integration.botania.recipes;

import static gregtech.api.GTValues.*;
import static gregtech.api.GTValues.LV;
import static gregtech.api.unification.ore.OrePrefix.dust;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import gregtech.api.util.GTUtility;
import gregtech.common.ConfigHolder;
import gregtech.loaders.WoodTypeEntry;

import com.github.gtexpert.gtwp.api.recipes.GTWPRecipeMaps;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.loaders.GTWPWoodRecipeLoader;

public class BotaniaWoodRecipe {

    private static List<WoodTypeEntry> DEFAULT_ENTRIES;
    private static final String mcModId = Mods.Names.BOTANIA;

    private static List<WoodTypeEntry> getDefaultEntries() {
        if (DEFAULT_ENTRIES == null) {
            return DEFAULT_ENTRIES = Arrays.asList(
                    new WoodTypeEntry.Builder(mcModId, "living_wood")
                            .log(Mods.Botania.getItem("livingwood"))
                            .planks(Mods.Botania.getItem("livingwood", 1, 1), "livingwood_1")
                            .slab(Mods.Botania.getItem("livingwood1slab"), "livingwood1slab_0")
                            .stairs(Mods.Botania.getItem("livingwood1stairs"), "livingwood1stairs")
                            .registerAllUnificationInfo()
                            .build(),
                    new WoodTypeEntry.Builder(mcModId, "dream_wood")
                            .log(Mods.Botania.getItem("dreamwood"))
                            .planks(Mods.Botania.getItem("dreamwood", 1, 1), "dreamwood_1")
                            .slab(Mods.Botania.getItem("dreamwood1slab"), "dreamwood1slab_0")
                            .stairs(Mods.Botania.getItem("dreamwood1stairs"), "dreamwood1stairs")
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

        // log-associated recipes
        String[] woodName = { "livingwood", "dreamwood", "shimmerwoodplanks" };
        for (String name : woodName) {
            ItemStack wood = Mods.Botania.getItem(name);
            ItemStack stair = Mods.Botania.getItem(name + "0stairs");
            ItemStack slab = Mods.Botania.getItem(name + "0slab");
            // stairs
            ModHandler.removeRecipeByName(new ResourceLocation(mcModId, name + "0stairs"));

            ModHandler.addShapedRecipe(mcModId + name + "_stairs", GTUtility.copy(4, stair),
                    "P  ", "PP ", "PPP",
                    'P', wood);

            // plank -> stairs assembling
            RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                    .inputs(GTUtility.copy(6, wood))
                    .outputs(GTUtility.copy(4, stair))
                    .circuitMeta(7)
                    .EUt(1).duration(100).buildAndRegister();

            // Slabs
            // plank -> slab crafting
            ModHandler.addShapedRecipe(mcModId + name + "_slab_saw", GTUtility.copy(2, slab),
                    "sS", 'S', wood);

            if (ConfigHolder.recipes.hardWoodRecipes) {
                ModHandler.removeRecipeByName(new ResourceLocation(mcModId, name + "0slab_0"));
            }

            // plank -> slab cutting
            RecipeMaps.CUTTER_RECIPES.recipeBuilder()
                    .inputs(wood.copy())
                    .outputs(GTUtility.copy(2, slab))
                    .duration(200).EUt(VA[ULV])
                    .buildAndRegister();

            GTWPRecipeMaps.SAWMILL_RECIPES.recipeBuilder()
                    .circuitMeta(17)
                    .inputs(GTUtility.copy(6, wood))
                    .fluidInputs(Materials.Water.getFluid(1000))
                    .outputs(GTUtility.copy(24, slab))
                    .output(dust, Materials.Wood, 12)
                    .duration(600).EUt(VA[LV])
                    .buildAndRegister();
            GTWPRecipeMaps.SAWMILL_RECIPES.recipeBuilder()
                    .circuitMeta(18)
                    .inputs(GTUtility.copy(6, wood))
                    .fluidInputs(Materials.Water.getFluid(2500))
                    .outputs(GTUtility.copy(36, slab))
                    .duration(800).EUt(VA[LV])
                    .buildAndRegister();
            GTWPRecipeMaps.SAWMILL_RECIPES.recipeBuilder()
                    .circuitMeta(19)
                    .inputs(GTUtility.copy(6, wood))
                    .fluidInputs(Materials.DistilledWater.getFluid(600))
                    .outputs(GTUtility.copy(24, slab))
                    .output(dust, Materials.Wood, 12)
                    .duration(450).EUt(VA[LV])
                    .buildAndRegister();
            GTWPRecipeMaps.SAWMILL_RECIPES.recipeBuilder()
                    .circuitMeta(20)
                    .inputs(GTUtility.copy(6, wood))
                    .fluidInputs(Materials.DistilledWater.getFluid(1500))
                    .outputs(GTUtility.copy(36, slab))
                    .duration(650).EUt(VA[LV])
                    .buildAndRegister();
            GTWPRecipeMaps.SAWMILL_RECIPES.recipeBuilder()
                    .circuitMeta(21)
                    .inputs(GTUtility.copy(6, wood))
                    .fluidInputs(Materials.Lubricant.getFluid(120))
                    .outputs(GTUtility.copy(24, slab))
                    .output(dust, Materials.Wood, 12)
                    .duration(300).EUt(VA[LV])
                    .buildAndRegister();
            GTWPRecipeMaps.SAWMILL_RECIPES.recipeBuilder()
                    .circuitMeta(22)
                    .inputs(GTUtility.copy(6, wood))
                    .fluidInputs(Materials.Lubricant.getFluid(300))
                    .outputs(GTUtility.copy(36, slab))
                    .duration(500).EUt(VA[LV])
                    .buildAndRegister();
        }
    }
}
