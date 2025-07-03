package net.drekord.horizons.mixin;

import net.drekord.horizons.util.HorizonsTags;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerInteraction {
    @Unique
    private long lastDamageTime = 0;
    @Unique
    private static final long DAMAGE_COOLDOWN = 1000;

    @Inject(method = "getBlockBreakingSpeed", at = @At("HEAD"), cancellable = true)
    private void onCanBreakBlock(BlockState state, CallbackInfoReturnable<Float> cir) {
        PlayerEntity player = (PlayerEntity)(Object)this;
        ItemStack stack = player.getMainHandStack();
        if (state.isIn(HorizonsTags.Blocks.HAND_MINEABLE)) {
            return;
        }
        if (stack.isEmpty() || stack.getItem() == Items.AIR || !isTool(stack)) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastDamageTime >= DAMAGE_COOLDOWN) {
                player.serverDamage(player.getDamageSources().generic(), 2.0F);
                lastDamageTime = currentTime;
            }
            cir.setReturnValue(0.0F);
            cir.cancel();
        }
    }

    @Unique
    private boolean isTool(ItemStack stack) {
        if (stack.isIn(ItemTags.PICKAXES) || stack.isIn(ItemTags.AXES) || stack.isIn(ItemTags.SHOVELS) || stack.isIn(ItemTags.HOES) || stack.isIn(ItemTags.SWORDS) || stack.isOf(Items.SHEARS)) {
            return true;
        }
        return false;
    }
}
