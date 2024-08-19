package ros.eagleoffire.roscuisine.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import ros.eagleoffire.roscuisine.item.ModItems;

public class WashableItem extends Item {
    public WashableItem() {
        super(new Item.Properties());
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        ItemStack transformedItem = new ItemStack(Items.AIR);

        // Ray trace to find the block the player is looking at
        BlockHitResult hitResult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);

        // Check if the hit result is a block and that the block is water
        if (hitResult.getType() == HitResult.Type.BLOCK) {
            BlockState blockState = level.getBlockState(hitResult.getBlockPos());
            if (blockState.getFluidState().getType() == Fluids.WATER) {
                // Transform the item in the player's hand
                if (!level.isClientSide) {
                    itemstack.shrink(1);
                    if (itemstack.getItem() == ModItems.BOL_SALE.get()) {
                        transformedItem = new ItemStack(ModItems.BOL.get());
                    }else if ((itemstack.getItem() == ModItems.ASSIETTE_SALE.get()) ) {
                        transformedItem = new ItemStack(ModItems.ASSIETTE.get());
                    }
                    if (!player.addItem(transformedItem)) {
                        // If the inventory is full, drop the item in the world
                        player.drop(transformedItem, false);
                    }
                }

                return InteractionResultHolder.success(itemstack);
            }
        }

        // If the block is not water or no block was hit, return PASS to allow other interactions
        return InteractionResultHolder.pass(itemstack);
    }
}
