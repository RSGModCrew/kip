package com.acgmodcrew.kip.item.armour;

import com.acgmodcrew.kip.creativetab.CreativeTabKip;
import net.minecraft.item.ItemArmor;

/**
 * Created by Malec on 05/03/2015.
 */
public class ItemKipArmour extends ItemArmor
{
    public ItemKipArmour(ArmorMaterial material, int renderDist, int armourType, String unlocalName)
    {
        super(material, renderDist, armourType);
        this.setCreativeTab(CreativeTabKip.KIP_TAB);
        this.setUnlocalizedName(unlocalName);
    }


}
