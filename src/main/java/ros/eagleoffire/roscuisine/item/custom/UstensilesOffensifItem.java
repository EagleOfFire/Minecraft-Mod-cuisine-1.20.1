package ros.eagleoffire.roscuisine.item.custom;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class UstensilesOffensifItem extends SwordItem {
    public UstensilesOffensifItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
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
