package net.eravern.eap.block.custom;

import net.eravern.eap.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class RawChopBlock extends Block {
    public static final IntegerProperty MEAT_BITES = IntegerProperty.create("meat_bites", 0, 3);
    public static final int MAX_BITES = 3;
    public static final IntegerProperty BITES = MEAT_BITES;
    protected static final VoxelShape[] SHAPE_BY_BITE = new VoxelShape[]{Block.box(2.0, 2.0, 2.0, 14.0, 14.0, 14.0), Block.box(2.0, 2.0, 2.0, 14.0, 11.0, 14.0), Block.box(2.0, 2.0, 2.0, 14.0, 8.0, 14.0), Block.box(2.0, 2.0, 2.0, 14.0, 5.0, 14.0)};

    public RawChopBlock(Properties properties) {
        super(properties);
    }

    protected @NotNull VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE_BY_BITE[state.getValue(BITES)];
    }

    protected @NotNull InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        int i = state.getValue(BITES);
        if (i < MAX_BITES){
            ItemEntity itemDrop = new ItemEntity(level, pos.getBottomCenter().x, pos.getBottomCenter().y+0.5, pos.getBottomCenter().z, ModItems.RAW_ANCIENT_MEATCHOP.toStack());
            level.addFreshEntity(itemDrop);
            level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS);
            level.setBlock(pos, state.setValue(BITES, i + 1), 3);
        }else{
            ItemEntity itemDrop = new ItemEntity(level, pos.getBottomCenter().x, pos.getBottomCenter().y+0.5, pos.getBottomCenter().z, ModItems.RAW_ANCIENT_MEATCHOP.toStack());
            ItemEntity boneDrop = new ItemEntity(level, pos.getBottomCenter().x, pos.getBottomCenter().y+0.5, pos.getBottomCenter().z, Items.BONE.getDefaultInstance());
            level.addFreshEntity(itemDrop);
            level.addFreshEntity(boneDrop);
            level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS);
            level.removeBlock(pos, false);
            level.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
        }
        return InteractionResult.SUCCESS;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{BITES});
    }

    protected boolean isPathfindable(BlockState state, PathComputationType pathComputationType) {
        return false;
    }

}
