package org.error1015.dragonloot.mixin;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public class ExampleMixin {
    @Inject(at = @At("HEAD"), method = "tick")
    public void inject(CallbackInfo ci) {
        Player player = (Player) (Object) this;
        player.addEffect(new MobEffectInstance(MobEffects.GLOWING));
    }
}