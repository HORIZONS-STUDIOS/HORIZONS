package net.drekord.horizons.mixin;

import net.drekord.horizons.common.items.HorizonsItems;
import net.drekord.horizons.util.HorizonsTags;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
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

        if (stack.isEmpty()) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastDamageTime >= DAMAGE_COOLDOWN) {
                if (player.getWorld() instanceof ServerWorld serverWorld) {
                    serverWorld.getServer().execute(() -> {
                        player.damage(serverWorld, player.getDamageSources().generic(), 2.0F);
                    });
                }
                lastDamageTime = currentTime;
            }
            if (state.isIn(HorizonsTags.Blocks.HAND_MINEABLE)) { return; }
            cir.setReturnValue(0.0F);
            cir.cancel();
        } else {
            if (!(stack.getItem() == Items.AIR) && !isTool(stack)) {
                if (state.isIn(HorizonsTags.Blocks.HAND_MINEABLE)) { return; }
                cir.setReturnValue(0.0F);
                cir.cancel();
            }
        }

        if ((stack.getItem() == HorizonsItems.POINTY_STICK.asItem() && !state.isIn(HorizonsTags.Blocks.POINTER_STICK_MINEABLE)) ||
                (stack.getItem() == HorizonsItems.SHARP_STONE.asItem() && !state.isIn(HorizonsTags.Blocks.SHARP_STONE_MINEABLE)) ||
                (stack.getItem() == HorizonsItems.SHARP_FLINT.asItem() && !state.isIn(HorizonsTags.Blocks.SHARP_STONE_MINEABLE))) {
            cir.setReturnValue(0.0F);
            cir.cancel();
        }
    }

    @Unique
    private boolean isTool(ItemStack stack) {
        if (stack.isIn(HorizonsTags.Items.TOOLS)) {
            return true;
        }
        return false;
    }
}
