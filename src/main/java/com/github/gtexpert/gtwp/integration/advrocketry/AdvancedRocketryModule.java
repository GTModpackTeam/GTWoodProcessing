package com.github.gtexpert.gtwp.integration.advrocketry;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.advrocketry.recipes.AdvancedRocketryWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_ADVROCKETRY,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.ADVANCED_ROCKETRY,
         name = "GTWoodProcessing Advanced Rocketry Integration",
         description = "Advanced Rocketry Integration Module")
public class AdvancedRocketryModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        AdvancedRocketryWoodRecipe.init();
    }
}
