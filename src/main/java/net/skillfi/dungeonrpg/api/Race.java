//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.skillfi.dungeonrpg.api;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.player.Player;

public class Race implements IRace {
    public Player player;
    private String name;
    private String subRace;
    private int health;
    private int mana;
    private int saturation;
    private int stamina;
    private int manaRegen;
    private int basePhysicalResistance;
    private int baseMagicalResistance;
    private int basePhysicalDamage;
    private int baseMagicDamage;
    private Skills activeSkill;
    private Skills passiveSkill;
    private PlayerClass specialClass;
    public static final Race HUMAN = new Race("Human");

    public Race(String name) {
        this.name = name;
    }

    public Race(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubRace() {
        return this.subRace;
    }

    public void setSubRace(String subRace) {
        this.subRace = subRace;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getSaturation() {
        return this.saturation;
    }

    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getManaRegen() {
        return this.manaRegen;
    }

    public void setManaRegen(int manaRegen) {
        this.manaRegen = manaRegen;
    }

    public int getBasePhysicalResistance() {
        return this.basePhysicalResistance;
    }

    public void setBasePhysicalResistance(int basePhysicalResistance) {
        this.basePhysicalResistance = basePhysicalResistance;
    }

    public int getBaseMagicalResistance() {
        return this.baseMagicalResistance;
    }

    public void setBaseMagicalResistance(int baseMagicalResistance) {
        this.baseMagicalResistance = baseMagicalResistance;
    }

    public int getBasePhysicalDamage() {
        return this.basePhysicalDamage;
    }

    public void setBasePhysicalDamage(int basePhysicalDamage) {
        this.basePhysicalDamage = basePhysicalDamage;
    }

    public int getBaseMagicDamage() {
        return this.baseMagicDamage;
    }

    public void setBaseMagicDamage(int baseMagicDamage) {
        this.baseMagicDamage = baseMagicDamage;
    }

    public Skills getActiveSkill() {
        return this.activeSkill;
    }

    public void setActiveSkill(Skills activeSkill) {
        this.activeSkill = activeSkill;
    }

    public Skills getPassiveSkill() {
        return this.passiveSkill;
    }

    public void setPassiveSkill(Skills passiveSkill) {
        this.passiveSkill = passiveSkill;
    }

    public PlayerClass getSpecialClass() {
        return this.specialClass;
    }

    public void setSpecialClass(PlayerClass specialClass) {
        this.specialClass = specialClass;
    }

    public static Race of(CompoundTag tag) {
        Race race = new Race(tag.getString("name"));
        if (tag.contains("subRace")) {
            race.setSubRace(tag.getString("subRace"));
        }

        if (tag.contains("health")) {
            race.setHealth(tag.getInt("health"));
        }

        if (tag.contains("mana")) {
            race.setMana(tag.getInt("mana"));
        }

        if (tag.contains("saturation")) {
            race.setSaturation(tag.getInt("saturation"));
        }

        if (tag.contains("stamina")) {
            race.setStamina(tag.getInt("stamina"));
        }

        if (tag.contains("manaRegen")) {
            race.setManaRegen(tag.getInt("manaRegen"));
        }

        if (tag.contains("basePhysicalResistance")) {
            race.setBasePhysicalResistance(tag.getInt("basePhysicalResistance"));
        }

        if (tag.contains("baseMagicalResistance")) {
            race.setBaseMagicalResistance(tag.getInt("baseMagicalResistance"));
        }

        if (tag.contains("basePhysicalDamage")) {
            race.setBasePhysicalDamage(tag.getInt("basePhysicalDamage"));
        }

        if (tag.contains("baseMagicDamage")) {
            race.setBaseMagicDamage(tag.getInt("baseMagicDamage"));
        }

        if (tag.contains("activeSkill")) {
            race.setActiveSkill(Skills.of(tag.getCompound("activeSkill")));
        }

        if (tag.contains("passiveSkill")) {
            race.setPassiveSkill(Skills.of(tag.getCompound("passiveSkill")));
        }

        if (tag.contains("specialClass")) {
            race.setSpecialClass(PlayerClass.of(tag.getCompound("specialClass")));
        }

        return race;
    }

    public CompoundTag toNBT(CompoundTag tag) {
        tag.putString("name", this.name);
        tag.putString("subRace", this.subRace);
        tag.putInt("health", this.health);
        tag.putInt("mana", this.mana);
        tag.putInt("saturation", this.saturation);
        tag.putInt("stamina", this.stamina);
        tag.putInt("manaRegen", this.manaRegen);
        tag.putInt("basePhysicalResistance", this.basePhysicalResistance);
        tag.putInt("baseMagicalResistance", this.baseMagicalResistance);
        tag.putInt("basePhysicalDamage", this.basePhysicalDamage);
        tag.putInt("baseMagicDamage", this.baseMagicDamage);
        if (this.activeSkill != null) {
            tag.put("activeSkill", this.activeSkill.toNBT(new CompoundTag()));
        }

        if (this.passiveSkill != null) {
            tag.put("passiveSkill", this.passiveSkill.toNBT(new CompoundTag()));
        }

        if (this.specialClass != null) {
            tag.put("specialClass", this.specialClass.toNBT(new CompoundTag()));
        }

        return tag;
    }
}
