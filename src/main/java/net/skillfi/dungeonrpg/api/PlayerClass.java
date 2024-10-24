/**
 * The code of this mod element is always locked.
 * <p>
 * You can register new events in this class too.
 * <p>
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.skillfi.dungeonrpg as this package is managed by MCreator.
 * <p>
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 * <p>
 * This class will be added in the mod root package.
 */
package net.skillfi.dungeonrpg.api;


import net.minecraft.nbt.CompoundTag;

public class PlayerClass implements IClass {

    public static final PlayerClass EMPTY;

    static {
        EMPTY = new PlayerClass("Peasant", new ClassBuffs[]{
                ClassBuffs.SMALL_ENDURANCE_BUFF,
                ClassBuffs.SMALL_AGILITY_BUFF,
                ClassBuffs.SMALL_RESISTANCE_BUFF,
                ClassBuffs.SMALL_DEXTERITY_BUFF
        }, 1, "");
    }

    String Name;
    ClassBuffs[] Buffs;
    int Level;
    String Skill;

    public PlayerClass() {
        this("Peasant", new ClassBuffs[0], 1, "");
    }

    public PlayerClass(String name, ClassBuffs[] buffs, int level, String skill) {
        Name = name;
        Buffs = buffs;
        Level = level;
        Skill = skill;
    }

    public static PlayerClass of(CompoundTag tag) {
        String name = tag.getString("Name");
        int buffCount = tag.getInt("Buffs");
        ClassBuffs[] buffs = new ClassBuffs[buffCount];
        for (int i = 0; i < buffCount; i++) {
            buffs[i] = ClassBuffs.of(tag.getCompound("Buff" + i));
        }
        int level = tag.getInt("Level");
        String skill = tag.getString("Skill");

        return new PlayerClass(name, buffs, level, skill);
    }

    @Override
    public String getName() {
        return Name;
    }

    public ClassBuffs[] getBuffs() {
        return Buffs;
    }

    @Override
    public Integer getLevel() {
        return Level;
    }

    @Override
    public String getSkill() {
        return Skill;
    }

    @Override
    public CompoundTag toNBT(CompoundTag tag) {
        tag.putString("Name", Name);
        for (int i = 0; i < Buffs.length; i++) {
            tag.put("Buff" + i, Buffs[i].toNBT());
        }
        tag.putInt("Level", Level);
        tag.putString("Skill", Skill);
        return tag;
    }
}

