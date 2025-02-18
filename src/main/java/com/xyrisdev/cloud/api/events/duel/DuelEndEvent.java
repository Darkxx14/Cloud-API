package com.xyrisdev.cloud.api.events.duel;

import com.xyrisdev.cloud.api.event.CloudEvent;
import com.xyrisdev.cloud.implementation.model.DuelSession;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

@Getter
@AllArgsConstructor
public class DuelEndEvent extends CloudEvent {
	private final @NotNull Player winner;
	private final @NotNull Player loser;
	private final @NotNull DuelSession session;
}
