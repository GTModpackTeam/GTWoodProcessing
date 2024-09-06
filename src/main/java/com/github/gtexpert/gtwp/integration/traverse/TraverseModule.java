package com.github.gtexpert.gtwp.integration.traverse;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.traverse.recipes.TraverseWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_TRAVERES,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.TRAVERES,
         name = "GTWoodProcessing Traverse Integration",
         description = "Traverse Integration Module")
public class TraverseModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        TraverseWoodRecipe.init();
    }
}
