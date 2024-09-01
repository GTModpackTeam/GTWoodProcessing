package com.github.gtexpert.gtwp.integration.rustic;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.rustic.recipes.RusticWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_RUSTIC,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.RUSTIC,
         name = "GTWoodProcessing Rustic Integration",
         description = "Rustic Integration Module")
public class RusticModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        RusticWoodRecipe.init();
    }
}
