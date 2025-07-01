package net.drekord.horizons.common.tab;

import net.drekord.horizons.HorizonsMod;
import net.drekord.horizons.common.items.HorizonsItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class HorizonsCreativeTabs {

    public static final ItemGroup MAIN_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HorizonsMod.MOD_ID, "main_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(HorizonsItems.FLINT_AXE))
                    .displayName(Text.translatable("itemgroup.horizons.main_tab"))
                    .entries((displayContext, entries) -> {
                        entries.add(HorizonsItems.POINTY_STICK);
                        entries.add(HorizonsItems.LOOSE_STONE_ROCK);
                        entries.add(HorizonsItems.SHARP_STONE);
                        entries.add(HorizonsItems.SHARP_FLINT);
                        entries.add(HorizonsItems.FLAX);
                        entries.add(HorizonsItems.BUNCH_FLAX);
                        entries.add(HorizonsItems.DRIED_BUNCH_FLAX);
                        entries.add(HorizonsItems.FLAX_STRING);
                        entries.add(HorizonsItems.FLINT_AXE_HEAD);
                        entries.add(HorizonsItems.FLINT_AXE);
                        entries.add(HorizonsItems.FLINT_JAVELIN_HEAD);
                        entries.add(HorizonsItems.FLINT_JAVELIN);
                    }).build());

    public static void registerItemGroups() {
        HorizonsMod.LOGGER.info("Registering Item Groups for " + HorizonsMod.MOD_ID);
    }
}
