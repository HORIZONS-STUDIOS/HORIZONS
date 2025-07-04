package net.drekord.horizons.datagen;

import net.drekord.horizons.common.items.HorizonsItems;
import net.drekord.horizons.util.HorizonsTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class HorizonsItemTagProvider extends FabricTagProvider.ItemTagProvider {
        public HorizonsItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
                getOrCreateTagBuilder(HorizonsTags.Items.TOOLS)
                        .add(Items.STONE_AXE)
                        .add(Items.STONE_HOE)
                        .add(Items.STONE_PICKAXE)
                        .add(Items.STONE_SHOVEL)
                        .add(Items.IRON_AXE)
                        .add(Items.IRON_HOE)
                        .add(Items.IRON_PICKAXE)
                        .add(Items.IRON_SHOVEL)
                        .add(Items.DIAMOND_AXE)
                        .add(Items.DIAMOND_HOE)
                        .add(Items.DIAMOND_PICKAXE)
                        .add(Items.DIAMOND_SHOVEL)
                        .add(Items.NETHERITE_AXE)
                        .add(Items.NETHERITE_HOE)
                        .add(Items.NETHERITE_PICKAXE)
                        .add(Items.NETHERITE_SHOVEL)
                        .add(HorizonsItems.POINTY_STICK)
                        .add(HorizonsItems.SHARP_FLINT)
                        .add(HorizonsItems.SHARP_STONE)
                ;

                getOrCreateTagBuilder(HorizonsTags.Items.POINTY_STICKS)
                        .add(HorizonsItems.POINTY_STICK)
                ;
                getOrCreateTagBuilder(HorizonsTags.Items.SHARP_STONES)
                        .add(HorizonsItems.SHARP_STONE)
                        .add(HorizonsItems.SHARP_FLINT)
                ;
                getOrCreateTagBuilder(HorizonsTags.Items.AXE)
                        .add(HorizonsItems.FLINT_AXE)
                        .add(Items.IRON_AXE)
                        .add(Items.DIAMOND_AXE)
                        .add(Items.NETHERITE_AXE)
                ;

        }

}
