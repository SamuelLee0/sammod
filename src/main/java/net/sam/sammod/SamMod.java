package net.sam.sammod;

import net.fabricmc.api.ModInitializer;

import net.sam.sammod.block.ModBlocks;
import net.sam.sammod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SamMod implements ModInitializer {
	public static final String MOD_ID = "sammod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}