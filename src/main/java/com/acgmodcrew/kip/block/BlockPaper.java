package com.acgmodcrew.kip.block;

import net.minecraft.block.material.Material;

/**
 * Created by Malec on 04/03/2015.
 */
public class BlockPaper extends BlockKip
{
    public BlockPaper()
    {
        super(Material.grass);
        this.setBlockName("paper_block");
        this.setHarvestLevel("axe", 1);
    }
}
