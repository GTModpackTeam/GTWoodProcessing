package com.github.gtexpert.gtwp.integration.binnies.extratrees;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.binnies.extratrees.loaders.recipes.ExtraTreesWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_EXTREES,
         containerID = ModValues.MODID,
         modDependencies = { Mods.Names.FORESTRY, Mods.Names.EXTRA_TREES },
         name = "GTWoodProcessing Extra Trees(Binnie's Mods) Integration",
         description = "Extra Trees(Binnie's Mods) Integration Module")
public class ExtraTreesModule extends GTWPIntegrationSubmodule {

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(ExtraTreesModule.class);
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        ExtraTreesWoodRecipe.init();
    }
}
