package com.acgmodcrew.kip.init;

import com.acgmodcrew.kip.reference.Names;
import com.acgmodcrew.kip.tileentity.TileEntityRepositry;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Malec on 05/03/2015.
 */
public class ModTileEntities

{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileEntityRepositry.class, Names.TileEntities.REPOSITORY);
    }
}
