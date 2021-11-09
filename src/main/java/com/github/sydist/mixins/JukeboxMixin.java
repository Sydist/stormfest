package com.github.sydist.mixins;

import com.github.sydist.Items;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.block.BlockState;
import net.minecraft.block.JukeboxBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.JukeboxBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

@Mixin(JukeboxBlock.class)
public class JukeboxMixin {

    @Inject(at = @At("TAIL"), method = "setRecord")
    private void setRecord(WorldAccess world, BlockPos pos, BlockState state, ItemStack stack, CallbackInfo info) {
        if (stack.getItem() == Items.CHARGED_MUSIC_DISC_STORMFEST) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            ((JukeboxBlockEntity)blockEntity).setRecord(Items.MUSIC_DISC_STORMFEST.getDefaultStack().copy());
            ((ServerWorld)world).setWeather(0, 6000, true, true);
        }
    }
}