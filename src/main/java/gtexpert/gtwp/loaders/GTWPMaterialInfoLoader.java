package gtexpert.gtwp.loaders;

import gregtech.api.GTValues;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.stack.ItemMaterialInfo;
import gregtech.api.unification.stack.MaterialStack;
import gregtech.common.ConfigHolder;
import gtexpert.gtwp.common.blocks.GTWPBlockMetalCasing;
import gtexpert.gtwp.common.blocks.GTWPMetaBlocks;

public class GTWPMaterialInfoLoader {

    public static void init() {
        OreDictUnifier.registerOre(
                GTWPMetaBlocks.GTWP_METAL_CASING.getItemVariant(GTWPBlockMetalCasing.MetalCasingType.SAWMill),
                new ItemMaterialInfo(new MaterialStack(Materials.TreatedWood,
                        (GTValues.M * 8) / ConfigHolder.recipes.casingsPerCraft)));
    }
}
