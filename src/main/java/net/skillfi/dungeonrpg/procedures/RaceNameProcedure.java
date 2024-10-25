package net.skillfi.dungeonrpg.procedures;

import net.skillfi.dungeonrpg.network.DungeonRpgModVariables;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;

public class RaceNameProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(DungeonRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DungeonRpgModVariables.PlayerVariables())).racePage == 0) {
			assert Boolean.TRUE; //#dbg:RaceName:humanRace
			entity.getPersistentData().put("Race", new Race(entity, "Human").toNBT(new CompoundTag()));
			return Component.translatable("gui.race.human").getString() + "" + new Race(entity, "Human");
		} else if ((entity.getCapability(DungeonRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DungeonRpgModVariables.PlayerVariables())).racePage == 1) {
			assert Boolean.TRUE; //#dbg:RaceName:elfRace
			return Component.translatable("gui.race.elf").getString() + "";
		}
		return Component.translatable("gui.race.human").getString() + "";
	}
}
