package com.github.gtexpert.gtwp.integration.nub;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.nub.recipes.NUBWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_NUB,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.NETHER_UPDATE_BACKPORT,
         name = "GTWoodProcessing Nether Update Backport Integration",
         description = "Nether Update Backport Integration Module")
public class NUBModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        NUBWoodRecipe.init();
    }
}
