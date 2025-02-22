package com.xyrisdev.cloud.api.handler.duel.request;

import com.xyrisdev.cloud.implementation.request.model.DuelRequest;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface RequestAPI {
	void send(@NotNull Player sender, @NotNull Player receiver, String kit, int rounds);

	void accept(@NotNull Player receiver, @NotNull Player sender);

	void deny(@NotNull Player receiver, @NotNull Player sender);

	DuelRequest get(@NotNull Player sender, @NotNull Player receiver);

	boolean hasRequest(@NotNull Player sender, @NotNull Player receiver);
}
