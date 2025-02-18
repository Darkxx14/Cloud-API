package com.xyrisdev.cloud.implementation.queue.model;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

@Getter
public class QueueEntry {

	private final Player player;
	private final String kit;
	private final int ping;

	public QueueEntry(@NotNull Player player, String kit) {
		this.player = player;
		this.kit = kit;
		this.ping = player.getPing();
	}
}