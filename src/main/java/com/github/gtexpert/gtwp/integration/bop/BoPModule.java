package com.github.gtexpert.gtwp.integration.bop;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.bop.recipes.BoPWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_BOP,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.BIOMES_O_PLENTY,
         name = "GTWoodProcessing Biomes O' Plenty Integration",
         description = "Biomes O' Plenty Integration Module")
public class BoPModule extends GTWPIntegrationSubmodule {

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(BoPModule.class);
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        BoPWoodRecipe.init();
    }
}
