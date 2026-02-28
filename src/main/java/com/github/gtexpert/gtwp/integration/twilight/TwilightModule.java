package com.github.gtexpert.gtwp.integration.twilight;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.twilight.recipes.TwilightWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_TWILIGHT,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.TWILIGHT_FOREST,
         name = "GTWoodProcessing The Twilight Forest Integration",
         description = "The Twilight Forest Integration Module")
public class TwilightModule extends GTWPIntegrationSubmodule {

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(TwilightModule.class);
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        TwilightWoodRecipe.init();
    }
}
