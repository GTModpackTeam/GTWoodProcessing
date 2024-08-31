package com.github.gtexpert.gtwp.integration.gtfo;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.gtfo")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_GTFO,
        category = "GregTech Food Option")
public class GTFOConfigHolder {}
