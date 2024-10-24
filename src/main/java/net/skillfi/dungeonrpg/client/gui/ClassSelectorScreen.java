package net.skillfi.dungeonrpg.client.gui;

import net.skillfi.dungeonrpg.world.inventory.ClassSelectorMenu;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ClassSelectorScreen extends AbstractContainerScreen<ClassSelectorMenu> {
	private final static HashMap<String, Object> guistate = ClassSelectorMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_confirm;

	public ClassSelectorScreen(ClassSelectorMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 282;
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

		guiGraphics.blit(new ResourceLocation("dungeon_rpg:textures/screens/class-gui.png"), this.leftPos + -13, this.topPos + -20, 0, 0, 300, 200, 300, 200);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dungeon_rpg.class_selector.label_class"), 55, 31, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dungeon_rpg.class_selector.label_1"), 84, 31, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dungeon_rpg.class_selector.label_level"), 90, 31, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_confirm = Button.builder(Component.translatable("gui.dungeon_rpg.class_selector.button_confirm"), e -> {
		}).bounds(this.leftPos + 108, this.topPos + 109, 56, 20).build();
		guistate.put("button:button_confirm", button_confirm);
		this.addRenderableWidget(button_confirm);
	}
}
