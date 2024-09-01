package com.github.gtexpert.gtwp.integration.mworld;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.mworld.recipes.MWorldWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_MWORLD,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.MYSTICAL_WORLD,
         name = "GTWoodProcessing Mystical World Integration",
         description = "Mystical World Integration Module")
public class MWorldModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        MWorldWoodRecipe.init();
    }
}
