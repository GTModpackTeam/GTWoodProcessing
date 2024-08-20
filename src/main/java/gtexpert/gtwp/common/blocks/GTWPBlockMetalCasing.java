package gtexpert.gtwp.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import org.jetbrains.annotations.NotNull;

import gregtech.api.block.VariantBlock;
import gregtech.api.items.toolitem.ToolClasses;

public class GTWPBlockMetalCasing extends VariantBlock<GTWPBlockMetalCasing.MetalCasingType> {

    public GTWPBlockMetalCasing() {
        super(net.minecraft.block.material.Material.IRON);
        setTranslationKey("gtwp_metal_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel(ToolClasses.WRENCH, 2);
        setDefaultState(getState(MetalCasingType.SAWMill));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum MetalCasingType implements IStringSerializable {

        SAWMill("sawmill_casing");

        private final String name;

        MetalCasingType(String name) {
            this.name = name;
        }

        @NotNull
        @Override
        public String getName() {
            return this.name;
        }
    }
}
