package gtexpert.gtwp.module;

import java.util.Collections;
import java.util.Set;

import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;

import gtexpert.gtwp.api.modules.IModule;
import gtexpert.gtwp.api.util.ModUtility;

public abstract class BaseModule implements IModule {

    @NotNull
    @Override
    public Set<ResourceLocation> getDependencyUids() {
        return Collections.singleton(ModUtility.id(Modules.MODULE_CORE));
    }
}
