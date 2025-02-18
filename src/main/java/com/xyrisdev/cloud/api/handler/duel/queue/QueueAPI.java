package com.xyrisdev.cloud.api.handler.duel.queue;

import com.xyrisdev.cloud.implementation.queue.model.QueueEntry;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Map;
import java.util.UUID;

public interface QueueAPI {
	void queue(@NotNull Player player, String kit);

	void remove(@NotNull Player player);

	boolean isInQueue(@NotNull Player player);

	@NotNull @UnmodifiableView
	Map<UUID, QueueEntry> getQueue();

	void attempt(@NotNull Player player);
}
