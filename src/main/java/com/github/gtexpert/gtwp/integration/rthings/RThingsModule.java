package com.github.gtexpert.gtwp.integration.rthings;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.rthings.recipes.RThingsWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_RTHINGS,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.RANDOM_THINGS,
         name = "GTWoodProcessing Random Things Integration",
         description = "Random Things Integration Module")
public class RThingsModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        RThingsWoodRecipe.init();
    }
}
