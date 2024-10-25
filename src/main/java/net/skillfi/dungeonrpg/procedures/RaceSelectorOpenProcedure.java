package net.skillfi.dungeonrpg.procedures;

import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class RaceSelectorOpenProcedure {
	public static void execute(HashMap guistate) {
		if (guistate == null)
			return;
		if (guistate.get("text:label_race_name") instanceof EditBox _tf)
			_tf.setValue("Human");
		if (guistate.get("text:label_hp_value") instanceof EditBox _tf)
			_tf.setValue("100");
		if (guistate.get("text:label_mana_value") instanceof EditBox _tf)
			_tf.setValue("100");
	}
}
