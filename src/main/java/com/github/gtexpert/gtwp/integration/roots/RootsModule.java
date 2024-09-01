package com.github.gtexpert.gtwp.integration.roots;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.roots.recipes.RootsWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_ROOTS,
         containerID = ModValues.MODID,
         modDependencies = { Mods.Names.MYSTICAL_WORLD, Mods.Names.ROOTS },
         name = "GTWoodProcessing Roots Integration",
         description = "Roots Things Integration Module")
public class RootsModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        RootsWoodRecipe.init();
    }
}
