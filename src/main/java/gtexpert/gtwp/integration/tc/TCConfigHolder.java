package gtexpert.gtwp.integration.tc;

import net.minecraftforge.common.config.Config;

import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.module.Modules;

@Config.LangKey(ModValues.MODID + ".config.integration.tc")
@Config(modid = ModValues.MODID,
        name = ModValues.MODID + "/integration/" + Modules.MODULE_TC,
        category = "Thaumcraft")
public class TCConfigHolder {}
