package com.xyrisdev.cloud.api.events.arena;

import com.xyrisdev.cloud.api.event.CloudEvent;
import com.xyrisdev.cloud.arena.model.DuelArena;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

/**
 * Called when an arena is regenerated.
 */
@Getter
@AllArgsConstructor
public final class ArenaRegenerateEvent extends CloudEvent {
	private final @NotNull DuelArena arena;
}
