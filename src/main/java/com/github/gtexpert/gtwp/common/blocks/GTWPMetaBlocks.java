package com.github.gtexpert.gtwp.common.blocks;

import static gregtech.common.blocks.MetaBlocks.statePropertiesToString;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GTWPMetaBlocks {

    public static GTWPBlockMetalCasing GTWP_METAL_CASING;
    public static BlockSawmillConveyor BLOCK_SAWMILL_CONVEYOR;

    public static void init() {
        GTWP_METAL_CASING = new GTWPBlockMetalCasing();
        GTWP_METAL_CASING.setRegistryName("gtwp_metal_casing");
        BLOCK_SAWMILL_CONVEYOR = new BlockSawmillConveyor();
        BLOCK_SAWMILL_CONVEYOR.setRegistryName("sawmill_conveyor");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(GTWP_METAL_CASING);
        registerItemModel(BLOCK_SAWMILL_CONVEYOR);
    }

    @SideOnly(Side.CLIENT)
    private static void registerItemModel(Block block) {
        for (IBlockState state : block.getBlockState().getValidStates()) {
            // noinspection ConstantConditions
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                    block.getMetaFromState(state),
                    new ModelResourceLocation(block.getRegistryName(),
                            statePropertiesToString(state.getProperties())));
        }
    }
}
