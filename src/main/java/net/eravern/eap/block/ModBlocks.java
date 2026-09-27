package net.eravern.eap.block;

import net.eravern.eap.EravernsAnimalProducts;
import net.eravern.eap.block.custom.CookedChopBlock;
import net.eravern.eap.block.custom.RawChopBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EravernsAnimalProducts.MODID);


    public static final DeferredBlock<Block> RAW_ANCIENT_CHOP = register("raw_ancient_chop",
                () -> new RawChopBlock(BlockBehaviour.Properties.of().forceSolidOn().strength(0.5F)
                        .sound(SoundType.WET_SPONGE).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> COOKED_ANCIENT_CHOP = register("cooked_ancient_chop",
            () -> new CookedChopBlock(BlockBehaviour.Properties.of().forceSolidOn().strength(0.5F)
                    .sound(SoundType.SPONGE).pushReaction(PushReaction.DESTROY)));

    private static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }

    public static void registerBlocks(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
