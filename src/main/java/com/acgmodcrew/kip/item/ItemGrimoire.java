package com.acgmodcrew.kip.item;

import net.minecraft.item.ItemStack;

/**
 * Created by Malec on 04/03/2015.
 */
public class ItemGrimoire extends ItemKip
{
    public ItemGrimoire()
    {
        super();
        this.setUnlocalizedName("grimoire");
        this.setMaxStackSize(1);

    }


    public int getItemEnchantability()
    {
        return 1;
    }

    public boolean isItemTool(ItemStack p_77616_1_)
    {
        return p_77616_1_.stackSize == 1;
    }


}

