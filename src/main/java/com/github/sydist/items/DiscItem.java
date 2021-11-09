package com.github.sydist.items;

import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

public class DiscItem extends MusicDiscItem {
    private boolean powered = false;

    public DiscItem(int comparatorOutput, SoundEvent sound, Settings settings, boolean powered) {
        super(comparatorOutput, sound, settings);
        this.powered = powered;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return powered;
    }
}
