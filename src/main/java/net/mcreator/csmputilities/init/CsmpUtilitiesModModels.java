/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.csmputilities.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.csmputilities.client.model.Modeltontinmodelotwo;
import net.mcreator.csmputilities.client.model.Modelgorrita;
import net.mcreator.csmputilities.client.model.ModelNekoCaaat;
import net.mcreator.csmputilities.client.model.ModelGORRA_CASCANUEZ_Converted;

@EventBusSubscriber(Dist.CLIENT)
public class CsmpUtilitiesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltontinmodelotwo.LAYER_LOCATION, Modeltontinmodelotwo::createBodyLayer);
		event.registerLayerDefinition(ModelGORRA_CASCANUEZ_Converted.LAYER_LOCATION, ModelGORRA_CASCANUEZ_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelgorrita.LAYER_LOCATION, Modelgorrita::createBodyLayer);
		event.registerLayerDefinition(ModelNekoCaaat.LAYER_LOCATION, ModelNekoCaaat::createBodyLayer);
	}
}