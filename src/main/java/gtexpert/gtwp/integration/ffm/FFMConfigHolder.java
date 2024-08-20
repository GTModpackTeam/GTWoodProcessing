package gtexpert.gtwp.integration.ffm;

import net.minecraftforge.common.config.Config;

import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.ffm")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_FFM,
        category = "Forestry")
public class FFMConfigHolder {}
