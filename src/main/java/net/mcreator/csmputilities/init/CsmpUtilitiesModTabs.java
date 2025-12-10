/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.csmputilities.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.csmputilities.CsmpUtilitiesMod;

@EventBusSubscriber
public class CsmpUtilitiesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CsmpUtilitiesMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CsmpUtilitiesModItems.GORRA_HELMET.get());
			tabData.accept(CsmpUtilitiesModItems.CASCOOO_HELMET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CsmpUtilitiesModItems.NEKO_CAAAT_SPAWN_EGG.get());
		}
	}
}