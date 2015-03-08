package com.acgmodcrew.kip.client.Container;

import com.acgmodcrew.kip.client.gui.slot.GrimSlot;
import com.acgmodcrew.kip.tileentity.TileEntityRepositry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

/**
 * Created by Malec on 07/03/2015.
 */

public class ContainerRepository extends Container
{
    private TileEntityRepositry repository;
    private EntityPlayer player;


    public ContainerRepository(IInventory playerInv, TileEntityRepositry entity)
    {

        this.repository = entity;
        this.player = ((InventoryPlayer) playerInv).player;
        this.addSlotToContainer(new Slot(entity, 0, 56, 17));
        this.addSlotToContainer(new GrimSlot(entity, 0, 20, 20));

        playerInvLayout(playerInv);


    }


    @Override
    public boolean canInteractWith(EntityPlayer p_75145_1_)
    {
        return repository.isUseableByPlayer(player);
    }

    private void playerInvLayout(IInventory invPlayer)
    {
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
        }
    }
}
