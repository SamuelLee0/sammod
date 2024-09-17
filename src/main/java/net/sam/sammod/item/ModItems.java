package net.sam.sammod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sam.sammod.SamMod;

public class ModItems {
    public static final Item MINECRAFT_BUCKS = registerItem("minecraft_bucks", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SamMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SamMod.LOGGER.info("Registering Mod Items for " + SamMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MINECRAFT_BUCKS);
        });
    }
}
