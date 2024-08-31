package com.github.gtexpert.gtwp.integration.forestry;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.forestry.loaders.recipes.ForestryWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_FORESTRY,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.FORESTRY,
         name = "GTWoodProcessing Forestry Integration",
         description = "Forestry Integration Module")
public class ForestryModule extends GTWPIntegrationSubmodule {

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        ForestryWoodRecipe.init();
    }
}
