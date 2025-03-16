package com.github.gtexpert.gtwp.integration.natura;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.natura.recipes.NaturaWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_NATURA,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.NATURA,
         name = "GTWoodProcessing Natura Integration",
         description = "Natura Integration Module")
public class NaturaModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        NaturaWoodRecipe.init();
    }
}
