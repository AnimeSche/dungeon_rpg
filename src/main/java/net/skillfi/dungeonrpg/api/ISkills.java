//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.skillfi.dungeonrpg.api;

import java.util.UUID;
import net.minecraft.nbt.CompoundTag;

public interface ISkills {
    UUID getPlayerUUID();

    String getName();

    Integer getLevel();

    CompoundTag toNBT(CompoundTag var1);

    static ISkills of(CompoundTag tag) {
        new Skills();
        return Skills.of(tag);
    }
}
