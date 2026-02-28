package com.github.gtexpert.gtwp.integration.rustic;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.rustic.recipes.RusticWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_RUSTIC,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.RUSTIC,
         name = "GTWoodProcessing Rustic Integration",
         description = "Rustic Integration Module")
public class RusticModule extends GTWPIntegrationSubmodule {

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(RusticModule.class);
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        RusticWoodRecipe.init();
    }
}
