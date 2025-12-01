/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.csmputilities.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.csmputilities.CsmpUtilitiesMod;

@EventBusSubscriber
public class CsmpUtilitiesModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, CsmpUtilitiesMod.MODID);
	public static final DeferredHolder<Attribute, Attribute> FUGITIVE = REGISTRY.register("fugitive", () -> new RangedAttribute("attribute.csmp_utilities.fugitive", 0, 0, 1).setSyncable(true).setSentiment(Attribute.Sentiment.NEGATIVE));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(EntityType.PLAYER, FUGITIVE);
	}
}