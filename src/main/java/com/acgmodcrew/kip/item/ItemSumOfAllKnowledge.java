package com.acgmodcrew.kip.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
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

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
    }
}
