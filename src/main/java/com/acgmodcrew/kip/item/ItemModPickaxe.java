package com.acgmodcrew.kip.item;

import com.acgmodcrew.kip.creativetab.CreativeTabKip;
import com.acgmodcrew.kip.reference.Reference;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Malec on 03/03/2015.
 */
public class ItemModPickaxe extends ItemPickaxe
{

    public ItemModPickaxe(String unlocalizedName, ToolMaterial material)
    {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Reference.MOD_ID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabKip.KIP_TAB);
    }
}