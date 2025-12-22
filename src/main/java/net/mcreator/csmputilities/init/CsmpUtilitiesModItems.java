/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.csmputilities.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.csmputilities.item.TazaItem;
import net.mcreator.csmputilities.item.GorraItem;
import net.mcreator.csmputilities.item.DashCrystalItem;
import net.mcreator.csmputilities.item.CascoooItem;
import net.mcreator.csmputilities.CsmpUtilitiesMod;

public class CsmpUtilitiesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CsmpUtilitiesMod.MODID);
	public static final DeferredItem<Item> GORRA_HELMET;
	public static final DeferredItem<Item> CASCOOO_HELMET;
	public static final DeferredItem<Item> NEKO_CAAAT_SPAWN_EGG;
	public static final DeferredItem<Item> TONTIN_SPAWN_EGG;
	public static final DeferredItem<Item> DASH_CRYSTAL;
	public static final DeferredItem<Item> CREEPER_ORO;
	public static final DeferredItem<Item> TAZA;
	static {
		GORRA_HELMET = REGISTRY.register("gorra_helmet", GorraItem.Helmet::new);
		CASCOOO_HELMET = REGISTRY.register("cascooo_helmet", CascoooItem.Helmet::new);
		NEKO_CAAAT_SPAWN_EGG = REGISTRY.register("neko_caaat_spawn_egg", () -> new DeferredSpawnEggItem(CsmpUtilitiesModEntities.NEKO_CAAAT, -1, -1, new Item.Properties()));
		TONTIN_SPAWN_EGG = REGISTRY.register("tontin_spawn_egg", () -> new DeferredSpawnEggItem(CsmpUtilitiesModEntities.TONTIN, -1, -1, new Item.Properties()));
		DASH_CRYSTAL = REGISTRY.register("dash_crystal", DashCrystalItem::new);
		CREEPER_ORO = block(CsmpUtilitiesModBlocks.CREEPER_ORO);
		TAZA = REGISTRY.register("taza", TazaItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}