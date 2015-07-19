package com.acgmodcrew.kip.client.gui.slot;

import com.acgmodcrew.kip.item.ItemGrimoire;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

/**
 * Created by Malec on 07/03/2015.
 */
public class GrimSlot extends Slot
{

    public GrimSlot(IInventory p_i1824_1_, int p_i1824_2_, int p_i1824_3_, int p_i1824_4_)
    {
        super(p_i1824_1_, p_i1824_2_, p_i1824_3_, p_i1824_4_);

    }

    @Override
    public boolean isItemValid(ItemStack stack)
    {
        return stack.getItem().equals(new ItemGrimoire());
    }
}
