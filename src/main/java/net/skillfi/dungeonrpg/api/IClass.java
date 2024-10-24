package net.skillfi.dungeonrpg.api;

import net.minecraft.nbt.CompoundTag;

public interface IClass {
	String getName();
	Integer getLevel();
	String getSkill();
	ClassBuffs[] getBuffs(); // Додано для відповідності методу в PlayerClass
	CompoundTag toNBT(CompoundTag tag);
	static IClass of(CompoundTag tag) { // Метод зроблено статичним
		return new PlayerClass().of(tag); // Додано реалізацію за замовчуванням
	}
}