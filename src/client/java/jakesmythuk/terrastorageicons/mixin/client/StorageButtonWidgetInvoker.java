package jakesmythuk.terrastorageicons.mixin.client;

import me.timvinci.terrastorage.gui.widget.StorageButtonWidget;
import me.timvinci.terrastorage.util.ButtonsStyle;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(StorageButtonWidget.class)
public interface StorageButtonWidgetInvoker {
	@Invoker("<init>")
	static StorageButtonWidget invokeInit(int x, int y, int width, int height, Component message, ButtonsStyle style, Button.OnPress onPress) {
		throw new AssertionError();
	}
}
