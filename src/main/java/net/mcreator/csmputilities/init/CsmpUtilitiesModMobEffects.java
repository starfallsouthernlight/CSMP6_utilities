/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.csmputilities.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.csmputilities.potion.CorrotionMobEffect;
import net.mcreator.csmputilities.CsmpUtilitiesMod;

public class CsmpUtilitiesModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, CsmpUtilitiesMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> CORROTION = REGISTRY.register("corrotion", () -> new CorrotionMobEffect());
}