//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.skillfi.dungeonrpg.api;

import net.minecraft.world.entity.player.Player;

public interface IRace {
    Player getPlayer();

    void setPlayer(Player var1);

    String getName();

    void setName(String var1);

    String getSubRace();

    void setSubRace(String var1);

    int getHealth();

    void setHealth(int var1);

    int getMana();

    void setMana(int var1);

    int getSaturation();

    void setSaturation(int var1);

    int getStamina();

    void setStamina(int var1);

    int getManaRegen();

    void setManaRegen(int var1);

    int getBasePhysicalResistance();

    void setBasePhysicalResistance(int var1);

    int getBaseMagicalResistance();

    void setBaseMagicalResistance(int var1);

    int getBasePhysicalDamage();

    void setBasePhysicalDamage(int var1);

    int getBaseMagicDamage();

    void setBaseMagicDamage(int var1);

    Skills getActiveSkill();

    void setActiveSkill(Skills var1);

    Skills getPassiveSkill();

    void setPassiveSkill(Skills var1);

    PlayerClass getSpecialClass();

    void setSpecialClass(PlayerClass var1);
}
