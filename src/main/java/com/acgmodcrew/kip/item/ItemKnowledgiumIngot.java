package com.acgmodcrew.kip.item;

import com.acgmodcrew.kip.handler.ConfigurationHandler;
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


    }

    @Override
    public ItemStack onItemRightClick (ItemStack stack, World world, EntityPlayer player)
    {
        player.addExperience(ConfigurationHandler.oreDropNumber);
            if (!player.capabilities.isCreativeMode)
                stack.stackSize--;
        return stack;
    }

    }



