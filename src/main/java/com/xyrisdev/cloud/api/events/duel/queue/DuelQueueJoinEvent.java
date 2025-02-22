package com.xyrisdev.cloud.api.events.duel.queue;

import com.xyrisdev.cloud.api.event.CloudEvent;
import com.xyrisdev.cloud.implementation.queue.model.QueueEntry;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@Getter
@AllArgsConstructor
public class DuelQueueJoinEvent extends CloudEvent {
	private final @NotNull QueueEntry entry;
}
