package com.github.gtexpert.gtwp.integration.gtfo;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.gtfo.loaders.recipes.GTFOWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_GTFO,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.GREGTECH_FOOD_OPTION,
         name = "GTWoodProcessing GregTech Food Option Integration",
         description = "GregTech Food Option Integration Module")
public class GTFOModule extends GTWPIntegrationSubmodule {

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(GTFOModule.class);
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        GTFOWoodRecipe.init();
    }
}
