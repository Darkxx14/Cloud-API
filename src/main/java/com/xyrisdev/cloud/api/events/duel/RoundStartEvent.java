package com.xyrisdev.cloud.api.events.duel;

import com.xyrisdev.cloud.api.event.CloudEvent;
import com.xyrisdev.cloud.implementation.model.DuelSession;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@Getter
@AllArgsConstructor
public class RoundStartEvent extends CloudEvent {
	private final @NotNull DuelSession session;
	private final int round;
}
