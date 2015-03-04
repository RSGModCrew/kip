package com.acgmodcrew.kip.item;

import net.minecraft.item.ItemStack;

/**
 * Created by Malec on 04/03/2015.
 */
public class ItemSumOfAllKnowledge extends ItemKip
{
    public ItemSumOfAllKnowledge()
    {
        super();
        this.setUnlocalizedName("sum_of_all_knowledge");
        this.setMaxStackSize(1);

    }

    @Override
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
}
