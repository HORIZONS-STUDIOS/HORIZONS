package net.drekord.horizons.common.items.custom.tools;

import net.drekord.horizons.common.items.HorizonsItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SharpTools extends Item {
    public SharpTools(Settings settings) {
        super(settings);
    }

    /*@Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getStack();

        //if (state.isIn(BlockTags.NEEDS_STONE_TOOL) && !world.isClient() && player != null) {
        if (state.isOf(Blocks.STONE) && !world.isClient() && player !=null) {
            //ServerWorld serverWorld = (ServerWorld) world;
            world.breakBlock(pos,false);
            world.setBlockState(pos, Blocks.COBBLESTONE.getDefaultState());
            Block.dropStack(world, pos, new ItemStack(HorizonsItems.LOOSE_STONE_ROCK.asItem()));
            stack.damage(1, player);
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }*/

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
