package com.github.gtexpert.gtwp.integration.plants;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.plants")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_PLANTS,
        category = "Plants")
public class PlantsConfigHolder {}
