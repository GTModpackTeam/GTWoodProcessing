package com.github.gtexpert.gtwp.client;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

import gregtech.client.renderer.texture.cube.*;

import com.github.gtexpert.gtwp.api.ModValues;

@Mod.EventBusSubscriber(modid = ModValues.MODID, value = Side.CLIENT)
public class GTWPTextures {

    public static SimpleOverlayRenderer SAWMILL_CASING;
    public static OrientedOverlayRenderer SAWMILL_OVERLAY = new OrientedOverlayRenderer("machines/sawmill");

    public static void preInit() {
        SAWMILL_CASING = new SimpleOverlayRenderer("casings/sawmill_casing");
    }
}
