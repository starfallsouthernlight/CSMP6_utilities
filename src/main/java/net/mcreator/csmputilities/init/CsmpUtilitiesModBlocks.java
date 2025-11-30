/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.csmputilities.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.csmputilities.block.BloquecarameloBlock;
import net.mcreator.csmputilities.CsmpUtilitiesMod;

public class CsmpUtilitiesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CsmpUtilitiesMod.MODID);
	public static final DeferredBlock<Block> BLOQUECARAMELO;
	static {
		BLOQUECARAMELO = REGISTRY.register("bloquecaramelo", BloquecarameloBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}