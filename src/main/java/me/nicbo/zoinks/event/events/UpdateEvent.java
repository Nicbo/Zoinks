package me.nicbo.zoinks.event.events;

import me.nicbo.zoinks.event.Event;
import me.nicbo.zoinks.event.EventType;

/**
 * @author Nicbo
 */

public class UpdateEvent extends Event {
    public UpdateEvent(EventType type) {
        super(type);
    }
}
