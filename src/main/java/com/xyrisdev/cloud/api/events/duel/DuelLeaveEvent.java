package com.xyrisdev.cloud.api.events.duel;

import com.xyrisdev.cloud.api.event.CancellableCloudEvent;
import com.xyrisdev.cloud.implementation.model.DuelSession;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

@Getter
@AllArgsConstructor
public class DuelLeaveEvent extends CancellableCloudEvent {
	private final @NotNull Player player;
	private final @NotNull DuelSession session;
}
