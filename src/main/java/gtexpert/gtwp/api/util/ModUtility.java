package gtexpert.gtwp.api.util;

import java.util.Random;

import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;

import gtexpert.gtwp.api.ModValues;

public class ModUtility {

    public static @NotNull ResourceLocation id(String path) {
        return new ResourceLocation(ModValues.MODID, path);
    }

    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            stringBuilder.append(random.nextInt(10));
        }

        return stringBuilder.toString();
    }
}
