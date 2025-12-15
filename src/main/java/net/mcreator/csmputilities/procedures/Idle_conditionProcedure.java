package net.mcreator.csmputilities.procedures;

import net.minecraft.world.entity.Entity;

public class Idle_conditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getDeltaMovement().z() == 0 && entity.getDeltaMovement().x() == 0 && entity.getDeltaMovement().y() == 0 && entity.isSprinting()) {
			return true;
		}
		return true;
	}
}