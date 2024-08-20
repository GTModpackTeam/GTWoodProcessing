package gtexpert.gtwp.integration;

import java.util.Collections;
import java.util.Set;

import net.minecraft.util.ResourceLocation;

import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import gtexpert.gtwp.api.util.ModUtility;
import gtexpert.gtwp.module.BaseModule;
import gtexpert.gtwp.module.Modules;

public class GTWPIntegrationSubmodule extends BaseModule {

    private static final Set<ResourceLocation> DEPENDENCY_UID = Collections.singleton(
            ModUtility.id(Modules.MODULE_INTEGRATION));

    @NotNull
    @Override
    public Logger getLogger() {
        return GTWPIntegrationModule.logger;
    }

    @NotNull
    @Override
    public Set<ResourceLocation> getDependencyUids() {
        return DEPENDENCY_UID;
    }
}
