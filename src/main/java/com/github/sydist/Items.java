package com.github.sydist;

import com.github.sydist.items.DiscItem;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public abstract class Items {
    private Items() {
        throw new IllegalStateException("Utility class");
    }

    public static final DiscItem CHARGED_MUSIC_DISC_STORMFEST = new DiscItem(15, 
    Sounds.MUS_STORMFEST, 
    new Settings().group(ItemGroup.MISC).rarity(Rarity.EPIC).maxCount(1), true);
    
    public static final DiscItem MUSIC_DISC_STORMFEST = new DiscItem(15, 
    Sounds.MUS_STORMFEST, 
    new Settings().rarity(Rarity.RARE).maxCount(1), false);

    private static DiscItem register(String name, DiscItem item) {
		return Registry.register(Registry.ITEM, 
        new Identifier(Main.MOD_ID, name),
        item);
    }

    public static void registerAll() {
        register("charged_music_disc_stormfest", CHARGED_MUSIC_DISC_STORMFEST);
		register("music_disc_stormfest", MUSIC_DISC_STORMFEST);
    }
}
