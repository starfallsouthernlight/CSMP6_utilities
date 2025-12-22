package net.mcreator.csmputilities.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class TazaItem extends Item {
	public TazaItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()));
	}
}