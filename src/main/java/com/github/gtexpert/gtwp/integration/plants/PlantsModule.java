package com.github.gtexpert.gtwp.integration.plants;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.plants.recipes.PlantsWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_PLANTS,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.PLANTS,
         name = "GTWoodProcessing Plants Integration",
         description = "Plants Integration Module")
public class PlantsModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        PlantsWoodRecipe.init();
    }
}
