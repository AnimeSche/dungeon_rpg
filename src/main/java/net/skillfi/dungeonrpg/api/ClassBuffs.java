/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.skillfi.dungeonrpg as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.skillfi.dungeonrpg.api;


import net.minecraft.nbt.CompoundTag;

public class ClassBuffs implements IBuffs{

	String Type;
	Integer Level;
	String Name;
	// Виносливість
	public static final ClassBuffs SMALL_ENDURANCE_BUFF = new ClassBuffs("Small", 1, "Endurance");
	public static final ClassBuffs MEDIUM_ENDURANCE_BUFF = new ClassBuffs("Medium", 3, "Endurance");
	public static final ClassBuffs HARD_ENDURANCE_BUFF = new ClassBuffs("Hard", 6, "Endurance");

	// Ловкість
	public static final ClassBuffs SMALL_AGILITY_BUFF = new ClassBuffs("Small", 1, "Agility");
	public static final ClassBuffs MEDIUM_AGILITY_BUFF = new ClassBuffs("Medium", 3, "Agility");
	public static final ClassBuffs HARD_AGILITY_BUFF = new ClassBuffs("Hard", 6, "Agility");

	// Сопротивление
	public static final ClassBuffs SMALL_RESISTANCE_BUFF = new ClassBuffs("Small", 1, "Resistance");
	public static final ClassBuffs MEDIUM_RESISTANCE_BUFF = new ClassBuffs("Medium", 3, "Resistance");
	public static final ClassBuffs HARD_RESISTANCE_BUFF = new ClassBuffs("Hard", 6, "Resistance");

	// Проворність
	public static final ClassBuffs SMALL_DEXTERITY_BUFF = new ClassBuffs("Small", 1, "Dexterity");
	public static final ClassBuffs MEDIUM_DEXTERITY_BUFF = new ClassBuffs("Medium", 3, "Dexterity");
	public static final ClassBuffs HARD_DEXTERITY_BUFF = new ClassBuffs("Hard", 6, "Dexterity");

	public ClassBuffs() {
	}

	public ClassBuffs(String type, int level, String name) {
		Type = type;
		Name = name;
		Level = level;
	}


	@Override
	public String getType() {
		return Type;
	}

	@Override
	public Integer getLevel() {
		return Level;
	}

	@Override
	public String getName() {
		return Name;
	}


	public static ClassBuffs of(CompoundTag tag) {
		ClassBuffs buff = new ClassBuffs();
		buff.Type = tag.getString("Type");
		buff.Level = tag.getInt("Level");
		buff.Name = tag.getString("Name");
		return buff;
	}

	@Override
	public CompoundTag toNBT() {
		CompoundTag tag = new CompoundTag();
		tag.putString("Type", Type);
		tag.putInt("Level", Level);
		tag.putString("Name", Name);
		return tag;
	}
}
