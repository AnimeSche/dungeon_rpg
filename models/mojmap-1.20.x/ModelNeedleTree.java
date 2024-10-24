// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelNeedleTree<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "needletree"), "main");
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart Head;
	private final ModelPart Planks;
	private final ModelPart LeftLeg;
	private final ModelPart RightArm;
	private final ModelPart RightLeg;

	public ModelNeedleTree(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.Head = root.getChild("Head");
		this.Planks = this.Head.getChild("Planks");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightArm = root.getChild("RightArm");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.5F, 23.0F, 0.5F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(34, 19).addBox(-5.0F, -21.0F, -3.0F, 6.0F, 17.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -3.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.0F, -5.75F, -1.25F, 0.1239F, -0.3736F, -0.2852F));

		PartDefinition cube_r2 = LeftArm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.7156F, -0.7866F, -0.6672F, 1.0F, 2.0F, 17.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4602F, 0.2373F, 0.5342F, -1.6185F, 0.4242F, 0.3901F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -9.75F, -0.25F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(36, 0).addBox(-4.0F, -3.0F, -2.0F, 5.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, -4.0F, -1.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Head
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(36, 10).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.25F, 0.75F, 0.25F, 0.0F, 0.0F, 0.0F));

		PartDefinition Planks = Head.addOrReplaceChild("Planks", CubeListBuilder.create(),
				PartPose.offset(1.75F, -2.25F, -0.75F));

		PartDefinition cube_r5 = Planks.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(28, 37).addBox(-2.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.75F, 3.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Planks.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(24, 37).addBox(-2.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, 1.75F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Planks
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(20, 37).addBox(-2.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Planks
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(16, 37).addBox(-2.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(-0.75F, 10.25F, -1.5F));

		PartDefinition LeftKnee_r1 = LeftLeg.addOrReplaceChild("LeftKnee_r1",
				CubeListBuilder.create().texOffs(0, 37).addBox(0.5F, -6.0F, -0.5F, 1.0F, 14.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0396F, 5.7966F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, -5.75F, -1.25F));

		PartDefinition cube_r9 = RightArm.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 19).addBox(-0.5215F, -0.9236F, -0.9038F, 1.0F, 2.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, 0.75F, -1.539F, -0.0429F, -0.0969F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(3.0F, 10.25F, -1.5F));

		PartDefinition RightKnee_r1 = RightLeg.addOrReplaceChild("RightKnee_r1",
				CubeListBuilder.create().texOffs(4, 37).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 14.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0396F, 0.2966F, 0.0F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}