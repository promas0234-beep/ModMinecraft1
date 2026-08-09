package equipment.allofcreate.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class EnderSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 120, 1, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 1, false, false));
 if (entity instanceof net.minecraft.world.entity.player.Player _player 
                && _player.getInventory().getArmor(3).getItem() == equipment.allofcreate.allOfCreateEquipment.HELMET.get()
                && _player.getInventory().getArmor(2).getItem() == equipment.allofcreate.allOfCreateEquipment.CHESTPLATE.get()
                && _player.getInventory().getArmor(1).getItem() == equipment.allofcreate.allOfCreateEquipment.LEGGINGS.get()
                && _player.getInventory().getArmor(0).getItem() == equipment.allofcreate.allOfCreateEquipment.BOOTS.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 120, 0, false, false));
		}
	}
}
