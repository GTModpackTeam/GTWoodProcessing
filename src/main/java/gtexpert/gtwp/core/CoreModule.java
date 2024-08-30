package gtexpert.gtwp.core;

import static gtexpert.gtwp.GTWPMod.createItemBlock;
import static gtexpert.gtwp.common.blocks.GTWPMetaBlocks.BLOCK_SAWMILL_CONVEYOR;
import static gtexpert.gtwp.common.blocks.GTWPMetaBlocks.GTWP_METAL_CASING;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.registries.IForgeRegistry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import gregtech.api.block.VariantItemBlock;
import gregtech.loaders.recipe.RecyclingRecipes;
import gtexpert.gtwp.Tags;
import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.api.modules.IModule;
import gtexpert.gtwp.api.modules.TModule;
import gtexpert.gtwp.common.CommonProxy;
import gtexpert.gtwp.common.blocks.GTWPMetaBlocks;
import gtexpert.gtwp.common.items.GTWPToolItems;
import gtexpert.gtwp.common.metatileentities.GTWPMetaTileEntities;
import gtexpert.gtwp.loaders.GTWPMaterialInfoLoader;
import gtexpert.gtwp.loaders.recipe.GTWPRecipe;
import gtexpert.gtwp.loaders.recipe.GTWPWoodRecipe;
import gtexpert.gtwp.loaders.recipe.handlers.GTWPToolRecipeHandler;
import gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_CORE,
         containerID = ModValues.MODID,
         name = "GTWPMod Core",
         description = "Core of GTWPMod",
         coreModule = true)
public class CoreModule implements IModule {

    public static final Logger logger = LogManager.getLogger(Tags.MODNAME + " Core");
    @SidedProxy(modId = ModValues.MODID,
                clientSide = "gtexpert.gtwp.client.ClientProxy",
                serverSide = "gtexpert.gtwp.common.CommonProxy")
    public static CommonProxy proxy;

    @Override
    public @NotNull Logger getLogger() {
        return logger;
    }

    @Override
    public void construction(FMLConstructionEvent event) {}

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

        GTWPMetaBlocks.init();
        GTWPToolItems.init();
    }

    @Override
    public void init(FMLInitializationEvent event) {}

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        RecyclingRecipes.init();
    }

    @Override
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();

        registry.register(GTWP_METAL_CASING);
        registry.register(BLOCK_SAWMILL_CONVEYOR);
    }

    @Override
    public void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(createItemBlock(GTWP_METAL_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(BLOCK_SAWMILL_CONVEYOR, ItemBlock::new));
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        GTWPToolRecipeHandler.register();
        GTWPMaterialInfoLoader.init();
        GTWPMetaTileEntities.init();
    }

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        GTWPRecipe.init();
        GTWPWoodRecipe.init();
    }
}
