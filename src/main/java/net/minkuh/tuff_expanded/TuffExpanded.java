package net.minkuh.tuff_expanded;

import net.fabricmc.api.ModInitializer;
import net.minkuh.tuff_expanded.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TuffExpanded implements ModInitializer {

	public static final String MOD_ID = "tuff_expanded";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();

	}
}
