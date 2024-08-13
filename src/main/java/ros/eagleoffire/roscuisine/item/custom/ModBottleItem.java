package ros.eagleoffire.roscuisine.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import ros.eagleoffire.roscuisine.item.ModItems;

public class ModBottleItem extends Item {
    public ModBottleItem() {
        super(new Properties());
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return ModItems.BOUTEILLE_VIDE.get().getDefaultInstance();
    }
}
