package net.mcreator.csmputilities.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

public class CorrotionOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 0, 4) == 0) {
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
		}
		if (Mth.nextInt(RandomSource.create(), 0, 4) == 0) {
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
		}
		if (Mth.nextInt(RandomSource.create(), 0, 4) == 0) {
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
		}
		if (Mth.nextInt(RandomSource.create(), 0, 4) == 0) {
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
		}
	}
}