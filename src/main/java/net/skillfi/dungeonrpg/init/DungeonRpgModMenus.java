
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.skillfi.dungeonrpg.init;

import net.skillfi.dungeonrpg.world.inventory.RaceSelectMenu;
import net.skillfi.dungeonrpg.DungeonRpgMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class DungeonRpgModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DungeonRpgMod.MODID);
	public static final RegistryObject<MenuType<RaceSelectMenu>> RACE_SELECT = REGISTRY.register("race_select", () -> IForgeMenuType.create(RaceSelectMenu::new));
}
