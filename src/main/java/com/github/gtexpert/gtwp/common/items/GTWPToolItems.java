package com.github.gtexpert.gtwp.common.items;

import gregtech.api.GTValues;
import gregtech.api.items.toolitem.*;
import gregtech.api.items.toolitem.IGTTool;
import gregtech.common.items.ToolItems;
import gregtech.common.items.tool.*;
import gregtech.core.sound.GTSoundEvents;

public class GTWPToolItems {

    private GTWPToolItems() {}

    public static IGTTool CHAINSAW_HV;
    public static IGTTool CHAINSAW_IV;

    public static void init() {
        CHAINSAW_HV = ToolItems.register(ItemGTTool.Builder.of(GTValues.MODID, "chainsaw_hv")
                .toolStats(b -> b.blockBreaking()
                        .efficiencyMultiplier(3.0F)
                        .attackDamage(5.0F).attackSpeed(-3.2F)
                        .brokenStack(ToolHelper.SUPPLY_POWER_UNIT_HV)
                        .behaviors(HarvestIceBehavior.INSTANCE, DisableShieldBehavior.INSTANCE,
                                TreeFellingBehavior.INSTANCE))
                .oreDict(ToolOreDict.toolAxe)
                .secondaryOreDicts(ToolOreDict.toolChainsaw)
                .sound(GTSoundEvents.CHAINSAW_TOOL, true)
                .toolClasses(ToolClasses.AXE)
                .electric(GTValues.HV));
        CHAINSAW_IV = ToolItems.register(ItemGTTool.Builder.of(GTValues.MODID, "chainsaw_iv")
                .toolStats(b -> b.blockBreaking()
                        .efficiencyMultiplier(4.0F)
                        .attackDamage(5.0F).attackSpeed(-3.2F)
                        .brokenStack(ToolHelper.SUPPLY_POWER_UNIT_IV)
                        .behaviors(HarvestIceBehavior.INSTANCE, DisableShieldBehavior.INSTANCE,
                                TreeFellingBehavior.INSTANCE))
                .oreDict(ToolOreDict.toolAxe)
                .secondaryOreDicts(ToolOreDict.toolChainsaw)
                .sound(GTSoundEvents.CHAINSAW_TOOL, true)
                .toolClasses(ToolClasses.AXE)
                .electric(GTValues.IV));
    }
}
