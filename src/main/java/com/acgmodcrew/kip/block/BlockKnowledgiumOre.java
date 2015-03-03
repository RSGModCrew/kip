package com.acgmodcrew.kip.block;

import com.acgmodcrew.kip.handler.ConfigurationHandler;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

/**
 * Created by Malec on 23/02/2015.
 */
public class BlockKnowledgiumOre extends BlockKipOre
{

    public BlockKnowledgiumOre()
    {
        super();
        this.setBlockName("KnowledgiumOre");



    }

    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int fortune)
    {
        int xp = ConfigurationHandler.oreDropNumber;
                switch (fortune)
                {
                    case 0: //default
                    case 1: xp = xp+(xp/2);
                    case 2: xp = 2*xp;
                    case 3: xp = 3*xp;
                    default: //default
                    return xp;
                }
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return null;
    }
}
