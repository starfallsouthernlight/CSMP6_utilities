package net.mcreator.csmputilities.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeltontinmodelotwo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("csmp_utilities", "modeltontinmodelotwo"), "main");
	public final ModelPart Waist;
	public final ModelPart Head;
	public final ModelPart Cabeza;
	public final ModelPart abiertos;
	public final ModelPart copete;
	public final ModelPart cerrados;
	public final ModelPart sombrero;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart baston;
	public final ModelPart bloquedecontrol;

	public Modeltontinmodelotwo(ModelPart root) {
		this.Waist = root.getChild("Waist");
		this.Head = this.Waist.getChild("Head");
		this.Cabeza = this.Head.getChild("Cabeza");
		this.abiertos = this.Head.getChild("abiertos");
		this.copete = this.Head.getChild("copete");
		this.cerrados = this.Head.getChild("cerrados");
		this.sombrero = this.Head.getChild("sombrero");
		this.Body = this.Waist.getChild("Body");
		this.RightArm = this.Waist.getChild("RightArm");
		this.LeftArm = this.Waist.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.baston = root.getChild("baston");
		this.bloquedecontrol = this.baston.getChild("bloquedecontrol");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Waist = partdefinition.addOrReplaceChild("Waist", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition Head = Waist.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition Cabeza = Head.addOrReplaceChild("Cabeza",
				CubeListBuilder.create().texOffs(0, 31).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 31).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition abiertos = Head.addOrReplaceChild("abiertos", CubeListBuilder.create().texOffs(40, 27).addBox(-4.0F, -1.5F, 0.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, -4.0F));
		PartDefinition copete = Head.addOrReplaceChild("copete", CubeListBuilder.create(), PartPose.offset(-2.4F, -7.8F, -4.3F));
		PartDefinition copete_r1 = copete.addOrReplaceChild("copete_r1", CubeListBuilder.create().texOffs(64, 27).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cerrados = Head.addOrReplaceChild("cerrados", CubeListBuilder.create().texOffs(64, 36).addBox(-4.0F, -1.5F, 0.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, -4.0F));
		PartDefinition sombrero = Head.addOrReplaceChild("sombrero", CubeListBuilder.create(), PartPose.offset(0.2F, -7.1F, 0.0F));
		PartDefinition cube_r1 = sombrero.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 0).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r2 = sombrero.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 20).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(40, 11).addBox(-4.0F, -6.1F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 47).addBox(-4.0F, -6.1F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -5.9F, 0.0F));
		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(24, 47).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 47).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, -10.0F, 0.0F));
		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(56, 47).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, -10.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(16, 63).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 63).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 18.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(48, 63).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 11).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 18.0F, 0.0F));
		PartDefinition baston = partdefinition.addOrReplaceChild("baston", CubeListBuilder.create().texOffs(0, 0).addBox(-0.625F, -0.625F, -6.975F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(56, 27)
				.addBox(-1.625F, -1.625F, -7.975F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 63).addBox(-1.125F, -1.125F, -7.075F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.375F, 10.625F, -7.025F));
		PartDefinition bloquedecontrol = baston.addOrReplaceChild("bloquedecontrol", CubeListBuilder.create(), PartPose.offset(-0.125F, -0.125F, -10.575F));
		PartDefinition cube_r3 = bloquedecontrol.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 39).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3693F, -0.5484F, -0.6572F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		baston.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}