package com.github.sydist;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public abstract class Sounds {
    private Sounds() {
        throw new IllegalStateException("Utility class");
    }

    public static final SoundEvent MUS_STORMFEST = new SoundEvent(new Identifier(Main.MOD_ID, "music_disc.stormfest"));
}
