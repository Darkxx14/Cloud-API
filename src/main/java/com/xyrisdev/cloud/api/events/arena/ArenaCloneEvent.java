package com.xyrisdev.cloud.api.events.arena;

import com.xyrisdev.cloud.api.event.CloudEvent;
import com.xyrisdev.cloud.arena.model.DuelArena;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;

/**
 * Called when an arena is cloned.
 */
@Getter
@AllArgsConstructor
public final class ArenaCloneEvent extends CloudEvent {
	private final @NotNull DuelArena originalArena;
	private final @NotNull DuelArena clonedArena;
	private final @NotNull Location newCenter;
}
