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

public class PointerStick extends Item {
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
                //ServerWorld serverWorld = (ServerWorld) world;
                world.setBlockState(pos, Blocks.COBBLESTONE.getDefaultState());
                Random rand = world.getRandom();
                Block.dropStack(world, pos, new ItemStack(HorizonsItems.LOOSE_STONE_ROCK.asItem(), rand.nextInt(2) + 1));
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
