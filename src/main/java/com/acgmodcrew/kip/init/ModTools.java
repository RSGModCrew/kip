package com.acgmodcrew.kip.init;


import com.acgmodcrew.kip.item.tools.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Malec on 03/03/2015.
 */
public class ModTools
{
    public static Item.ToolMaterial Knowledgium = EnumHelper.addToolMaterial("KNOWLEDGIUM", 4, 1000, 15.0f, 4.0f, 25);
    public static final ItemModPickaxe knowledgiumPickaxe = new ItemModPickaxe("knowledgium_pickaxe", Knowledgium);
    public static final ItemModAxe knowledgiumAxe = new ItemModAxe("knowledgium_axe", Knowledgium);
    public static final ItemModHoe knowledgiumHoe = new ItemModHoe("knowledgium_hoe", Knowledgium);
    public static final ItemModShovel knowledgiumShovel = new ItemModShovel("knowledgium_shovel", Knowledgium);
    public static final ItemModSword knowledgiumSword = new ItemModSword("knowledgium_sword", Knowledgium);
    public static Item.ToolMaterial Stupidium = EnumHelper.addToolMaterial("STUPIDIUM", 3, 1750, 8.0f, 5.0f, 1);
    public static final ItemModPickaxe stupidiumPickaxe = new ItemModPickaxe("stupidium_pickaxe", Stupidium);
    public static final ItemModAxe stupidiumAxe = new ItemModAxe("stupidium_axe", Stupidium);
    public static final ItemModHoe stupidiumHoe = new ItemModHoe("stupidium_hoe", Stupidium);
    public static final ItemModShovel stupidiumShovel = new ItemModShovel("stupidium_shovel", Stupidium);
    public static final ItemModSword stupidiumSword = new ItemModSword("stupidium_sword", Stupidium);

    public static void init()
    {
        GameRegistry.registerItem(knowledgiumPickaxe, "knowledgium_pickaxe");
        GameRegistry.registerItem(stupidiumPickaxe, "stupidium_pickaxe");

        GameRegistry.registerItem(knowledgiumAxe, "knowledgium_axe");
        GameRegistry.registerItem(stupidiumAxe, "stupidium_axe");

        GameRegistry.registerItem(knowledgiumHoe, "knowledgium_hoe");
        GameRegistry.registerItem(stupidiumHoe, "stupidium_hoe");

        GameRegistry.registerItem(knowledgiumShovel, "knowledgium_shovel");
        GameRegistry.registerItem(stupidiumShovel, "stupidium_shovel");

        GameRegistry.registerItem(knowledgiumSword, "knowledgium_sword");
        GameRegistry.registerItem(stupidiumSword, "stupidium_sword");
    }
}
