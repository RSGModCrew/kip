package com.acgmodcrew.kip.handler;

import com.acgmodcrew.kip.client.Container.ContainerRepository;
import com.acgmodcrew.kip.client.gui.RepositoryGui;
import com.acgmodcrew.kip.tileentity.TileEntityRepositry;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Malec on 07/03/2015.
 */
public class guiHandler implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if( ID == 0)
        {
            TileEntityRepositry repositry = (TileEntityRepositry) world.getTileEntity(x,y,z);
            return new ContainerRepository(player.inventory,repositry);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if( ID == 0)
        {
            TileEntityRepositry repositry = (TileEntityRepositry) world.getTileEntity(x, y, z);
            return new RepositoryGui(player.inventory,repositry);
        }
        return null;
}}