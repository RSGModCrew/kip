package com.acgmodcrew.kip.block;

import com.acgmodcrew.kip.tileentity.TileEntityRepositry;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Malec on 05/03/2015.
 */
public class BlockRepository extends BlockKipTile
{


    public BlockRepository(Material material)
    {
        super(material);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TileEntityRepositry();
    }
}