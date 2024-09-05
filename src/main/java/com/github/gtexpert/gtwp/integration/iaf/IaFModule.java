package com.github.gtexpert.gtwp.integration.iaf;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.iaf.recipes.IaFWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_IaF,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.ICE_AND_FIRE,
         name = "GTWoodProcessing Ice and Fire: Dragons Integration",
         description = "Ice and Fire: Dragons Integration Module")
public class IaFModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        IaFWoodRecipe.init();
    }
}
