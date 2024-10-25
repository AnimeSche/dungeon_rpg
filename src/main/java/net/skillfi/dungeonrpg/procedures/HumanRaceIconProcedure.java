package net.skillfi.dungeonrpg.procedures;

import net.skillfi.dungeonrpg.network.DungeonRpgModVariables;

import net.minecraft.world.entity.Entity;

public class HumanRaceIconProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(DungeonRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DungeonRpgModVariables.PlayerVariables())).racePage == 0) {
			return true;
		}
		return false;
	}
}
