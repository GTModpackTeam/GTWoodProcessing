package com.github.gtexpert.gtwp.api.recipes;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMapBuilder;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenExpansion("mods.gregtech.recipe.RecipeMaps")
@ZenRegister
public class GTWPRecipeMaps {

    @ZenProperty
    public static final RecipeMap<SimpleRecipeBuilder> SAWMILL_RECIPES = new RecipeMapBuilder<>(
            "sawmill", new SimpleRecipeBuilder())
                    .itemInputs(2)
                    .itemOutputs(2)
                    .fluidInputs(1)
                    .fluidOutputs(0)
                    .itemSlotOverlay(GuiTextures.SAWBLADE_OVERLAY, false, false)
                    .itemSlotOverlay(GuiTextures.CUTTER_OVERLAY, true, false)
                    .itemSlotOverlay(GuiTextures.DUST_OVERLAY, true, true)
                    .progressBar(GuiTextures.PROGRESS_BAR_SLICE, ProgressWidget.MoveType.HORIZONTAL)
                    .sound(GTSoundEvents.CHAINSAW_TOOL)
                    .build();
}
