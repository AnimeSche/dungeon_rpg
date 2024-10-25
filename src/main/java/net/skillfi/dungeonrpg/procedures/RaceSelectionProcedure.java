package net.skillfi.dungeonrpg.procedures;

import net.skillfi.dungeonrpg.network.DungeonRpgModVariables;

import net.minecraft.world.entity.Entity;

public class RaceSelectionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DungeonRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DungeonRpgModVariables.PlayerVariables())).racePage == 0) {
			assert Boolean.TRUE; //#dbg:RaceSelection:TestVariable
			{
				Race _setval = new Race(new Race(entity, "Human"));
				entity.getCapability(DungeonRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.playerRace = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
