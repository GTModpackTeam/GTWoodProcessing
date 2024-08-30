package gtexpert.gtwp.integration.forestry;

import net.minecraftforge.common.config.Config;

import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.forestry")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_FORESTRY,
        category = "Forestry")
public class ForestryConfigHolder {}
