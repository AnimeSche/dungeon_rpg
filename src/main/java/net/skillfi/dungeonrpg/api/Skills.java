//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.skillfi.dungeonrpg.api;

import java.util.UUID;
import net.minecraft.nbt.CompoundTag;

public class Skills implements ISkills {
    public static final Skills EMPTY = new Skills();
    UUID playerUUID;
    String name;
    Integer level;

    public Skills() {
    }

    public Skills(String name) {
        this.name = name;
    }

    public Skills(String name, UUID playerUUID, int level) {
        this.name = name;
        this.playerUUID = playerUUID;
        this.level = level;
    }

    public UUID getPlayerUUID() {
        return this.playerUUID;
    }

    public String getName() {
        return this.name;
    }

    public Integer getLevel() {
        return this.level;
    }

    public CompoundTag toNBT(CompoundTag tag) {
        tag.putString("Name", this.name);
        tag.putUUID("PlayerUUID", this.playerUUID);
        tag.putInt("Level", this.level);
        return tag;
    }

    public static Skills of(CompoundTag tag) {
        String name = tag.getString("Name");
        UUID playerUUID = tag.getUUID("PlayerUUID");
        int Level = tag.getInt("Level");
        return new Skills(name, playerUUID, Level);
    }
}
