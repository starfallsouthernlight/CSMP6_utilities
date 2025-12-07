/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.csmputilities.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.csmputilities.item.CascodeCascanuezItem;
import net.mcreator.csmputilities.CsmpUtilitiesMod;

public class CsmpUtilitiesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CsmpUtilitiesMod.MODID);
	public static final DeferredItem<Item> CASCODE_CASCANUEZ_HELMET;
	static {
		CASCODE_CASCANUEZ_HELMET = REGISTRY.register("cascode_cascanuez_helmet", CascodeCascanuezItem.Helmet::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}