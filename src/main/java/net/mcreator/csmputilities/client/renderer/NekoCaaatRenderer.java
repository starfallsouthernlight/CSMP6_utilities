package net.mcreator.csmputilities.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.csmputilities.entity.NekoCaaatEntity;
import net.mcreator.csmputilities.client.model.animations.NekoCaaatModelAnimation;
import net.mcreator.csmputilities.client.model.ModelNekoCaaat;

public class NekoCaaatRenderer extends MobRenderer<NekoCaaatEntity, ModelNekoCaaat<NekoCaaatEntity>> {
	public NekoCaaatRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelNekoCaaat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NekoCaaatEntity entity) {
		return ResourceLocation.parse("csmp_utilities:textures/entities/nekocaaattexture.png");
	}

	private static final class AnimatedModel extends ModelNekoCaaat<NekoCaaatEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<NekoCaaatEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(NekoCaaatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, NekoCaaatModelAnimation.idle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(NekoCaaatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}