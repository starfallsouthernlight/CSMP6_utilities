/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.csmputilities.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.csmputilities.client.particle.AcidParticle;

@EventBusSubscriber(Dist.CLIENT)
public class CsmpUtilitiesModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CsmpUtilitiesModParticleTypes.ACID.get(), AcidParticle::provider);
	}
}