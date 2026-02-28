package com.github.gtexpert.gtwp.integration.plants;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.advrocketry.AdvancedRocketryModule;
import com.github.gtexpert.gtwp.integration.plants.recipes.PlantsWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_PLANTS,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.PLANTS,
         name = "GTWoodProcessing Plants Integration",
         description = "Plants Integration Module")
public class PlantsModule extends GTWPIntegrationSubmodule {

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(AdvancedRocketryModule.class);
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        PlantsWoodRecipe.init();
    }
}
