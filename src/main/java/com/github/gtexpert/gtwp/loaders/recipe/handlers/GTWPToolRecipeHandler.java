package com.github.gtexpert.gtwp.loaders.recipe.handlers;

import static gregtech.api.unification.material.info.MaterialFlags.GENERATE_PLATE;
import static gregtech.loaders.recipe.handlers.ToolRecipeHandler.addElectricToolRecipe;

import gregtech.api.items.toolitem.IGTTool;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;
import gregtech.api.unification.ore.OrePrefix;

import com.github.gtexpert.gtwp.common.items.GTWPToolItems;

public class GTWPToolRecipeHandler {

    public static void register() {
        OrePrefix.plate.addProcessingHandler(PropertyKey.TOOL, GTWPToolRecipeHandler::processElectricTool);
    }

    private static void processElectricTool(OrePrefix prefix, Material material, ToolProperty property) {
        OrePrefix toolPrefix;

        if (material.hasFlag(GENERATE_PLATE)) {
            // Chainsaw
            toolPrefix = OrePrefix.toolHeadChainsaw;
            addElectricToolRecipe(toolPrefix, material, new IGTTool[] {
                    GTWPToolItems.CHAINSAW_HV, GTWPToolItems.CHAINSAW_IV
            });
        }
    }
}
