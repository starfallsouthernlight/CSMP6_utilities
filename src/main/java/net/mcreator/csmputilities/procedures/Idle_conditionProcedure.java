package net.mcreator.csmputilities.procedures;

import net.minecraft.world.entity.Entity;

public class Idle_conditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isAlive();
	}
}