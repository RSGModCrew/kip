package com.acgmodcrew.kip.proxy;

import com.acgmodcrew.kip.handler.guiHandler;
import com.acgmodcrew.kip.kip;
import cpw.mods.fml.common.network.NetworkRegistry;

/**
 * Created by Malec on 21/02/2015.
 */
public class ServerProxy extends CommonProxy
{
    public static void regesterNetworkStuff()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(kip.instance, new guiHandler());
    }
}
