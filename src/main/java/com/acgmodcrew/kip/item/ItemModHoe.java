package com.acgmodcrew.kip.item;

import com.acgmodcrew.kip.reference.Reference;
import net.minecraft.item.ItemHoe;

/**
 * Created by Malec on 03/03/2015.
 */
public class ItemModHoe extends ItemHoe
{

    public ItemModHoe(String unlocalizedName, ToolMaterial material)
    {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Reference.MOD_ID + ":" + unlocalizedName);
    }
}