package com.github.gtexpert.gtwp.integration.ids;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.ids.recipes.IDsWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_IDS,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.INTERGRATED_DYNAMICS,
         name = "GTWoodProcessing Integrated Dynamics Integration",
         description = "Integrated Dynamics Integration Module")
public class IDsModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        IDsWoodRecipe.init();
    }
}
