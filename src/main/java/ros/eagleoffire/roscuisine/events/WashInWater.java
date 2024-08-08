package ros.eagleoffire.roscuisine.events;

public class AssietteTransformInWater {
    @SubscribeEvent
    public static void onItemEnterWorld(EntityJoinWorldEvent event) {
        if (event.getEntity() instanceof ItemEntity itemEntity) {
            // Check if the item is in water
            if (itemEntity.level.getBlockState(itemEntity.blockPosition()).getFluidState().getType() == Fluids.WATER) {
                // Check if the item is the one you want to transform
                if (itemEntity.getItem().getItem() == Items.YOUR_ITEM) {
                    // Set the new item (replace YOUR_TRANSFORMED_ITEM with the item you want to transform to)
                    itemEntity.setItem(new ItemStack(Items.YOUR_TRANSFORMED_ITEM));
                }
            }
        }
    }
}
