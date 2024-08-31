package gtexpert.gtwp.integration;

import java.util.Collections;
import java.util.List;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import gtexpert.gtwp.api.ModValues;
import gtexpert.gtwp.api.modules.TModule;
import gtexpert.gtwp.module.BaseModule;
import gtexpert.gtwp.module.Modules;

@TModule(
         moduleID = Modules.MODULE_INTEGRATION,
         containerID = ModValues.MODID,
         name = "GTWoodProcessing Integration",
         description = "General GTWoodProcessing Integration Module. Disabling this disables all integration modules.")
public class GTWPIntegrationModule extends BaseModule {

    public static final Logger logger = LogManager.getLogger("GTWoodProcessing Mod Integration");

    @NotNull
    @Override
    public Logger getLogger() {
        return logger;
    }

    @NotNull
    @Override
    public List<Class<?>> getEventBusSubscribers() {
        return Collections.singletonList(GTWPIntegrationModule.class);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }
}
