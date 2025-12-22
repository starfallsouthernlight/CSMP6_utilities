package net.mcreator.csmputilities.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.csmputilities.procedures.CorrotionOnEffectActiveTickProcedure;
import net.mcreator.csmputilities.init.CsmpUtilitiesModParticleTypes;
import net.mcreator.csmputilities.CsmpUtilitiesMod;

public class CorrotionMobEffect extends MobEffect {
	public CorrotionMobEffect() {
		super(MobEffectCategory.HARMFUL, -13369549);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(CsmpUtilitiesMod.MODID, "effect.corrotion_0"), -4, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public ParticleOptions createParticleOptions(MobEffectInstance mobEffectInstance) {
		return (SimpleParticleType) (CsmpUtilitiesModParticleTypes.ACID.get());
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		CorrotionOnEffectActiveTickProcedure.execute(entity.level(), entity);
		return super.applyEffectTick(entity, amplifier);
	}
}