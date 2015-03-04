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

        //Blocks <-> Ingots
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Knowledgium), "###", "###", "###", '#', new ItemStack(ModItems.KnowledgiumIngot)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.KnowledgiumIngot), new ItemStack(ModBlocks.Knowledgium)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Stupidium), "###", "###", "###", '#', new ItemStack(ModItems.StupidiumIngot)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.StupidiumIngot), new ItemStack(ModBlocks.Stupidium)));

        //Smelting
        GameRegistry.addSmelting(ModBlocks.KnowledgiumOre, new ItemStack(ModItems.KnowledgiumIngot), 1);
        GameRegistry.addSmelting(ModBlocks.StupidiumOre, new ItemStack(ModItems.StupidiumIngot), -1);


        //Tools
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.knowledgiumPickaxe), "###", " s ", " s ", '#', new ItemStack(ModItems.KnowledgiumIngot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.stupidiumPickaxe), "###", " s ", " s ", '#', new ItemStack(ModItems.StupidiumIngot), 's', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.knowledgiumAxe), " ##", " s#", " s ", '#', new ItemStack(ModItems.KnowledgiumIngot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.stupidiumAxe), " ##", " s#", " s ", '#', new ItemStack(ModItems.StupidiumIngot), 's', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.knowledgiumHoe), " ##", " s ", " s ", '#', new ItemStack(ModItems.KnowledgiumIngot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.stupidiumHoe), " ##", " s ", " s ", '#', new ItemStack(ModItems.StupidiumIngot), 's', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.knowledgiumShovel), " # ", " s ", " s ", '#', new ItemStack(ModItems.KnowledgiumIngot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.stupidiumShovel), " # ", " s ", " s ", '#', new ItemStack(ModItems.StupidiumIngot), 's', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.knowledgiumSword), " # ", " # ", " s ", '#', new ItemStack(ModItems.KnowledgiumIngot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.stupidiumSword), " # ", " # ", " s ", '#', new ItemStack(ModItems.StupidiumIngot), 's', "stickWood"));

    }

}
