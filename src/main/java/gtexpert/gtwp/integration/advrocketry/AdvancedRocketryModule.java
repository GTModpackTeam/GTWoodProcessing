package gtexpert.gtwp.integration.advrocketry;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.api.modules.TModule;
import gtexpert.gtwp.api.util.Mods;
import gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import gtexpert.gtwp.integration.advrocketry.recipes.AdvancedRocketryWoodRecipe;
import gtexpert.gtwp.module.Modules;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@TModule(
         moduleID = Modules.MODULE_ADVROCKETRY,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.ADVANCED_ROCKETRY,
         name = "GTWoodProcessing Advanced Rocketry Integration",
         description = "Advanced Rocketry Integration Module")
public class AdvancedRocketryModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        AdvancedRocketryWoodRecipe.init();
    }
}
