package me.nicbo.zoinks.module;

import me.nicbo.zoinks.event.Event;
import net.minecraft.client.Minecraft;

/**
 * @author Nicbo
 */

public abstract class Module {
    protected static final Minecraft MINECRAFT = Minecraft.getMinecraft();

    private final String name;
    private final Category category;

    private int keyCode;
    private boolean enabled;

    public Module(String name, Category category, int keyCode) {
        this.name = name;
        this.category = category;
        this.keyCode = keyCode;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void toggle() {
        this.enabled = !enabled;

        if (enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }

    public void onEnable() {
    }

    public void onDisable() {
    }

    public void onEvent(Event event) {
    }
}
