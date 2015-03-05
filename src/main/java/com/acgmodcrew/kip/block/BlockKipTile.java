package com.acgmodcrew.kip.block;

import com.acgmodcrew.kip.creativetab.CreativeTabKip;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

/**
 * Created by Malec on 05/03/2015.
 */
public abstract class BlockKipTile extends BlockContainer
{
    public BlockKipTile(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabKip.KIP_TAB);

    }

}
