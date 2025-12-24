package net.mcreator.csmputilities.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.csmputilities.CsmpUtilitiesMod;

public class DISCOItem extends Item {
	public DISCOItem() {
		super(new Item.Properties().jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(CsmpUtilitiesMod.MODID, "disco"))));
	}
}