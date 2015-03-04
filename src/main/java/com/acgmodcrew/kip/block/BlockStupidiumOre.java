package com.acgmodcrew.kip.block;

import com.acgmodcrew.kip.handler.ConfigurationHandler;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.world.World;

/**
 * Created by Malec on 01/03/2015.
 */
public class BlockStupidiumOre extends BlockKipOre
{
    public BlockStupidiumOre()
    {
        super();
        this.setBlockName("stupidium_ore");

    }

    @Override
    public void onBlockDestroyedByPlayer(World world, int pos_x, int pos_y, int pos_z, int p_149664_5_)
    {
        if (!world.isRemote)
        {
            EntityXPOrb entity = new EntityXPOrb(world, pos_x, pos_y, pos_z, -ConfigurationHandler.oreDropNumber);
            world.spawnEntityInWorld(entity);
        }

        super.onBlockDestroyedByPlayer(world, pos_x,  pos_y,  pos_z, p_149664_5_);
    }
}
