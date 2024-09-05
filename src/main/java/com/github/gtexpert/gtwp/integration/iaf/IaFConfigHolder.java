package com.github.gtexpert.gtwp.integration.iaf;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.iaf")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_IaF,
        category = "IceAndFire")
public class IaFConfigHolder {}
