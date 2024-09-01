package com.github.gtexpert.gtwp.integration.roots;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.roots")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_ROOTS,
        category = "Roots")
public class RootsConfigHolder {}
