package jakesmythuk.terrastorageicons.mixin.client;

import jakesmythuk.terrastorageicons.IScreen;
import jakesmythuk.terrastorageicons.TerrastorageIconsClient;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.Selectable;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = HandledScreen.class, priority = 2000)
public abstract class HandledScreenMixin<T extends ScreenHandler> extends Screen implements ScreenHandlerProvider<T>, IScreen {
	@Shadow
	protected int backgroundWidth;
	@Shadow
	protected int backgroundHeight;
	@Shadow
	protected int x;
	@Shadow
	protected int y;

	protected HandledScreenMixin(Text title) {
		super(title);
	}

	@Inject(
			method = "init",
			at = @At(value = "FIELD", target = "Lnet/minecraft/client/gui/screen/ingame/HandledScreen;y:I", shift = At.Shift.AFTER),
			cancellable = true
	)
	private void onInit(CallbackInfo ci) {
		TerrastorageIconsClient.initScreen((HandledScreen<?>)(Object)this, this);
		ci.cancel();
	}

	@Override
	public int backgroundHeight() {
		return backgroundHeight;
	}

	@Override
	public int y() {
		return y;
	}

	@Override
	public int backgroundWidth() {
		return backgroundWidth;
	}

	@Override
	public int x() {
		return x;
	}

	@Override
	public TextRenderer textRenderer() {
		return textRenderer;
	}

	@Override
	public <T extends Element & Drawable & Selectable> T terrastorageIcons$addDrawableChild(T button) {
		return addDrawableChild(button);
	}

	@Override
	public MinecraftClient client() {
		return client;
	}
}
