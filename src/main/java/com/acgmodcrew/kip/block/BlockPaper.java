package com.acgmodcrew.kip.block;

import com.acgmodcrew.kip.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;



/**
 * Created by Malec on 04/03/2015.
 */
public class BlockPaper extends BlockKip
{
    @SideOnly(Side.CLIENT)
    public static IIcon topIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon sideIcon;
    public BlockPaper()
    {
        super(Material.grass);
        this.setBlockName("paper_block");
        this.setHarvestLevel("axe", 1);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon)
    {
        topIcon = icon.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName() + "_top");
        sideIcon = icon.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName() + "_side");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        if (side == 0)
        {
            return topIcon;
        }
        else if (side == 1)
        {
            return topIcon;
        }
        else
        {
            return sideIcon;
        }
    }
}
