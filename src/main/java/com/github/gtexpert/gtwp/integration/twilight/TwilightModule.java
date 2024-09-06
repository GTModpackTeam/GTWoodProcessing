package com.github.gtexpert.gtwp.integration.twilight;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.twilight.recipes.TwilightWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_TWILIGHT,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.TWILIGHT_FOREST,
         name = "GTWoodProcessing The Twilight Forest Integration",
         description = "The Twilight Forest Integration Module")
public class TwilightModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        TwilightWoodRecipe.init();
    }
}
