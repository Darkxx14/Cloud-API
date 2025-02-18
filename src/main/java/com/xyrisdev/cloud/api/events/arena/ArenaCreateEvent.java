package com.xyrisdev.cloud.api.events.arena;

import com.xyrisdev.cloud.api.event.CloudEvent;
import com.xyrisdev.cloud.arena.model.DuelArena;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

/**
 * Called when an arena is created.
 */
@Getter
@AllArgsConstructor
public class ArenaCreateEvent extends CloudEvent {
	private final @NotNull String name;
	private final @NotNull String displayName;
	private final @NotNull DuelArena arena;
}
