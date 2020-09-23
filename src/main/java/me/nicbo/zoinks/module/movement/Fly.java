package me.nicbo.zoinks.module.movement;

import me.nicbo.zoinks.module.Category;
import me.nicbo.zoinks.module.Module;
import net.minecraft.entity.player.PlayerCapabilities;
import org.lwjgl.input.Keyboard;

/**
 * @author Nicbo
 */

public class Fly extends Module {
    public Fly() {
        super("Fly", Category.MOVEMENT, Keyboard.KEY_F);
    }

    @Override
    public void onEnable() {
        setFlying(true);
    }

    @Override
    public void onDisable() {
        setFlying(false);
    }

    private void setFlying(boolean flying) {
        PlayerCapabilities capabilities = MINECRAFT.thePlayer.capabilities;
        capabilities.isFlying = flying;
        capabilities.allowFlying = flying;
    }
}
