package gtexpert.gtwp.integration.pvj;

import net.minecraftforge.common.config.Config;

import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.pvj")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_PVJ,
        category = "ProjectVibrantJourneys")
public class PVJConfigHolder {}
