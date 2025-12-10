package net.mcreator.csmputilities.procedures;

import net.minecraft.world.entity.Entity;

public class Idle_conditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		for (int index0 = 0; index0 < 1e+49; index0++) {
			if (entity.getDeltaMovement().z() == 0 && entity.getDeltaMovement().x() == 0 && entity.getDeltaMovement().y() == 0 && entity.isSprinting()) {
				return true;
			}
		}
		return false;
	}
}