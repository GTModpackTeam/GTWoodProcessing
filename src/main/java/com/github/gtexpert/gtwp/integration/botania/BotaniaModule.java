package com.github.gtexpert.gtwp.integration.botania;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.bop.recipes.BoPWoodRecipe;
import com.github.gtexpert.gtwp.integration.botania.recipes.BotaniaWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

@TModule(
        moduleID = Modules.MODULE_BOTANIA,
        containerID = ModValues.MODID,
        modDependencies = Mods.Names.BOTANIA,
        name = "GTWoodProcessing Botania Integration",
        description = "Botania Integration Module")
public class BotaniaModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        BotaniaWoodRecipe.init();
    }
}
