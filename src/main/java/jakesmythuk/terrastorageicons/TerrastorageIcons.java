package jakesmythuk.terrastorageicons;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TerrastorageIcons implements ModInitializer {
	public static final Identifier ICONS_TEXTURE = Identifier.of(TerrastorageIcons.MOD_ID, "textures/gui/inventory_sorting_icons.png");
	public static final int TEXTURE_WIDTH = 64, TEXTURE_HEIGHT = 160;
	public static final String MOD_ID = "terrastorageicons";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}