package net.drekord.horizons.util;

import net.minecraft.util.Identifier;
import net.drekord.horizons.HorizonsMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class HorizonsTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_POINTER_STICK = createTag("needs_pointer_stick");
        public static final TagKey<Block> POINTER_STICK_MINEABLE = createTag("pointer_stick_mineable");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(HorizonsMod.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(HorizonsMod.MOD_ID, name));
        }
    }
}
