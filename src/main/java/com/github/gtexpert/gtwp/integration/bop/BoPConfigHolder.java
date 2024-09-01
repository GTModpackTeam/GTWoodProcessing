package com.github.gtexpert.gtwp.integration.bop;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.biomesoplenty")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_BOP,
        category = "BiomesOPlenty")
public class BoPConfigHolder {}
