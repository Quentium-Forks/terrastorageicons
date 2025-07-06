package jakesmythuk.terrastorageicons;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.Selectable;

public interface IScreen {
    int backgroundHeight();
    int y();
    int backgroundWidth();
    int x();

    TextRenderer textRenderer();

    <T extends Element & Drawable & Selectable> T terrastorageIcons$addDrawableChild(T button);

    MinecraftClient client();
}
