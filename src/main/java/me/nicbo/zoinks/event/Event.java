package me.nicbo.zoinks.event;

/**
 * @author Nicbo
 */

public abstract class Event {
    private final EventType type;
    private boolean cancelled;

    public Event(EventType type) {
        this.type = type;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public EventType getType() {
        return type;
    }

    public boolean isPre() {
        return type == EventType.PRE;
    }

    public boolean isPost() {
        return type == EventType.POST;
    }
}
