package com.github.gtexpert.gtwp.integration.botania;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.module.Modules;

import net.minecraftforge.common.config.Config;

@Config.LangKey(ModValues.MODID + ".config.integration.botania")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_BOTANIA,
        category = "Botania")
public class BotaniaConfigHolder {
}
