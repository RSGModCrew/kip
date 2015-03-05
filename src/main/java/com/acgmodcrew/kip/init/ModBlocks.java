package com.acgmodcrew.kip.init;

import com.acgmodcrew.kip.block.*;
import com.acgmodcrew.kip.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Malec on 23/02/2015.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public final static BlockKip knowledgium_ore = new BlockKnowledgiumOre();
    public final static BlockKip knowledgium = new BlockKnowledgium();
    public final static BlockKip stupidium_ore = new BlockStupidiumOre();
    public final static BlockKip stupidium = new BlockStupidium();
    public final static BlockKip paper_block = new BlockPaper();

    public static void init()
    {


        GameRegistry.registerBlock(stupidium_ore, "stupidium_ore");
        GameRegistry.registerBlock(stupidium, "stupidium");
        GameRegistry.registerBlock(knowledgium_ore, "knowledgium_ore");
        GameRegistry.registerBlock(knowledgium, "knowledgium");
        GameRegistry.registerBlock(paper_block, "paper_block");

    }
}
