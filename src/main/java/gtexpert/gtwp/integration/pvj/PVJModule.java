package gtexpert.gtwp.integration.pvj;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.api.modules.TModule;
import gtexpert.gtwp.api.util.Mods;
import gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import gtexpert.gtwp.integration.pvj.recipes.PVJWoodRecipe;
import gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_PVJ,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.PROJECT_VIBRANT_JOURNEYS,
         name = "GTWoodProcessing Project: Vibrant Journeys Integration",
         description = "Project: Vibrant Journeys Integration Module")
public class PVJModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        PVJWoodRecipe.init();
    }
}
