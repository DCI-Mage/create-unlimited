package dev.rdh.createunlimited.forge.mixin;

import com.simibubi.create.content.trains.track.TrackPlacementOverlay;
import dev.rdh.createunlimited.forge.mixin.accessor.GuiAccessor;
import net.minecraft.client.gui.Gui;
import net.minecraft.network.chat.MutableComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = TrackPlacementOverlay.class, remap = false)
public class TrackPlacementOverlayMixin {
	@Redirect(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/fml/util/ObfuscationReflectionHelper;getPrivateValue(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;"))
	public static <T, E> T getPrivateValue(Class<Gui> ignore, E instance, String ignore2) {
		return (T) ((GuiAccessor)instance).getToolHighlightTimer();
	}
}