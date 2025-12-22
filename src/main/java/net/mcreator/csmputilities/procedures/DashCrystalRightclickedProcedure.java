package net.mcreator.csmputilities.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class DashCrystalRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _plrCldCheck1 && _plrCldCheck1.getCooldowns().isOnCooldown(itemstack.getItem()))) {
			if (entity.onGround()) {
				entity.push(((entity.getLookAngle()).x()), 0, ((entity.getLookAngle()).z()));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
			} else {
				entity.push(((entity.getLookAngle()).x()), 0, ((entity.getLookAngle()).z()));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 200);
			}
		}
	}
}