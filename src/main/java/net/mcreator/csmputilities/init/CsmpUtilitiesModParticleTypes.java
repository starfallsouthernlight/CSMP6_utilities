/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.csmputilities.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.csmputilities.CsmpUtilitiesMod;

public class CsmpUtilitiesModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, CsmpUtilitiesMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> ACID = REGISTRY.register("acid", () -> new SimpleParticleType(true));
}