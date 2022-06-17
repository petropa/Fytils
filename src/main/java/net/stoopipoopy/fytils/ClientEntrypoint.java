package net.stoopipoopy.fytils;
/* imports */

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.LiteralText;
import net.stoopipoopy.fytils.gui.LoreGui;
import net.stoopipoopy.fytils.gui.LoreScreen;
import net.stoopipoopy.fytils.gui.MainGui;
import net.stoopipoopy.fytils.gui.MainScreen;
import org.lwjgl.glfw.GLFW;
public class ClientEntrypoint implements ClientModInitializer {

    private static KeyBinding keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
    "key.examplemod.spook", // The translation key of the keybinding's name
    InputUtil.Type.KEYSYM, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
    GLFW.GLFW_KEY_R, // The keycode of the key
    "category.examplemod.test" // The translation key of the keybinding's category.
    ));
    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (keyBinding.wasPressed()) {
                //client.player.sendMessage(new LiteralText("Test"), false)
                MinecraftClient.getInstance().setScreen(new MainScreen(new MainGui()));
                MinecraftClient.getInstance().setScreen(new LoreScreen(MainGui.loregui));
            }
        });
        // Event registration will be executed inside this method
    }
}