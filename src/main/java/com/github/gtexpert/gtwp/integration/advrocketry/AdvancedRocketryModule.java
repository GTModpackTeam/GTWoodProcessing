package com.github.gtexpert.gtwp.integration.advrocketry;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.advrocketry.recipes.AdvancedRocketryWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_ADVROCKETRY,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.ADVANCED_ROCKETRY,
         name = "GTWoodProcessing Advanced Rocketry Integration",
         description = "Advanced Rocketry Integration Module")
public class AdvancedRocketryModule extends GTWPIntegrationSubmodule {

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(AdvancedRocketryModule.class);
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        AdvancedRocketryWoodRecipe.init();
    }
}
