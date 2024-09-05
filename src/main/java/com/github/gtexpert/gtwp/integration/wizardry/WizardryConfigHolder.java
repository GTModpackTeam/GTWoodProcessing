package com.github.gtexpert.gtwp.integration.wizardry;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.wizardry")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_WIZARDRY,
        category = "Wizardry")
public class WizardryConfigHolder {}
