package com.acgmodcrew.kip.item;

import com.acgmodcrew.kip.creativetab.CreativeTabKip;
import com.acgmodcrew.kip.handler.ConfigurationHandler;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Malec on 23/02/2015.
 */
public class ItemKnowledgiumIngot extends ItemKip
{

    public ItemKnowledgiumIngot()
    {
        super();
        this.setUnlocalizedName("knowledgium_ingot");
        this.setCreativeTab(CreativeTabKip.KIP_TAB);

    }

    @Override
    public ItemStack onItemRightClick (ItemStack stack, World world, EntityPlayer player)
    {
            EntityXPOrb entity = new EntityXPOrb(world, player.posX, player.posY + 1, player.posZ, ConfigurationHandler.oreDropNumber);
            spawnEntity(player.posX, player.posY + 1, player.posZ, entity, world, player);
            if (!player.capabilities.isCreativeMode)
                stack.stackSize--;
        return stack;
    }

    private void spawnEntity(double posX, double v, double posZ, EntityXPOrb entity, World world, EntityPlayer player)
    {
        if (!world.isRemote)
        {
            world.spawnEntityInWorld(entity);
        }
    }
    }



