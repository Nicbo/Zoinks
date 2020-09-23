package me.nicbo.zoinks.module;

import me.nicbo.zoinks.event.Event;
import me.nicbo.zoinks.module.movement.Fly;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Nicbo
 */

public class ModuleManager {
    private final List<Module> modules;

    public ModuleManager() {
        this.modules = Arrays.asList(
            new Fly()
        );
    }

    public void callEvent(Event event) {
        for (Module module : modules) {
            if (module.isEnabled()) {
                module.onEvent(event);
            }
        }
    }

    public void keyPressed(int keyCode) {
        for (Module module : modules) {
            if (module.getKeyCode() == keyCode) {
                module.toggle();
            }
        }
    }

    public List<Module> getModules() {
        return Collections.unmodifiableList(modules);
    }
}
