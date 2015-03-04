package com.acgmodcrew.kip.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
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
        ItemStack Stupidium = new ItemStack(ModItems.StupidiumIngot);
        ItemStack Knowledgium = new ItemStack(ModItems.KnowledgiumIngot);
        ItemStack Paper = new ItemStack(Items.paper);
        ItemStack PaperStack = new ItemStack(ModItems.PaperStack);

        //Blocks <-> Ingots
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Knowledgium), "###", "###", "###", '#', Knowledgium));
        Knowledgium.stackSize = 9;
        GameRegistry.addRecipe(new ShapelessOreRecipe(Knowledgium, new ItemStack(ModBlocks.Knowledgium)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Stupidium), "###", "###", "###", '#', Stupidium));
        Stupidium.stackSize = 9;
        GameRegistry.addRecipe(new ShapelessOreRecipe(Stupidium, new ItemStack((ModBlocks.Stupidium))));
        GameRegistry.addRecipe(new ShapedOreRecipe(PaperStack, "## ", "## ", "   ", '#', Paper));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.PaperBlock), "###", "###", "###", '#', PaperStack));
        Paper.stackSize = 4;
        GameRegistry.addRecipe(new ShapelessOreRecipe(Paper, PaperStack));
        PaperStack.stackSize = 9;
        GameRegistry.addRecipe(new ShapelessOreRecipe(PaperStack, new ItemStack(ModBlocks.PaperBlock)));


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
