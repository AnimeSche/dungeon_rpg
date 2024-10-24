
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skillfi.dungeonrpg.init;

import net.skillfi.dungeonrpg.client.renderer.NeedleTreeRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DungeonRpgModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DungeonRpgModEntities.NEEDLE_TREE.get(), NeedleTreeRenderer::new);
	}
}
