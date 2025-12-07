// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart bone;

	public ModelCustomModel(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.9889F, 7.6667F, -4.1778F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
				.addBox(-3.9889F, -4.3333F, -3.1778F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 13)
				.addBox(-2.9889F, -3.3333F, -2.1778F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
				.addBox(-2.4889F, -4.3333F, -1.4778F, 5.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
				.addBox(-1.0889F, -6.3333F, 0.0222F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 33)
				.addBox(-4.9889F, 9.6667F, 4.8222F, 10.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(2.0111F, -0.3333F, -3.5778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.9889F, -0.3333F, -3.5778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0111F, -16.6667F, -0.8222F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(40, 4).addBox(-2.591F, -2.591F, -5.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0111F, 3.9167F, 0.8222F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}