package gtexpert.gtwp.integration.gtfo;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.api.modules.TModule;
import gtexpert.gtwp.api.util.Mods;
import gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import gtexpert.gtwp.integration.gtfo.loaders.recipes.GTFOWoodRecipe;
import gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_GTFO,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.GREGTECH_FOOD_OPTION,
         name = "GTWoodProcessing GregTech Food Option Integration",
         description = "GregTech Food Option Integration Module")
public class GTFOModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        GTFOWoodRecipe.init();
    }
}
