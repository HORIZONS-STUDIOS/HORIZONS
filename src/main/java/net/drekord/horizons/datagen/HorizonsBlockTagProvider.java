package net.drekord.horizons.datagen;

import net.drekord.horizons.util.HorizonsTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class HorizonsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public HorizonsBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(HorizonsTags.Blocks.HAND_MINEABLE)
                .add(Blocks.GRASS_BLOCK).add(Blocks.DIRT).add(Blocks.ROOTED_DIRT).add(Blocks.COARSE_DIRT).add(Blocks.PODZOL).add(Blocks.MYCELIUM).add(Blocks.SAND)
                .add(Blocks.GRAVEL)
                .add(Blocks.DEAD_BUSH).add(Blocks.BUSH).add(Blocks.SHORT_GRASS).add(Blocks.TALL_GRASS).add(Blocks.SEAGRASS).add(Blocks.TALL_SEAGRASS).add(Blocks.KELP)
                .add(Blocks.KELP_PLANT)
                .add(Blocks.OAK_LEAVES).add(Blocks.BIRCH_LEAVES).add(Blocks.SPRUCE_LEAVES).add(Blocks.DARK_OAK_LEAVES).add(Blocks.PALE_OAK_LEAVES).add(Blocks.JUNGLE_LEAVES)
                .add(Blocks.CHERRY_LEAVES).add(Blocks.ACACIA_LEAVES).add(Blocks.AZALEA_LEAVES).add(Blocks.FLOWERING_AZALEA_LEAVES).add(Blocks.MANGROVE_LEAVES)
        ;
        getOrCreateTagBuilder(HorizonsTags.Blocks.POINTER_STICK_MINEABLE)
                .add(Blocks.STONE).add(Blocks.GRANITE).add(Blocks.ANDESITE).add(Blocks.DIORITE).add(Blocks.GRAVEL).add(Blocks.COARSE_DIRT).add(Blocks.ROOTED_DIRT)
        ;
        getOrCreateTagBuilder(HorizonsTags.Blocks.SHARP_STONE_MINEABLE)
                .add(Blocks.STONE).add(Blocks.GRANITE).add(Blocks.ANDESITE).add(Blocks.DIORITE)
                .add(Blocks.DEAD_BUSH).add(Blocks.BUSH).add(Blocks.SHORT_GRASS).add(Blocks.TALL_GRASS).add(Blocks.SEAGRASS).add(Blocks.TALL_SEAGRASS).add(Blocks.KELP)
                .add(Blocks.KELP_PLANT)
                .add(Blocks.OAK_LEAVES).add(Blocks.BIRCH_LEAVES).add(Blocks.SPRUCE_LEAVES).add(Blocks.DARK_OAK_LEAVES).add(Blocks.PALE_OAK_LEAVES).add(Blocks.JUNGLE_LEAVES)
                .add(Blocks.CHERRY_LEAVES).add(Blocks.ACACIA_LEAVES).add(Blocks.AZALEA_LEAVES).add(Blocks.FLOWERING_AZALEA_LEAVES).add(Blocks.MANGROVE_LEAVES)
        ;

        getOrCreateTagBuilder(HorizonsTags.Blocks.PICKAXE_MINEABLE)

        ;
        getOrCreateTagBuilder(HorizonsTags.Blocks.AXE_MINEABLE)

        ;
        getOrCreateTagBuilder(HorizonsTags.Blocks.SHOVEL_MINEABLE)

        ;
        getOrCreateTagBuilder(HorizonsTags.Blocks.HOE_MINEABLE)

        ;
        getOrCreateTagBuilder(HorizonsTags.Blocks.SWORD_MINEABLE)

        ;
        getOrCreateTagBuilder(HorizonsTags.Blocks.SHEARS_MINEABLE)

        ;
    }
}
