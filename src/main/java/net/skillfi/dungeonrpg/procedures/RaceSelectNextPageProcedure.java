package net.skillfi.dungeonrpg.procedures;

import net.skillfi.dungeonrpg.network.DungeonRpgModVariables;

import net.minecraft.world.entity.Entity;

public class RaceSelectNextPageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DungeonRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DungeonRpgModVariables.PlayerVariables())).racePage >= 0) {
			{
				double _setval = (entity.getCapability(DungeonRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DungeonRpgModVariables.PlayerVariables())).racePage + 1;
				entity.getCapability(DungeonRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.racePage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
