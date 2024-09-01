package com.github.gtexpert.gtwp.integration.rthings;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.rthings")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_RTHINGS,
        category = "RandomThings")
public class RThingsConfigHolder {}
