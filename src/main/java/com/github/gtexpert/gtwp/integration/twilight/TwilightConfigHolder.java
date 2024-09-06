package com.github.gtexpert.gtwp.integration.twilight;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.twilight")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_TWILIGHT,
        category = "TheTwilightForest")
public class TwilightConfigHolder {}
