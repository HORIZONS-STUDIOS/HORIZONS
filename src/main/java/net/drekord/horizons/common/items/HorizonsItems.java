package net.drekord.horizons.common.items;

import net.drekord.horizons.HorizonsMod;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class HorizonsItems {
    public static final Item POINTY_STICK = registerItem("tools/wood/pointy_stick", settings -> new Item(settings));
    public static final Item LOOSE_STONE_ROCK = registerItem("rock/loose_stone_rock", settings -> new Item(settings.fireproof()));
    public static final Item SHARP_STONE = registerItem("tools/rock/sharp_stone", settings -> new Item(settings.fireproof()));
    public static final Item SHARP_FLINT = registerItem("tools/flint/sharp_flint", settings -> new Item(settings.fireproof()));

    public static final Item FLAX = registerItem("plants/flax/flax", settings -> new Item(settings));
    public static final Item BUNCH_FLAX = registerItem("plants/flax/bunch_flax", settings -> new Item(settings));
    public static final Item DRIED_BUNCH_FLAX = registerItem("plants/flax/dried_bunch_flax", settings -> new Item(settings));
    public static final Item FLAX_STRING = registerItem("plants/flax/flax_string", settings -> new Item(settings));

    public static final Item FLINT_AXE_HEAD = registerItem("tools/flint/flint_axe_head", settings -> new Item(settings.maxCount(4).fireproof()));
    public static final Item FLINT_JAVELIN_HEAD = registerItem("tools/flint/flint_javelin_head", settings -> new Item(settings.maxCount(4).fireproof()));

    public static final Item FLINT_AXE = registerItem("tools/flint/flint_axe", settings -> new AxeItem(ToolMaterial.WOOD, 6.0F, -3.2F, settings.fireproof()));
    public static final Item FLINT_JAVELIN = registerItem("tools/flint/flint_javelin", settings -> new AxeItem(ToolMaterial.WOOD, 6.0F, -3.2F, settings.fireproof()));

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(HorizonsMod.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HorizonsMod.MOD_ID, name)))));
    }
    public static void registerModItems() {
        HorizonsMod.LOGGER.info("Registering Mod Items for " + HorizonsMod.MOD_ID);
    }
}