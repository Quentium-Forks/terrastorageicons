package jakesmythuk.terrastorageicons;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.narration.NarratableEntry;

public interface IScreen {
    int backgroundHeight();
    int y();
    int backgroundWidth();
    int x();

    Font textRenderer();

    <T extends GuiEventListener & Renderable & NarratableEntry> T terrastorageIcons$addDrawableChild(T button);

    Minecraft client();
}
