package net.eravern.eap;

import net.eravern.eap.block.ModBlocks;
import net.eravern.eap.item.ModItems;
import net.minecraft.world.item.*;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


@Mod(EravernsAnimalProducts.MODID)
public class EravernsAnimalProducts {
    public static final String MODID = "eap";
    public static final Logger LOGGER = LogUtils.getLogger();


    public EravernsAnimalProducts(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);


        ModBlocks.registerBlocks(modEventBus);
        ModItems.registerItems(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.insertAfter(Items.COOKED_BEEF.getDefaultInstance(), ModItems.RAW_HORSE_STEAK.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.RAW_HORSE_STEAK.toStack(), ModItems.COOKED_HORSE_STEAK.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.COOKED_RABBIT.getDefaultInstance(), ModItems.RAW_WILD_MEAT.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.RAW_WILD_MEAT.toStack(), ModItems.COOKED_WILD_MEAT.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.COOKED_SALMON.getDefaultInstance(), ModItems.SQUID_TENTACLE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.SQUID_TENTACLE.toStack(), ModItems.COOKED_SQUID_TENTACLE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.COOKED_WILD_MEAT.toStack(), ModItems.BEE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.BEE.toStack(), ModItems.COOKED_BEE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.COOKED_CHICKEN.getDefaultInstance(), ModItems.FROG_LEG.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.FROG_LEG.toStack(), ModItems.COOKED_FROG_LEG.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.COOKED_BEE.toStack(), ModItems.COLD_STRIDER_SHANK.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.COLD_STRIDER_SHANK.toStack(), ModItems.HOT_STRIDER_SHANK.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.HOT_STRIDER_SHANK.toStack(), ModItems.RAW_ANCIENT_CHOP.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.RAW_ANCIENT_CHOP.toStack(), ModItems.RAW_ANCIENT_MEATCHOP.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.RAW_ANCIENT_MEATCHOP.toStack(), ModItems.COOKED_ANCIENT_CHOP.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.COOKED_ANCIENT_CHOP.toStack(), ModItems.COOKED_ANCIENT_MEATCHOP.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.COOKED_FROG_LEG.toStack(), ModItems.AXOLOTL_TAIL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.AXOLOTL_TAIL.toStack(), ModItems.COOKED_AXOLOTL_TAIL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.COOKED_HORSE_STEAK.toStack(), ModItems.RAW_CAMEL_MEAT.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.RAW_CAMEL_MEAT.toStack(), ModItems.COOKED_CAMEL_MEAT.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.COOKED_CAMEL_MEAT.toStack(), ModItems.RAW_CARNIVORE_MEAT.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.RAW_CARNIVORE_MEAT.toStack(), ModItems.COOKED_CARNIVORE_MEAT.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
