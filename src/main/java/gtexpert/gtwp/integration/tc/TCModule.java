package gtexpert.gtwp.integration.tc;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.api.modules.TModule;
import gtexpert.gtwp.api.util.Mods;
import gtexpert.gtwp.integration.GTWPIntegrationSubmodule;
import gtexpert.gtwp.integration.tc.recipes.TCWoodRecipe;
import gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_TC,
         containerID = ModValues.MODID,
         modDependencies = Mods.Names.THAUMCRAFT,
         name = "GTWoodProcessing Thaumcraft Integration",
         description = "Thaumcraft Integration Module")
public class TCModule extends GTWPIntegrationSubmodule {

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        TCWoodRecipe.init();
    }
}
