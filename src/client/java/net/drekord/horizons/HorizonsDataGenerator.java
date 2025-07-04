package net.drekord.horizons;

import net.drekord.horizons.datagen.HorizonsBlockTagProvider;
import net.drekord.horizons.datagen.HorizonsItemTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class HorizonsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(HorizonsBlockTagProvider::new);
		pack.addProvider(HorizonsItemTagProvider::new);
	}
}