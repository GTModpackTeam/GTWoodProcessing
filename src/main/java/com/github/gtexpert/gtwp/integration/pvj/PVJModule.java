package com.github.gtexpert.gtwp.integration.pvj;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.pvj.recipes.PVJWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_PVJ,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.PROJECT_VIBRANT_JOURNEYS,
         name = "GTWoodProcessing Project: Vibrant Journeys Integration",
         description = "Project: Vibrant Journeys Integration Module")
public class PVJModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        PVJWoodRecipe.init();
    }
}
