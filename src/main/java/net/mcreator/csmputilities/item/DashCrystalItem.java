package net.mcreator.csmputilities.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.client.Minecraft;

import net.mcreator.csmputilities.procedures.DashCrystalRightclickedProcedure;
import net.mcreator.csmputilities.procedures.DashCrystalHasItemGlowingEffectProcedure;

public class DashCrystalItem extends Item {
	public DashCrystalItem() {
		super(new Item.Properties());
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		Entity entity = Minecraft.getInstance().player;
		return DashCrystalHasItemGlowingEffectProcedure.execute(entity);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		DashCrystalRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}