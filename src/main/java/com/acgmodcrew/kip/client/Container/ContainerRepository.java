package com.acgmodcrew.kip.client.Container;

import com.acgmodcrew.kip.client.gui.slot.GrimSlot;
import com.acgmodcrew.kip.tileentity.TileEntityRepositry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
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
        this.addSlotToContainer(new Slot(entity, 0, 12, 7));
        this.addSlotToContainer(new Slot(entity, 1, 12, 26));
        this.addSlotToContainer(new Slot(entity, 2, 12, 63));
        this.addSlotToContainer(new GrimSlot(entity, 3, 12, 82));


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
                this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 12 + j * 18, 102 + i * 18));
            }
        }

        for (int i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(invPlayer, i, 12 + i * 18, 160));
        }
    }

    public void addCraftingToCrafters(ICrafting craft)
    {
        super.addCraftingToCrafters(craft);
        //craft.sendProgressBarUpdate(this, 0, this.enchantLevels[0]);
        //craft.sendProgressBarUpdate(this, 1, this.enchantLevels[1]);
        //craft.sendProgressBarUpdate(this, 2, this.enchantLevels[2]);
    }

    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();
    }

}
