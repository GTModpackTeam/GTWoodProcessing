package com.github.gtexpert.gtwp.integration.wizardry;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.wizardry.recipes.WizardryWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_WIZARDRY,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.WIZARDRY,
         name = "GTWoodProcessing Wizardry Integration",
         description = "Wizardry Integration Module")
public class WizardryModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        WizardryWoodRecipe.init();
    }
}
