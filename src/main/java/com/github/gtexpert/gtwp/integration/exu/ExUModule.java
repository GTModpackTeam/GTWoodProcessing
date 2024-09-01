package com.github.gtexpert.gtwp.integration.exu;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.exu.recipes.ExUWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_EXUTILITIES,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.EXTRA_UTILITIES,
         name = "GTWoodProcessing Extra Utilities 2 Integration",
         description = "Extra Utilities 2 Integration Module")
public class ExUModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        ExUWoodRecipe.init();
    }
}
