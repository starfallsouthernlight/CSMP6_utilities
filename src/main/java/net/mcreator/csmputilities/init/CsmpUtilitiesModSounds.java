/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.csmputilities.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.csmputilities.CsmpUtilitiesMod;

public class CsmpUtilitiesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CsmpUtilitiesMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> THE_TOWN_IN_SKY = REGISTRY.register("the_town_in_sky", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("csmp_utilities", "the_town_in_sky")));
	public static final DeferredHolder<SoundEvent, SoundEvent> THE_TOWN_IN_THE_SKY = REGISTRY.register("the_town_in_the_sky", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("csmp_utilities", "the_town_in_the_sky")));
}