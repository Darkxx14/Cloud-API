package com.xyrisdev.cloud.api.events.duel;

import com.xyrisdev.cloud.api.event.CloudEvent;
import com.xyrisdev.cloud.implementation.model.DuelSession;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

@Getter
@AllArgsConstructor
public class DuelStartEvent extends CloudEvent {
	private final @NotNull Player player1;
	private final @NotNull Player player2;
	private final @NotNull String kit;
	private final int rounds;
	private final @NotNull DuelSession session;
}
