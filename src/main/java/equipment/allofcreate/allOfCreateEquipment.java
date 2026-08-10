package equipment.allofcreate;

import equipment.allofcreate.item.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(allOfCreateEquipment.MODID)
public class allOfCreateEquipment {
    public static final String MODID = "allofcreateequipment";
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, MODID);

    // Регистрация предметов
    public static final DeferredHolder<Item, Item> ENDER_CRYSTAL_INGOT = ITEMS.register("ender_crystal_ingot", () -> new EndercrystalingotItem());
    public static final DeferredHolder<Item, Item> CRUDE_ENDER_INGOT = ITEMS.register("crude_ender_ingot", () -> new CrudeenderingotItem());
    public static final DeferredHolder<Item, Item> ENDER_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("ender_upgrade_smithing_template", () -> new EnderupgradesmithingtemplateItem());
    public static final DeferredHolder<Item, Item> ENDER_SWORD = ITEMS.register("ender_sword", () -> new EnderSwordItem());

    // Регистрация брони
    public static final DeferredHolder<Item, Item> ENDER_ARMOR_HELMET = ITEMS.register("ender_armor_helmet", () -> new EnderArmorItem.Helmet());
    public static final DeferredHolder<Item, Item> ENDER_ARMOR_CHESTPLATE = ITEMS.register("ender_armor_chestplate", () -> new EnderArmorItem.Chestplate());
    public static final DeferredHolder<Item, Item> ENDER_ARMOR_LEGGINGS = ITEMS.register("ender_armor_leggings", () -> new EnderArmorItem.Leggings());
    public static final DeferredHolder<Item, Item> ENDER_ARMOR_BOOTS = ITEMS.register("ender_armor_boots", () -> new EnderArmorItem.Boots());

    // Мосты для процедур MCreator
    public static final DeferredHolder<Item, Item> HELMET = ENDER_ARMOR_HELMET;
    public static final DeferredHolder<Item, Item> CHESTPLATE = ENDER_ARMOR_CHESTPLATE;
    public static final DeferredHolder<Item, Item> LEGGINGS = ENDER_ARMOR_LEGGINGS;
    public static final DeferredHolder<Item, Item> BOOTS = ENDER_ARMOR_BOOTS;

    public allOfCreateEquipment(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ENDER_CRYSTAL_INGOT.get());
            event.accept(CRUDE_ENDER_INGOT.get());
            event.accept(ENDER_UPGRADE_SMITHING_TEMPLATE.get());
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ENDER_SWORD.get());
            event.accept(ENDER_ARMOR_HELMET.get());
            event.accept(ENDER_ARMOR_CHESTPLATE.get());
            event.accept(ENDER_ARMOR_LEGGINGS.get());
            event.accept(ENDER_ARMOR_BOOTS.get());
        }
    }
}
