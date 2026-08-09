package equipment.allofcreate.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class EnderArmorBootsTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof net.minecraft.world.entity.player.Player _player && _player.getInventory().getArmor(3).getItem() == equipment.allofcreate.item.EnderArmorItem.HELMET.get()
				&& _player.getInventory().getArmor(2).getItem() == equipment.allofcreate.item.EnderArmorItem.CHESTPLATE.get()
				&& _player.getInventory().getArmor(1).getItem() == equipment.allofcreate.item.EnderArmorItem.LEGGINGS.get()
				&& _player.getInventory().getArmor(0).getItem() == equipment.allofcreate.item.EnderArmorItem.BOOTS.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, false, false));
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0, false, false));
		}
	}
}
