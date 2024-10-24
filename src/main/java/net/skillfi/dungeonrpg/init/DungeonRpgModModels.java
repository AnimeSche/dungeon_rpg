
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skillfi.dungeonrpg.init;

import net.skillfi.dungeonrpg.client.model.ModelNeedleTree;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DungeonRpgModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelNeedleTree.LAYER_LOCATION, ModelNeedleTree::createBodyLayer);
	}
}
