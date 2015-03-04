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
    public static final ItemKip KnowledgiumIngot = new ItemKnowledgiumIngot();
    public static final ItemKip StupidiumIngot = new ItemStupidiumIngot();
    public static final ItemKip PaperStack = new ItemPaperStack();

    public static void init()
    {
        GameRegistry.registerItem(KnowledgiumIngot, "knowledgium_ingot");
        GameRegistry.registerItem(StupidiumIngot, "stupidium_ingot");
        GameRegistry.registerItem(PaperStack, "paper_stack");

    }

}
