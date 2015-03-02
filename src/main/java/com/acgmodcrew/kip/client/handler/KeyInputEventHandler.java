package com.acgmodcrew.kip.client.handler;

import com.acgmodcrew.kip.client.settings.KeyBindings;
import com.acgmodcrew.kip.reference.Key;
import com.acgmodcrew.kip.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;


/**
 * Created by Malec on 26/02/2015.
 */
public class KeyInputEventHandler
{
    private static Key getPressedKeybinding()
    {
        if (KeyBindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if (KeyBindings.release.isPressed())
        {
            return Key.RELEASE;
        }
        else
        {
            return Key.UNKNOWN;
        }
    }


    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeybinding());
    }
}
