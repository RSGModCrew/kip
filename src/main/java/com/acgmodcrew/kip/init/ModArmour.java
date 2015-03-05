package com.acgmodcrew.kip.init;

import com.acgmodcrew.kip.item.armour.ItemKipArmour;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Malec on 05/03/2015.
 */
public class ModArmour
{
    public static final ItemArmor.ArmorMaterial armourKnowledgium = EnumHelper.addArmorMaterial("KNOWLEDGIUM", 1200, new int[]{2, 7, 5, 3}, 25);
    public static final ItemArmor.ArmorMaterial armourStupidium = EnumHelper.addArmorMaterial("KNOWLEDGIUM", 1750, new int[]{3, 8, 6, 3}, 1);

    public static final ItemKipArmour knowledium_helm = new ItemKipArmour(armourKnowledgium, 0, 0, "knowledgium_helm");
    public static final ItemKipArmour knowledium_chestplate = new ItemKipArmour(armourKnowledgium, 0, 1, "knowledgium_chestplate");
    public static final ItemKipArmour knowledium_leggings = new ItemKipArmour(armourKnowledgium, 0, 2, "knowledgium_leggings");
    public static final ItemKipArmour knowledium_boots = new ItemKipArmour(armourKnowledgium, 0, 3, "knowledgium_boots");

    public static final ItemKipArmour stupidium_helm = new ItemKipArmour(armourStupidium, 0, 0, "stupidium_helm");
    public static final ItemKipArmour stupidium_chestplate = new ItemKipArmour(armourStupidium, 0, 1, "stupidium_chestplate");
    public static final ItemKipArmour stupidium_leggings = new ItemKipArmour(armourStupidium, 0, 2, "stupidium_leggings");
    public static final ItemKipArmour stupidium_boots = new ItemKipArmour(armourStupidium, 0, 3, "stupidium_boots");


    public static void init()
    {
        GameRegistry.registerItem(knowledium_helm, "knowledgium_helm");
        GameRegistry.registerItem(knowledium_chestplate, "knowledgium_chestplate");
        GameRegistry.registerItem(knowledium_leggings, "knowledgium_leggings");
        GameRegistry.registerItem(knowledium_boots, "knowledgium_boots");

        GameRegistry.registerItem(stupidium_helm, "stupidium_helm");
        GameRegistry.registerItem(stupidium_chestplate, "stupidium_chestplate");
        GameRegistry.registerItem(stupidium_leggings, "stupidium_leggings");
        GameRegistry.registerItem(stupidium_boots, "stupidium_boots");


    }

}
