package com.github.gtexpert.gtwp.integration.bop;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.bop.recipes.BoPWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_BOP,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.BIOMES_O_PLENTY,
         name = "GTWoodProcessing Biomes O' Plenty Integration",
         description = "Biomes O' Plenty Integration Module")
public class BoPModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        BoPWoodRecipe.init();
    }
}
