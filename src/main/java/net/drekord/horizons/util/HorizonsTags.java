package net.drekord.horizons.util;

import net.minecraft.util.Identifier;
import net.drekord.horizons.HorizonsMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class HorizonsTags {
    public static class Blocks {

        public static final TagKey<Block> HAND_MINEABLE = createTag("mineable/hand_mineable");
        public static final TagKey<Block> POINTER_STICK_MINEABLE = createTag("mineable/pointer_stick_mineable");
        public static final TagKey<Block> SHARP_STONE_MINEABLE = createTag("mineable/sharp_stone_mineable");
        public static final TagKey<Block> PICKAXE_MINEABLE = createTag("mineable/pickaxe_mineable");
        public static final TagKey<Block> AXE_MINEABLE = createTag("mineable/axe_mineable");
        public static final TagKey<Block> SHOVEL_MINEABLE = createTag("mineable/shovel_mineable");
        public static final TagKey<Block> HOE_MINEABLE = createTag("mineable/hoe_mineable");
        public static final TagKey<Block> SWORD_MINEABLE = createTag("mineable/sword_mineable");
        public static final TagKey<Block> SHEARS_MINEABLE = createTag("mineable/shears_mineable");


        public static final TagKey<Block> TREE_LOGS = createTag("tree_logs");
        public static final TagKey<Block> WOODEN_PLANKS = createTag("wooden_planks");
        public static final TagKey<Block> WOODEN_STAIRS = createTag("wooden_stairs");
        public static final TagKey<Block> WOODEN_SLAB = createTag("wooden_slab");
        public static final TagKey<Block> WOODEN_FENCES = createTag("wooden_fences");
        public static final TagKey<Block> WOODEN_FENCE_GATES = createTag("wooden_fence_gates");
        public static final TagKey<Block> WOODEN_DOORS = createTag("wooden_doors");
        public static final TagKey<Block> WOODEN_TRAPDOORS = createTag("wooden_trapdoors");
        public static final TagKey<Block> WOODEN_PRESSURE_PLATE = createTag("wooden_pressure_plate");
        public static final TagKey<Block> WOODEN_BUTTONS = createTag("wooden_buttons");
        public static final TagKey<Block> WOODEN_SIGNS = createTag("wooden_signs");
        public static final TagKey<Block> WOODEN_HANGING_SIGNS = createTag("wooden_hanging_signs");

        public static final TagKey<Block> STONE_BLOCKS = createTag("stone_blocks");
        public static final TagKey<Block> MOSSY_STONE_BLOCKS = createTag("mossy_stone_blocks");
        public static final TagKey<Block> GRANITE_BLOCKS = createTag("granite_blocks");
        public static final TagKey<Block> ANDESITE_BLOCKS = createTag("andesite_blocks");
        public static final TagKey<Block> DIORITE_BLOCKS = createTag("diorite_blocks");
        public static final TagKey<Block> DEEPSLATE_BLOCKS = createTag("deepslate_blocks");
        public static final TagKey<Block> TUFF_BLOCKS = createTag("tuff_blocks");
        public static final TagKey<Block> BRICKS_BLOCKS = createTag("bricks_blocks");
        public static final TagKey<Block> PACKED_MUD_BLOCKS = createTag("packed_mud_blocks");
        public static final TagKey<Block> RESIN_BLOCKS = createTag("resin_blocks");
        public static final TagKey<Block> SANDSTONE_BLOCKS = createTag("sandstone_blocks");
        public static final TagKey<Block> PRISMARINE_BLOCKS = createTag("prismarine_blocks");
        public static final TagKey<Block> NETHER_BLOCKS = createTag("nether_blocks");
        public static final TagKey<Block> NETHERRACK_BLOCKS = createTag("netherrack_blocks");
        public static final TagKey<Block> RED_NETHER_BLOCKS = createTag("red_nether_blocks");
        public static final TagKey<Block> BASALT_BLOCKS = createTag("basalt_blocks");
        public static final TagKey<Block> BLACKSTONE_BLOCKS = createTag("blackstone_blocks");
        public static final TagKey<Block> END_BLOCKS = createTag("end_blocks");
        public static final TagKey<Block> END_STONE_BLOCKS = createTag("end_stone_blocks");
        public static final TagKey<Block> PURPUR_BLOCKS = createTag("purpur_blocks");
        public static final TagKey<Block> CAVE_BLOCKS = createTag("cave_blocks");
        public static final TagKey<Block> DRIPSTONE = createTag("dripstone");
        public static final TagKey<Block> POINTED_DRIPSTONE = createTag("pointed_dripstone");
        public static final TagKey<Block> OBSIDIAN = createTag("obsidian");
        public static final TagKey<Block> ORE_BLOCKS = createTag("ore_blocks");
        public static final TagKey<Block> RAW_ORE_BLOCKS = createTag("raw_ore_blocks");
        public static final TagKey<Block> METALLIC_BLOCKS = createTag("metallic_blocks");
        public static final TagKey<Block> IRON_BLOCKS = createTag("iron_blocks");
        public static final TagKey<Block> QUARTZ_BLOCKS = createTag("quartz_blocks");
        public static final TagKey<Block> AMETHYST_BLOCKS = createTag("amethyst_blocks");
        public static final TagKey<Block> ALL_COPPER_BLOCKS = createTag("all_copper_blocks");
        public static final TagKey<Block> COPPER_BLOCKS = createTag("copper_blocks");
        public static final TagKey<Block> WAXED_COPPER_BLOCKS = createTag("waxed_copper_blocks");
        public static final TagKey<Block> COPPER = createTag("copper");
        public static final TagKey<Block> EXPOSED_COPPER = createTag("exposed_copper");
        public static final TagKey<Block> WEATHERED_COPPER = createTag("weathered_copper");
        public static final TagKey<Block> OXIDIZED_COPPER = createTag("oxidized_copper");
        public static final TagKey<Block> WAXED_COPPER = createTag("waxed_copper");
        public static final TagKey<Block> WAXED_EXPOSED_COPPER = createTag("waxed_exposed_copper");
        public static final TagKey<Block> WAXED_WEATHERED_COPPER = createTag("waxed_weathered_copper");
        public static final TagKey<Block> WAXED_OXIDIZED_COPPER = createTag("waxed_oxidized_copper");
        public static final TagKey<Block> WOOL = createTag("wool");
        public static final TagKey<Block> WOOL_CARPET = createTag("wool_carpet");
        public static final TagKey<Block> TERRACOTTA_BLOCKS = createTag("terracotta_blocks");
        public static final TagKey<Block> GLAZED_TERRACOTTA_BLOCKS = createTag("glazed_terracotta_blocks");
        public static final TagKey<Block> CONCRETE_BLOCKS = createTag("concrete_blocks");
        public static final TagKey<Block> DRY_CONCRETE = createTag("dry_concrete");
        public static final TagKey<Block> CONCRETE_POWDER = createTag("concrete_powder");
        public static final TagKey<Block> ALL_GLASS_BLOCK = createTag("glass");
        public static final TagKey<Block> STAINED_GLASS = createTag("stained_glass");
        public static final TagKey<Block> STAINED_GLASS_PANE = createTag("stained_glass_pane");
        public static final TagKey<Block> SHULKER_BOXES = createTag("shulker_boxes");
        public static final TagKey<Block> BEDS = createTag("beds");
        public static final TagKey<Block> CANDLE = createTag("candle");
        public static final TagKey<Block> BANNERS = createTag("banners");
        public static final TagKey<Block> GROUND_BLOCKS = createTag("ground_blocks");
        public static final TagKey<Block> ICE_BLOCKS = createTag("ice_blocks");
        public static final TagKey<Block> SOUL_BLOCKS = createTag("soul_blocks");
        public static final TagKey<Block> MUSHROOMS_BLOCKS = createTag("mushrooms_blocks");
        public static final TagKey<Block> LEAVES_BLOCKS = createTag("leaves_blocks");
        public static final TagKey<Block> SAPLINGS_BLOCKS = createTag("saplings_blocks");
        public static final TagKey<Block> CROPS = createTag("saplings_blocks");
        public static final TagKey<Block> PLANTS = createTag("plants_blocks");
        public static final TagKey<Block> PLANT_BLOCK = createTag("plant_block");
        public static final TagKey<Block> SCULK_BLOCKS = createTag("sculk_blocks");
        public static final TagKey<Block> SPECIAL_SCULK_BLOCKS = createTag("special_sculk_blocks");
        public static final TagKey<Block> PRESSURE_PLATES = createTag("pressure_plates");
        public static final TagKey<Block> FROGLIGHT_BLOCKS = createTag("froglight_blocks");
        public static final TagKey<Block> SOLID_WORKSTATIONS = createTag("solid_workstations");
        public static final TagKey<Block> OTHER_WORKSTATIONS = createTag("other_workstations");
        public static final TagKey<Block> FRAGILE_BLOCKS = createTag("fragile_blocks");
        public static final TagKey<Block> STICKY_BLOCKS = createTag("sticky_blocks");
        public static final TagKey<Block> SKULL_BLOCKS = createTag("skull_blocks");





        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(HorizonsMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TOOLS = createTag("tools");
        public static final TagKey<Item> POINTY_STICKS = createTag("pointy_sticks");
        public static final TagKey<Item> SHARP_STONES = createTag("sharp_stones");
        public static final TagKey<Item> AXE = createTag("axe");
        public static final TagKey<Item> PICKAXE = createTag("pickaxe");
        public static final TagKey<Item> SHOVEL = createTag("shovel");
        public static final TagKey<Item> HOE = createTag("hoe");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(HorizonsMod.MOD_ID, name));
        }
    }
}
