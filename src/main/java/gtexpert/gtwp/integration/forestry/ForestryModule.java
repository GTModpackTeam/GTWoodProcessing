package gtexpert.gtwp.integration.forestry;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.api.modules.TModule;
import gtexpert.gtwp.api.util.Mods;
import gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import gtexpert.gtwp.integration.forestry.loaders.recipes.ForestryWoodRecipe;
import gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_FORESTRY,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.FORESTRY,
         name = "GTWoodProcessing Forestry Integration",
         description = "Forestry Integration Module")
public class ForestryModule extends GTWPIntegrationSubmodule {

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        ForestryWoodRecipe.init();
    }
}
