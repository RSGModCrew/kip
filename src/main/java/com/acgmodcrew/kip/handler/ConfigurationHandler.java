package com.acgmodcrew.kip.handler;

import com.acgmodcrew.kip.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Malec on 22/02/2015.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static int oreDropNumber = 10;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        oreDropNumber = configuration.getInt("OreDropNumber", Configuration.CATEGORY_GENERAL, 10, 1, 25, "This is how much xp is dropped by ore");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}
