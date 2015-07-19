package com.acgmodcrew.kip;


import com.acgmodcrew.kip.handler.ConfigurationHandler;
import com.acgmodcrew.kip.init.*;
import com.acgmodcrew.kip.proxy.IProxy;
import com.acgmodcrew.kip.proxy.ServerProxy;
import com.acgmodcrew.kip.reference.Reference;
import com.acgmodcrew.kip.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Malec on 21/02/2015.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class kip {
    @Mod.Instance(Reference.MOD_ID)
    public static kip instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();
        ModTools.init();
        ModArmour.init();
        ModTileEntities.init();
        LogHelper.debug("Pre Init Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.debug("Init Complete");
        ServerProxy.regesterNetworkStuff();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Init Complete");
    }
}
