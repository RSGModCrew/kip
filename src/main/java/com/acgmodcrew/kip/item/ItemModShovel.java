package com.acgmodcrew.kip.item;

import com.acgmodcrew.kip.creativetab.CreativeTabKip;
import com.acgmodcrew.kip.reference.Reference;
import net.minecraft.item.ItemSpade;

/**
 * Created by Malec on 03/03/2015.
 */
public class ItemModShovel extends ItemSpade
{

    public ItemModShovel(String unlocalizedName, ToolMaterial material)
    {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Reference.MOD_ID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabKip.KIP_TAB);
    }
}