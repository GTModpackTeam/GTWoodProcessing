package com.github.gtexpert.gtwp.integration.mworld;

import net.minecraftforge.common.config.Config;

import com.github.gtexpert.gtwp.api.ModValues;
import com.github.gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.mworld")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_MWORLD,
        category = "MysticalWorld")
public class MWorldConfigHolder {}
