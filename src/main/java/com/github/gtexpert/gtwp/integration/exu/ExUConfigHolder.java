package com.github.gtexpert.gtwp.integration.exu;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.exu")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_EXUTILITIES,
        category = "ExtraUtilities")
public class ExUConfigHolder {}
