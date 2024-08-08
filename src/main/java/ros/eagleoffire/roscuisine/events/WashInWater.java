package ros.eagleoffire.roscuisine.events;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import ros.eagleoffire.roscuisine.item.ModItems;

@Mod.EventBusSubscriber(modid = "roscuisine")
public class WashInWater {

    private static int tickCounter = 0;

/*    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            tickCounter++;
            // Perform the check every 20 ticks (1 second)
            if (tickCounter >= 40) {
                tickCounter = 0;  // Reset the counter
                // Get the player's current position
                Vec3 playerPos = event.player.position();

                // Define a bounding box around the player to look for items
                AABB box = new AABB(playerPos.x - 5, playerPos.y - 5, playerPos.z - 5, playerPos.x + 5, playerPos.y + 5, playerPos.z + 5);

                // Get all items within the bounding box
                for (ItemEntity itemEntity : event.player.level().getEntitiesOfClass(ItemEntity.class, box, itemEntity -> true)) {
                    // Check if the item is in water
                    if (itemEntity.level().getBlockState(itemEntity.blockPosition()).getFluidState().getType() == Fluids.WATER) {
                        // Check if the item is the one you want to transform
                        if (itemEntity.getItem().getItem() == ModItems.BOL_SALE.get()) {
                            // Transform the item
                            itemEntity.setItem(new ItemStack(ModItems.BOL.get()));
                        }
                        if (itemEntity.getItem().getItem() == ModItems.ASSIETTE_SALE.get()) {
                            itemEntity.setItem(new ItemStack(ModItems.ASSIETTE.get()));
                        }
                    }
                }
            }
        }
    }*/
}
