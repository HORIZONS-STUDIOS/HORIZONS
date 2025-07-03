package net.drekord.horizons.common.items.custom.tools;

import net.drekord.horizons.common.items.HorizonsItems;
import net.drekord.horizons.util.HorizonsTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.Map;
import java.util.function.Supplier;

public class PointerStick extends Item {
    private static final Supplier<Map<Block, Block>> BLOCK_TO_CRACKED = () -> Map.of(
            Blocks.STONE, Blocks.COBBLESTONE,
            Blocks.ANDESITE, Blocks.POLISHED_ANDESITE,
            Blocks.GRANITE, Blocks.POLISHED_GRANITE,
            Blocks.DIORITE, Blocks.POLISHED_DIORITE,
            Blocks.GRAVEL, Blocks.SAND,
            Blocks.COARSE_DIRT, Blocks.DIRT
    );
    private static final Supplier<Map<Block, Item>> BLOCK_TO_DROP = () -> Map.of(
            Blocks.STONE, Items.FLINT,
            Blocks.ANDESITE, HorizonsItems.LOOSE_STONE_ROCK,
            Blocks.GRANITE, HorizonsItems.LOOSE_STONE_ROCK,
            Blocks.DIORITE, HorizonsItems.LOOSE_STONE_ROCK,
            Blocks.GRAVEL, Items.FLINT,
            Blocks.COARSE_DIRT, HorizonsItems.LOOSE_STONE_ROCK
    );

    public PointerStick(Settings settings) {
        super(settings);
    }

    @Override
    public float getMiningSpeed(ItemStack stack, BlockState state) {
        return state.isIn(HorizonsTags.Blocks.POINTER_STICK_MINEABLE)? 1.0f : 0.01F;
    }

    @Override
    public boolean canMine(ItemStack stack, BlockState state, World world, BlockPos pos, LivingEntity user) {
        return state.isIn(HorizonsTags.Blocks.POINTER_STICK_MINEABLE);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (!world.isClient()) {
            if (state.isIn(HorizonsTags.Blocks.POINTER_STICK_MINEABLE)) {
                Block originalBlock = state.getBlock();
                Random rand = world.getRandom();
                world.setBlockState(pos, BLOCK_TO_CRACKED.get().get(originalBlock).getDefaultState());
                Block.dropStack(world, pos, new ItemStack(BLOCK_TO_DROP.get().get(originalBlock).asItem(), rand.nextInt(2) + 1));
                stack.damage(1, miner, EquipmentSlot.MAINHAND);
            }
        }
        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        ItemStack itemStack = stack.copy();
        itemStack.setDamage(itemStack.getDamage() + 1);
        if(itemStack.getDamage() >= itemStack.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return itemStack;
    }
}
