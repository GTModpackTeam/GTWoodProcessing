package gtexpert.gtwp.integration.binnies.extratrees;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.api.modules.TModule;
import gtexpert.gtwp.api.util.Mods;
import gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import gtexpert.gtwp.integration.binnies.extratrees.loaders.recipes.ExtraTreesWoodRecipe;
import gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_EXTREES,
         containerID = ModValues.MODID,
         modDependencies = { Mods.Names.FORESTRY, Mods.Names.EXTRA_TREES },
         name = "GTWoodProcessing Extra Trees(Binnie's Mods) Integration",
         description = "Extra Trees(Binnie's Mods) Integration Module")
public class ExtraTreesModule extends GTWPIntegrationSubmodule {

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        ExtraTreesWoodRecipe.init();
    }
}
