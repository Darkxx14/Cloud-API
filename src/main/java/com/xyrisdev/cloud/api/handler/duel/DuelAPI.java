package com.xyrisdev.cloud.api.handler.duel;

import com.xyrisdev.cloud.implementation.model.DuelSession;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Map;
import java.util.UUID;

public interface DuelAPI {
	void start(@NotNull Player player1, @NotNull Player player2, String kit, int rounds);

	void endRound(@NotNull PlayerDeathEvent event);

	void end(@NotNull PlayerDeathEvent event);

	void leave(@NotNull Player player);

	boolean inDuel(@NotNull Player player);

	void remove(@NotNull Player player);

	@Contract(pure = true)
	@NotNull @UnmodifiableView
	Map<UUID, DuelSession> getActiveDuels();
}
