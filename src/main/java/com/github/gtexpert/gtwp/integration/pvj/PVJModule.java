package com.github.gtexpert.gtwp.integration.pvj;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.pvj.recipes.PVJWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_PVJ,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.PROJECT_VIBRANT_JOURNEYS,
         name = "GTWoodProcessing Project: Vibrant Journeys Integration",
         description = "Project: Vibrant Journeys Integration Module")
public class PVJModule extends GTWPIntegrationSubmodule {

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(PVJModule.class);
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        PVJWoodRecipe.init();
    }
}
