package com.github.gtexpert.gtwp.integration.natura;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.api.modules.TModule;
import com.github.gtexpert.gtwp.api.util.Mods;
import com.github.gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import com.github.gtexpert.gtwp.integration.natura.recipes.NatureWoodRecipe;
import com.github.gtexpert.gtwp.module.Modules;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@TModule(
        moduleID = Modules.MODULE_NATURA,
        containerID = ModValues.MODID,
        modDependencies = Mods.Names.NATURA,
        name = "GTWoodProcessing Natura Integration",
        description = "Natura Integration Module")
public class NatureModule extends GTWPIntegrationSubmodule {

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        NatureWoodRecipe.init();
    }
}
