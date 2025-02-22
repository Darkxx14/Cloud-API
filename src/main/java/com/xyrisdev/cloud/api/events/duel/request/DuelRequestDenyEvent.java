package com.xyrisdev.cloud.api.events.duel.request;

import com.xyrisdev.cloud.api.event.CloudEvent;
import com.xyrisdev.cloud.implementation.request.model.DuelRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@Getter
@AllArgsConstructor
public class DuelRequestDenyEvent extends CloudEvent {
	private final @NotNull DuelRequest request;
}
