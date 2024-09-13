package com.github.gtexpert.gtwp.integration.natura;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.natura")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_NATURA,
        category = "Natura")
public class NaturaConfigHolder {}
