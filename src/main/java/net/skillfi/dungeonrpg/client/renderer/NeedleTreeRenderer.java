
package net.skillfi.dungeonrpg.client.renderer;

import net.skillfi.dungeonrpg.entity.NeedleTreeEntity;
import net.skillfi.dungeonrpg.client.model.ModelNeedleTree;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class NeedleTreeRenderer extends MobRenderer<NeedleTreeEntity, ModelNeedleTree<NeedleTreeEntity>> {
	public NeedleTreeRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNeedleTree(context.bakeLayer(ModelNeedleTree.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NeedleTreeEntity entity) {
		return new ResourceLocation("dungeon_rpg:textures/entities/needletreetexture.png");
	}
}
