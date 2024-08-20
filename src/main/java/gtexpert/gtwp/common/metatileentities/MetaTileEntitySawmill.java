package gtexpert.gtwp.common.metatileentities;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.core.sound.GTSoundEvents;
import gtexpert.gtwp.api.recipes.GTWPRecipeMaps;
import gtexpert.gtwp.client.GTWPTextures;
import gtexpert.gtwp.common.blocks.GTWPBlockMetalCasing;
import gtexpert.gtwp.common.blocks.GTWPMetaBlocks;

public class MetaTileEntitySawmill extends RecipeMapMultiblockController {

    public MetaTileEntitySawmill(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTWPRecipeMaps.SAWMILL_RECIPES);
    }

    @Override
    public @NotNull MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntitySawmill(metaTileEntityId);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        TraceabilityPredicate casing = states(getCasingState()).setMinGlobalLimited(14);
        TraceabilityPredicate abilities = autoAbilities(true, false, true, true, true, false, false);
        return FactoryBlockPattern.start()
                .aisle("XCX", "X#X", "X X")
                .aisle(" C ", " # ", "XXX")
                .aisle(" C ", " # ", "X X")
                .aisle(" C ", " # ", "XXX")
                .aisle("XCX", "S#X", "X X")
                .where('S', selfPredicate())
                .where('X', casing.or(abilities))
                .where('C', blocks(GTWPMetaBlocks.BLOCK_SAWMILL_CONVEYOR))
                .where('#', air())
                .where(' ', any())
                .build();
    }

    @Override
    public boolean allowsExtendedFacing() {
        return false;
    }

    @Override
    public boolean allowsFlip() {
        return false;
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public boolean canBeDistinct() {
        return true;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return GTWPTextures.SAWMILL_CASING;
    }

    protected IBlockState getCasingState() {
        return GTWPMetaBlocks.GTWP_METAL_CASING.getState(GTWPBlockMetalCasing.MetalCasingType.SAWMill);
    }

    @Override
    public SoundEvent getBreakdownSound() {
        return GTSoundEvents.BREAKDOWN_ELECTRICAL;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, @NotNull List<String> tooltip,
                               boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        tooltip.add(I18n.format("gtwp.machine.sawmill.tooltip.1"));
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return GTWPTextures.SAWMILL_OVERLAY;
    }
}
