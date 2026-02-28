package com.github.gtexpert.gtwp.integration.tc;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.tc.recipes.TCWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_TC,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.THAUMCRAFT,
         name = "GTWoodProcessing Thaumcraft Integration",
         description = "Thaumcraft Integration Module")
public class TCModule extends GTWPIntegrationSubmodule {

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(TCModule.class);
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        TCWoodRecipe.init();
    }
}
