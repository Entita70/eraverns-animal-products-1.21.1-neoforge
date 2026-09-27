package net.eravern.eap.item;

import net.eravern.eap.EravernsAnimalProducts;
import net.eravern.eap.block.ModBlocks;
import net.eravern.eap.item.custom.ModFoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EravernsAnimalProducts.MODID);

    public static final DeferredItem<Item> RAW_HORSE_STEAK = ITEMS.register("raw_horse_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_HORSE_STEAK)));

    public static final DeferredItem<Item> COOKED_HORSE_STEAK = ITEMS.register("cooked_horse_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_HORSE_STEAK)));

    public static final DeferredItem<Item> RAW_WILD_MEAT = ITEMS.register("raw_wild_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_WILD_MEAT)));

    public static final DeferredItem<Item> COOKED_WILD_MEAT = ITEMS.register("cooked_wild_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_WILD_MEAT)));

    public static final DeferredItem<Item> SQUID_TENTACLE = ITEMS.register("squid_tentacle",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SQUID_TENTACLE)));

    public static final DeferredItem<Item> COOKED_SQUID_TENTACLE = ITEMS.register("cooked_squid_tentacle",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_SQUID_TENTACLE)));

    public static final DeferredItem<Item> BEE = ITEMS.register("bee",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BEE)));

    public static final DeferredItem<Item> COOKED_BEE = ITEMS.register("cooked_bee",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_BEE)));

    public static final DeferredItem<Item> FROG_LEG = ITEMS.register("frog_leg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FROG_LEG)));

    public static final DeferredItem<Item> COOKED_FROG_LEG = ITEMS.register("cooked_frog_leg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_FROG_LEG)));

    public static final DeferredItem<Item> COLD_STRIDER_SHANK = ITEMS.register("cold_strider_shank",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COLD_STRIDER_SHANK).fireResistant()));

    public static final DeferredItem<Item> HOT_STRIDER_SHANK = ITEMS.register("hot_strider_shank",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HOT_STRIDER_SHANK).fireResistant()));

    public static final DeferredItem<Item> RAW_ANCIENT_MEATCHOP = ITEMS.register("raw_ancient_meatchop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_ANCIENT_MEATCHOP)));

    public static final DeferredItem<Item> COOKED_ANCIENT_MEATCHOP = ITEMS.register("cooked_ancient_meatchop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_ANCIENT_MEATCHOP)));

    public static final DeferredItem<Item> RAW_ANCIENT_CHOP = ITEMS.register("raw_ancient_chop",
            () -> new BlockItem(ModBlocks.RAW_ANCIENT_CHOP.get(), new Item.Properties()));

    public static final DeferredItem<Item> COOKED_ANCIENT_CHOP = ITEMS.register("cooked_ancient_chop",
            () -> new BlockItem(ModBlocks.COOKED_ANCIENT_CHOP.get(), new Item.Properties()));

    public static final DeferredItem<Item> RAW_CAMEL_MEAT = ITEMS.register("raw_camel_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_CAMEL_MEAT)));

    public static final DeferredItem<Item> COOKED_CAMEL_MEAT = ITEMS.register("cooked_camel_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_CAMEL_MEAT)));

    public static final DeferredItem<Item> RAW_CARNIVORE_MEAT = ITEMS.register("raw_carnivore_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_CARNIVORE_MEAT)));

    public static final DeferredItem<Item> COOKED_CARNIVORE_MEAT = ITEMS.register("cooked_carnivore_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_CARNIVORE_MEAT)));

    public static final DeferredItem<Item> AXOLOTL_TAIL = ITEMS.register("axolotl_tail",
            () -> new Item(new Item.Properties().food(ModFoodProperties.AXOLOTL_TAIL)));

    public static final DeferredItem<Item> COOKED_AXOLOTL_TAIL = ITEMS.register("cooked_axolotl_tail",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_AXOLOTL_TAIL)));

    public static void registerItems(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
