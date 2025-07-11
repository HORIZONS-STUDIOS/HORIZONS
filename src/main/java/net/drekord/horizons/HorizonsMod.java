package net.drekord.horizons;

import net.drekord.horizons.common.blocks.HorizonsBlocks;
import net.drekord.horizons.common.items.HorizonsItems;
import net.drekord.horizons.common.tab.HorizonsCreativeTabs;
import net.drekord.horizons.util.HorizonsTags;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HorizonsMod implements ModInitializer {
	public static final String MOD_ID = "horizons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		HorizonsItems.registerModItems();
		HorizonsBlocks.registerModBlocks();
		HorizonsCreativeTabs.registerItemGroups();
		LOGGER.info("Hello Fabric world!");
	}
}