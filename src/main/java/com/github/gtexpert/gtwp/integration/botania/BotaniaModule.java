package com.github.gtexpert.gtwp.integration.botania;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.botania.recipes.BotaniaWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_BOTANIA,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.BOTANIA,
         name = "GTWoodProcessing Botania Integration",
         description = "Botania Integration Module")
public class BotaniaModule extends GTWPIntegrationSubmodule {

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(BotaniaModule.class);
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        BotaniaWoodRecipe.init();
    }
}
