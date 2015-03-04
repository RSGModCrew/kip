package com.acgmodcrew.kip.creativetab;

import com.acgmodcrew.kip.init.ModItems;
import com.acgmodcrew.kip.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Malec on 23/02/2015.
 */
public class CreativeTabKip
{

    public static final CreativeTabs KIP_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {

        @Override
        public Item getTabIconItem()
        {
            return ModItems.knowledgium_ingot;
        }


    };


}
