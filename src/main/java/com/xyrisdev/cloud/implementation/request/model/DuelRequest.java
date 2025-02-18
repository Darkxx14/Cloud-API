package com.xyrisdev.cloud.implementation.request.model;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Getter
public class DuelRequest {

	private final UUID sender;
	private final UUID receiver;
	private final String kit;
	private final int rounds;
	private final long timestamp;

	public DuelRequest(@NotNull Player sender, @NotNull Player receiver, String kit, int rounds) {
		this.sender = sender.getUniqueId();
		this.receiver = receiver.getUniqueId();
		this.kit = kit;
		this.rounds = rounds;
		this.timestamp = System.currentTimeMillis();
	}
}
