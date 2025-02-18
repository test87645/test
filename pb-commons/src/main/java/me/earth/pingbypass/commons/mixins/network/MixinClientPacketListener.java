package me.earth.pingbypass.commons.mixins.network;

import me.earth.pingbypass.commons.event.chat.ChatEvent;
import me.earth.pingbypass.commons.util.mixin.MixinHelper;
import net.minecraft.client.multiplayer.ClientPacketListener;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPacketListener.class)
public abstract class MixinClientPacketListener {
    @Inject(method = "sendChat", at = @At("HEAD"), cancellable = true)
    private void sendChatHeadHook(String message, CallbackInfo ci) {
        MixinHelper.hook(new ChatEvent(message), ci);
    }

}
