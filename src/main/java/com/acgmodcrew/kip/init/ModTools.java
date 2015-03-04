package com.acgmodcrew.kip.init;


import com.acgmodcrew.kip.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Malec on 03/03/2015.
 */
public class ModTools
{
    public static Item.ToolMaterial Knowledgium = EnumHelper.addToolMaterial("KNOWLEDGIUM", 4, 1000, 15.0f, 4.0f, 25);
    public static final ItemModPickaxe knowledgiumPickaxe = new ItemModPickaxe("Knowledgium Pickaxe", Knowledgium);
    public static final ItemModAxe knowledgiumAxe = new ItemModAxe("Knowledgium Axe", Knowledgium);
    public static final ItemModHoe knowledgiumHoe = new ItemModHoe("Knowledgium Hoe", Knowledgium);
    public static final ItemModShovel knowledgiumShovel = new ItemModShovel("Knowledgium Shovel", Knowledgium);
    public static final ItemModSword knowledgiumSword = new ItemModSword("Knowledgium Sword", Knowledgium);
    public static Item.ToolMaterial Stupidium = EnumHelper.addToolMaterial("STUPIDIUM", 3, 1750, 8.0f, 5.0f, 1);
    public static final ItemModPickaxe stupidiumPickaxe = new ItemModPickaxe("Stupidium Pickaxe", Stupidium);
    public static final ItemModAxe stupidiumAxe = new ItemModAxe("Stupidium Axe", Stupidium);
    public static final ItemModHoe stupidiumHoe = new ItemModHoe("Stupidium Hoe", Stupidium);
    public static final ItemModShovel stupidiumShovel = new ItemModShovel("Stupidium Shovel", Stupidium);
    public static final ItemModSword stupidiumSword = new ItemModSword("Stupidium Sword", Stupidium);

    public static void init()
    {
        GameRegistry.registerItem(knowledgiumPickaxe, "Knowledgium Pickaxe");
        GameRegistry.registerItem(stupidiumPickaxe, "Stupidium Pickaxe");

        GameRegistry.registerItem(knowledgiumAxe, "Knowledgium Axe");
        GameRegistry.registerItem(stupidiumAxe, "Stupidium Axe");

        GameRegistry.registerItem(knowledgiumHoe, "Knowledgium Hoe");
        GameRegistry.registerItem(stupidiumHoe, "Stupidium Hoe");

        GameRegistry.registerItem(knowledgiumShovel, "Knowledgium Shovel");
        GameRegistry.registerItem(stupidiumShovel, "Stupidium Shovel");

        GameRegistry.registerItem(knowledgiumSword, "Knowledgium Sword");
        GameRegistry.registerItem(stupidiumSword, "Stupidium Sword");
    }
}
