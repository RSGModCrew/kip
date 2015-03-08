package com.acgmodcrew.kip.block;

import com.acgmodcrew.kip.kip;
import com.acgmodcrew.kip.tileentity.TileEntityRepositry;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
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

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        player.openGui(kip.instance, 0, world, x, y, z);
        return true;
    }

}