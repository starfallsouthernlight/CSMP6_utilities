package net.mcreator.csmputilities.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.csmputilities.init.CsmpUtilitiesModAttributes;

import javax.annotation.Nullable;

@EventBusSubscriber
public class DefendersbuffProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (1 == (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(CsmpUtilitiesModAttributes.DEFENDERS) ? _livingEntity0.getAttribute(CsmpUtilitiesModAttributes.DEFENDERS).getBaseValue() : 0)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2, 0));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 2, 1));
		} else if (2 == (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(CsmpUtilitiesModAttributes.DEFENDERS) ? _livingEntity3.getAttribute(CsmpUtilitiesModAttributes.DEFENDERS).getBaseValue() : 0)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 2, 2));
		} else if (3 == (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(CsmpUtilitiesModAttributes.DEFENDERS) ? _livingEntity6.getAttribute(CsmpUtilitiesModAttributes.DEFENDERS).getBaseValue() : 0)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 2, 3));
		} else if (4 == (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(CsmpUtilitiesModAttributes.DEFENDERS) ? _livingEntity9.getAttribute(CsmpUtilitiesModAttributes.DEFENDERS).getBaseValue() : 0)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 2, 4));
		}
	}
}