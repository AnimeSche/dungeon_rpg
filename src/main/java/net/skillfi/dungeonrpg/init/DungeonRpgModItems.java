
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skillfi.dungeonrpg.init;

import net.skillfi.dungeonrpg.item.DurandalItem;
import net.skillfi.dungeonrpg.DungeonRpgMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

public class DungeonRpgModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DungeonRpgMod.MODID);
	public static final RegistryObject<Item> DURANDAL = REGISTRY.register("durandal", () -> new DurandalItem());
	public static final RegistryObject<Item> NEEDLE_TREE_SPAWN_EGG = REGISTRY.register("needle_tree_spawn_egg", () -> new ForgeSpawnEggItem(DungeonRpgModEntities.NEEDLE_TREE, -6080512, -1, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
