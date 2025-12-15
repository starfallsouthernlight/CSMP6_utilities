package net.mcreator.csmputilities.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.csmputilities.entity.TontinEntity;
import net.mcreator.csmputilities.client.model.animations.tontinmodelotwoAnimation;
import net.mcreator.csmputilities.client.model.Modeltontinmodelotwo;

public class TontinRenderer extends MobRenderer<TontinEntity, Modeltontinmodelotwo<TontinEntity>> {
	public TontinRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeltontinmodelotwo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TontinEntity entity) {
		return ResourceLocation.parse("csmp_utilities:textures/entities/texturanormal.png");
	}

	private static final class AnimatedModel extends Modeltontinmodelotwo<TontinEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<TontinEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(TontinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, tontinmodelotwoAnimation.idle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(TontinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}