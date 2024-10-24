package net.skillfi.dungeonrpg.procedures;

import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class ClassSelectorOnOpenProcedure {
	public static void execute(HashMap guistate) {
		if (guistate == null)
			return;
		if (guistate.get("text:label_class") instanceof EditBox _tf)
			_tf.setValue("\u0421\u0435\u043B\u044F\u043D\u0438\u043D");
	}
}
