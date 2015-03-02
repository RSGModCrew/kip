package com.acgmodcrew.kip.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Malec on 23/02/2015.
 */
public class Recipes
{
    public static void init()
    {

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.KnowledgiumIngot), " s ", "sss", " s ", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.KnowledgiumOre), new ItemStack(ModItems.KnowledgiumIngot), new ItemStack(ModItems.KnowledgiumIngot)));
        GameRegistry.addSmelting(ModBlocks.KnowledgiumOre), new ItemStack(ModItems.KnowledgiumIngot), 0;

    }

}
