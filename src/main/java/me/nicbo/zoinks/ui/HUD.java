package me.nicbo.zoinks.ui;

import me.nicbo.zoinks.Zoinks;
import me.nicbo.zoinks.module.Module;
import net.minecraft.client.Minecraft;

/**
 * @author Nicbo
 */

public class HUD {
    private final Minecraft minecraft;

    public HUD() {
        this.minecraft = Minecraft.getMinecraft();
    }

    public void draw() {
        minecraft.fontRendererObj.drawString(Zoinks.INSTANCE.getDisplayName(), 5, 5, -1);

        for (Module module : Zoinks.INSTANCE.getModuleManager().getModules()) {

        }
    }
}
