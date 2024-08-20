package gtexpert.gtwp.loaders.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.ore.OrePrefix.*;

import net.minecraft.init.Items;

import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.ConfigHolder;
import gregtech.common.items.MetaItems;
import gregtech.common.metatileentities.MetaTileEntities;
import gtexpert.gtwp.common.blocks.GTWPBlockMetalCasing;
import gtexpert.gtwp.common.blocks.GTWPMetaBlocks;
import gtexpert.gtwp.common.metatileentities.GTWPMetaTileEntities;

public class GTWPRecipe {

    public static void init() {
        // Sawmill
        ModHandler.addShapedRecipe(true, "gtwp.machine.sawmill",
                GTWPMetaTileEntities.SAWMILL.getStackForm(), "SBs", "MHM", "COC",
                'S', new UnificationEntry(screw, Materials.Steel),
                'B', new UnificationEntry(toolHeadBuzzSaw, Materials.Steel),
                'M', MetaItems.ELECTRIC_MOTOR_MV.getStackForm(),
                'H', MetaTileEntities.HULL[MV].getStackForm(),
                'C', new UnificationEntry(circuit, MarkerMaterials.Tier.MV),
                'O', MetaItems.CONVEYOR_MODULE_MV.getStackForm());

        // Sawmill Conveyor
        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .input(MetaItems.CONVEYOR_MODULE_MV, 1)
                .input(frameGt, Materials.TreatedWood, 1)
                .input(Items.LEATHER, 3)
                .fluidInputs(Materials.Glue.getFluid(100))
                .output(GTWPMetaBlocks.BLOCK_SAWMILL_CONVEYOR, 1)
                .duration(100).EUt(VA[MV])
                .buildAndRegister();

        // Treated Wood Machine Casing
        ModHandler.addShapedRecipe(true, "casing_treated_wood",
                GTWPMetaBlocks.GTWP_METAL_CASING.getItemVariant(GTWPBlockMetalCasing.MetalCasingType.SAWMill,
                        ConfigHolder.recipes.casingsPerCraft),
                "PhP", "PFP", "PwP",
                'P', new UnificationEntry(plate, Materials.TreatedWood),
                'F', new UnificationEntry(frameGt, Materials.TreatedWood));
        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .circuitMeta(6)
                .input(plate, Materials.TreatedWood, 6)
                .input(frameGt, Materials.TreatedWood, 1)
                .outputs(GTWPMetaBlocks.GTWP_METAL_CASING
                        .getItemVariant(GTWPBlockMetalCasing.MetalCasingType.SAWMill, 2))
                .duration(50).EUt(VH[LV])
                .buildAndRegister();
    }
}
