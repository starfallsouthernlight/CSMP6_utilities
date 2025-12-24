/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.csmputilities.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.csmputilities.block.VoidedPortalBlock;
import net.mcreator.csmputilities.block.TazadechocolateBlock;
import net.mcreator.csmputilities.block.CreeperOroBlock;
import net.mcreator.csmputilities.CsmpUtilitiesMod;

public class CsmpUtilitiesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CsmpUtilitiesMod.MODID);
	public static final DeferredBlock<Block> VOIDED_PORTAL;
	public static final DeferredBlock<Block> CREEPER_ORO;
	public static final DeferredBlock<Block> TAZADECHOCOLATE;
	static {
		VOIDED_PORTAL = REGISTRY.register("voided_portal", VoidedPortalBlock::new);
		CREEPER_ORO = REGISTRY.register("creeper_oro", CreeperOroBlock::new);
		TAZADECHOCOLATE = REGISTRY.register("tazadechocolate", TazadechocolateBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}