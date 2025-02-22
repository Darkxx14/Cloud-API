package com.xyrisdev.cloud.api.events.duel.team;

import com.xyrisdev.cloud.api.event.CloudEvent;
import com.xyrisdev.cloud.implementation.model.PlayerTeam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

@Getter
@AllArgsConstructor
public class PlayerTeamAssignEvent extends CloudEvent {
	private final @NotNull Player player;
	private final @NotNull PlayerTeam team;
}
