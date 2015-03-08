package com.acgmodcrew.kip.client.gui;

import com.acgmodcrew.kip.client.Container.ContainerRepository;
import com.acgmodcrew.kip.reference.Reference;
import com.acgmodcrew.kip.tileentity.TileEntityRepositry;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;


/**
 * Created by Malec on 07/03/2015.
 */
public class RepositoryGui extends GuiContainer
{
    //For testing
    //public static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/gui/repository.png");
    public static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/gui/placeholder.png");

    public RepositoryGui(InventoryPlayer invPlayer, TileEntityRepositry entity)
    {
        super(new ContainerRepository(invPlayer, entity));

        xSize = 200;
        ySize = 200;


    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        GL11.glColor4f(1F, 1F, 1F, 1F);
        mc.getTextureManager().bindTexture(texture);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
