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
        ItemStack Stupidium = new ItemStack(ModItems.stupidium_ingot);
        ItemStack Knowledgium = new ItemStack(ModItems.knowledgium_ingot);
        ItemStack Paper = new ItemStack(Items.paper);
        ItemStack PaperStack = new ItemStack(ModItems.paper_stack);

        //Blocks <-> Ingots
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.knowledgium), "###", "###", "###", '#', Knowledgium));
        Knowledgium.stackSize = 9;
        GameRegistry.addRecipe(new ShapelessOreRecipe(Knowledgium, new ItemStack(ModBlocks.knowledgium)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stupidium), "###", "###", "###", '#', Stupidium));
        Stupidium.stackSize = 9;
        GameRegistry.addRecipe(new ShapelessOreRecipe(Stupidium, new ItemStack((ModBlocks.stupidium))));
        GameRegistry.addRecipe(new ShapedOreRecipe(PaperStack, "## ", "## ", "   ", '#', Paper));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.paper_block), "###", "###", "###", '#', PaperStack));
        Paper.stackSize = 4;
        GameRegistry.addRecipe(new ShapelessOreRecipe(Paper, PaperStack));
        PaperStack.stackSize = 9;
        GameRegistry.addRecipe(new ShapelessOreRecipe(PaperStack, new ItemStack(ModBlocks.paper_block)));


        //Smelting
        GameRegistry.addSmelting(ModBlocks.knowledgium_ore, new ItemStack(ModItems.knowledgium_ingot), 1);
        GameRegistry.addSmelting(ModBlocks.stupidium_ore, new ItemStack(ModItems.stupidium_ingot), -1);


        //tools
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.knowledgiumPickaxe), "###", " s ", " s ", '#', new ItemStack(ModItems.knowledgium_ingot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.stupidiumPickaxe), "###", " s ", " s ", '#', new ItemStack(ModItems.stupidium_ingot), 's', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.knowledgiumAxe), " ##", " s#", " s ", '#', new ItemStack(ModItems.knowledgium_ingot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.stupidiumAxe), " ##", " s#", " s ", '#', new ItemStack(ModItems.stupidium_ingot), 's', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.knowledgiumHoe), " ##", " s ", " s ", '#', new ItemStack(ModItems.knowledgium_ingot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.stupidiumHoe), " ##", " s ", " s ", '#', new ItemStack(ModItems.stupidium_ingot), 's', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.knowledgiumShovel), " # ", " s ", " s ", '#', new ItemStack(ModItems.knowledgium_ingot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.stupidiumShovel), " # ", " s ", " s ", '#', new ItemStack(ModItems.stupidium_ingot), 's', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.knowledgiumSword), " # ", " # ", " s ", '#', new ItemStack(ModItems.knowledgium_ingot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.stupidiumSword), " # ", " # ", " s ", '#', new ItemStack(ModItems.stupidium_ingot), 's', "stickWood"));

    }

}
