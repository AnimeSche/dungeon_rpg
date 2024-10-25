
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skillfi.dungeonrpg.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DungeonRpgModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> REENCARNATED_RULE = GameRules.register("reencarnatedRule", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}
