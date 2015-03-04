package com.acgmodcrew.kip.client.settings;

import com.acgmodcrew.kip.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by Malec on 26/02/2015.
 */
public class KeyBindings
{
    public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_C, Names.Keys.CATEGORY);
    public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE, Keyboard.KEY_R, Names.Keys.CATEGORY);
}
