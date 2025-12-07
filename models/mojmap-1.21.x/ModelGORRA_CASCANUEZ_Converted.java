// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGORRA_CASCANUEZ_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gorra_cascanuez_converted"), "main");
	private final ModelPart bone;

	public ModelGORRA_CASCANUEZ_Converted(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-13.0F, -10.0F, 3.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-12.0F, -22.0F, 4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 13)
						.addBox(-11.0F, -21.0F, 5.0F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-10.5F, -22.0F, 5.7F, 5.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-9.1F, -24.0F, 7.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 33)
						.addBox(-13.0F, -8.0F, 12.0F, 10.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -18.0F, 3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -18.0F, 3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(40, 4).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -16.0F, 4.0F, 0.0F, 0.0F, 0.7854F));

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