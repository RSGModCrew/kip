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
    public final static BlockKip KnowledgiumOre = new BlockKnowledgiumOre();
    public final static BlockKip Knowledgium = new BlockKnowledgium();
    public final static BlockKip StupidiumOre = new BlockStupidiumOre();
    public final static BlockKip Stupidium = new BlockStupidium();
    public final static BlockKip PaperBlock = new BlockPaper();

    public static void init()
    {


        GameRegistry.registerBlock(StupidiumOre, "stupidium_ore");
        GameRegistry.registerBlock(Stupidium, "stupidium");
        GameRegistry.registerBlock(KnowledgiumOre, "knowledgium_ore");
        GameRegistry.registerBlock(Knowledgium, "snowledgium");
        GameRegistry.registerBlock(PaperBlock, "paper_block");
    }
}
