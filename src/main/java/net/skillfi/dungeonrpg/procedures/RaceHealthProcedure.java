package net.skillfi.dungeonrpg.procedures;

import net.skillfi.dungeonrpg.network.DungeonRpgModVariables;

import net.minecraft.world.entity.Entity;

public class RaceHealthProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(DungeonRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DungeonRpgModVariables.PlayerVariables())).racePage == 0) {
			return 20 + "";
		} else if ((entity.getCapability(DungeonRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DungeonRpgModVariables.PlayerVariables())).racePage == 1) {
			return 18 + "";
		}
		return 20 + "";
	}
}
