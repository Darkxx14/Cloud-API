package com.xyrisdev.cloud.api.events.duel.team;

import com.xyrisdev.cloud.api.event.CloudEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

@Getter
@AllArgsConstructor
public class PlayerTeamRemoveEvent extends CloudEvent {
	private final @NotNull Player player;
}
