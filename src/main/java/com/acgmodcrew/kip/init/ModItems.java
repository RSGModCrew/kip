package com.acgmodcrew.kip.init;

import com.acgmodcrew.kip.item.ItemKip;
import com.acgmodcrew.kip.item.ItemKnowledgiumIngot;
import com.acgmodcrew.kip.item.ItemPaperStack;
import com.acgmodcrew.kip.item.ItemStupidiumIngot;
import com.acgmodcrew.kip.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Malec on 23/02/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemKip knowledgium_ingot = new ItemKnowledgiumIngot();
    public static final ItemKip stupidium_ingot = new ItemStupidiumIngot();
    public static final ItemKip paper_stack = new ItemPaperStack();

    public static void init()
    {
        GameRegistry.registerItem(knowledgium_ingot, "knowledgium_ingot");
        GameRegistry.registerItem(stupidium_ingot, "stupidium_ingot");
        GameRegistry.registerItem(paper_stack, "paper_stack");

    }

}
