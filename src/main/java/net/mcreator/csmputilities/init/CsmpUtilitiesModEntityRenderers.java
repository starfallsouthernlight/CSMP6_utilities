/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.csmputilities.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.csmputilities.client.renderer.TontinRenderer;
import net.mcreator.csmputilities.client.renderer.NekoCaaatRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class CsmpUtilitiesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CsmpUtilitiesModEntities.NEKO_CAAAT.get(), NekoCaaatRenderer::new);
		event.registerEntityRenderer(CsmpUtilitiesModEntities.TONTIN.get(), TontinRenderer::new);
	}
}