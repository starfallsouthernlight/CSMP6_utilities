package net.mcreator.csmputilities.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.csmputilities.CsmpUtilitiesMod;

public class CorrotionMobEffect extends MobEffect {
	public CorrotionMobEffect() {
		super(MobEffectCategory.HARMFUL, -52225);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(CsmpUtilitiesMod.MODID, "effect.corrotion_0"), -4, AttributeModifier.Operation.ADD_VALUE);
	}
}