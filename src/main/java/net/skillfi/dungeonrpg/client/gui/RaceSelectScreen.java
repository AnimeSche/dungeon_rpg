package net.skillfi.dungeonrpg.client.gui;

import net.skillfi.dungeonrpg.world.inventory.RaceSelectMenu;
import net.skillfi.dungeonrpg.procedures.RaceNameProcedure;
import net.skillfi.dungeonrpg.procedures.RaceHealthProcedure;
import net.skillfi.dungeonrpg.procedures.HumanRaceIconProcedure;
import net.skillfi.dungeonrpg.procedures.ElfRaceIconProcedure;
import net.skillfi.dungeonrpg.network.RaceSelectButtonMessage;
import net.skillfi.dungeonrpg.DungeonRpgMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RaceSelectScreen extends AbstractContainerScreen<RaceSelectMenu> {
	private final static HashMap<String, Object> guistate = RaceSelectMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_reincarnate;
	ImageButton imagebutton_nextarrowoff;
	ImageButton imagebutton_backarrow;

	public RaceSelectScreen(RaceSelectMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 181;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("dungeon_rpg:textures/screens/racegui.png"), this.leftPos + 2, this.topPos + -19, 0, 0, 176, 182, 176, 182);

		if (HumanRaceIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("dungeon_rpg:textures/screens/humanrace.png"), this.leftPos + 21, this.topPos + -3, 0, 0, 16, 16, 16, 16);
		}
		if (ElfRaceIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("dungeon_rpg:textures/screens/elfrace.png"), this.leftPos + 14, this.topPos + -6, 0, 0, 30, 20, 30, 20);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				RaceNameProcedure.execute(entity), 81, 0, -16750900, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dungeon_rpg.race_select.label_health"), 18, 25, -16724992, false);
		guiGraphics.drawString(this.font,

				RaceHealthProcedure.execute(entity), 90, 25, -16724992, false);
	}

	@Override
	public void init() {
		super.init();
		button_reincarnate = Button.builder(Component.translatable("gui.dungeon_rpg.race_select.button_reincarnate"), e -> {
		}).bounds(this.leftPos + 54, this.topPos + 133, 72, 20).build();
		guistate.put("button:button_reincarnate", button_reincarnate);
		this.addRenderableWidget(button_reincarnate);
		imagebutton_nextarrowoff = new ImageButton(this.leftPos + 144, this.topPos + 142, 20, 11, 0, 0, 11, new ResourceLocation("dungeon_rpg:textures/screens/atlas/imagebutton_nextarrowoff.png"), 20, 22, e -> {
			if (true) {
				DungeonRpgMod.PACKET_HANDLER.sendToServer(new RaceSelectButtonMessage(1, x, y, z));
				RaceSelectButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_nextarrowoff", imagebutton_nextarrowoff);
		this.addRenderableWidget(imagebutton_nextarrowoff);
		imagebutton_backarrow = new ImageButton(this.leftPos + 18, this.topPos + 142, 20, 11, 0, 0, 11, new ResourceLocation("dungeon_rpg:textures/screens/atlas/imagebutton_backarrow.png"), 20, 22, e -> {
			if (true) {
				DungeonRpgMod.PACKET_HANDLER.sendToServer(new RaceSelectButtonMessage(2, x, y, z));
				RaceSelectButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_backarrow", imagebutton_backarrow);
		this.addRenderableWidget(imagebutton_backarrow);
	}
}
