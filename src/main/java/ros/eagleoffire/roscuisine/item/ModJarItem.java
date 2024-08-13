package ros.eagleoffire.roscuisine.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModJarItem extends Item {
    public ModJarItem() {
        super(new Properties().stacksTo(1).durability(20));
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return ModItems.POT_VIDE.get().getDefaultInstance();
    }
}
