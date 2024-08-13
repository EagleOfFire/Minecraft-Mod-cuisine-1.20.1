package ros.eagleoffire.roscuisine.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;


public class UstensilesItem extends Item {
    public UstensilesItem() {
        super(new Properties().stacksTo(1).durability(20));
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        ItemStack old = stack.copy();

        if (old.getDamageValue() >= old.getMaxDamage() - 1){
            return ItemStack.EMPTY;
        }else {
            old.setDamageValue(old.getDamageValue() + 1);
            return old;
        }
    }
}
