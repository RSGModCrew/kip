package com.acgmodcrew.kip.block;


import net.minecraft.world.World;

/**
 * Created by Malec on 01/03/2015.
 */
public class BlockKnowledgium extends BlockKip
{
    public BlockKnowledgium()
    {
        super();
        this.setBlockName("knowledgium_block");
    }

    @Override
    public float getEnchantPowerBonus(World world, int x, int y, int z)
    { return 1;}
}
