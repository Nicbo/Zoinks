package me.nicbo.zoinks;

import me.nicbo.zoinks.module.ModuleManager;
import me.nicbo.zoinks.ui.HUD;
import org.lwjgl.opengl.Display;

import java.util.logging.Logger;

/**
 * Singleton that represents the Zoinks Client
 *
 * @author Nicbo
 */

public enum Zoinks {
    INSTANCE;

    private final Logger logger;
    private final ModuleManager moduleManager;
    private final HUD hud;

    Zoinks() {
        this.logger = Logger.getLogger("Zoinks");
        this.moduleManager = new ModuleManager();
        this.hud = new HUD();
    }

    public void onStartUp() {
        logger.info("Starting " + getDisplayName() + "...");
        Display.setTitle(getDisplayName());
    }

    public String getName() {
        return "Zoinks";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getDisplayName() {
        return getName() + " v" + getVersion();
    }

    public ModuleManager getModuleManager() {
        return moduleManager;
    }

    public HUD getHud() {
        return hud;
    }
}
