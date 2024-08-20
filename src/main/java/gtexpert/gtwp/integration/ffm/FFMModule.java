package gtexpert.gtwp.integration.ffm;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.api.modules.TModule;
import gtexpert.gtwp.api.util.Mods;
import gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import gtexpert.gtwp.integration.ffm.loaders.recipes.FFMWoodRecipe;
import gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_FFM,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.FORESTRY,
         name = "GTWoodProcessing Forestry For Minecraft Integration",
         description = "Forestry For Minecraft Integration Module")
public class FFMModule extends GTWPIntegrationSubmodule {

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        FFMWoodRecipe.init();
    }
}
