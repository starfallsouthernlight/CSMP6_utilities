// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGORRA_CASCANUEZ_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gorra_cascanuez_converted"), "main");
	private final ModelPart group;

	public ModelGORRA_CASCANUEZ_Converted(ModelPart root) {
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition group = partdefinition.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -8.0F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-4.0F, -20.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 13)
						.addBox(-3.0F, -19.0F, -3.0F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-2.5F, -20.0F, -2.3F, 5.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-1.1F, -22.0F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 33)
						.addBox(-5.0F, -6.0F, 4.0F, 10.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -16.0F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -16.0F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = group.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(40, 4).addBox(-1.0F, 7.0F, 3.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.7F, -18.7F, -8.0F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}