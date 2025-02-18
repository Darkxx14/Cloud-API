package com.xyrisdev.cloud.implementation.model;

import com.xyrisdev.cloud.arena.model.DuelArena;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Getter
@Setter
public class DuelSession {

	private final DuelArena arena;
	private final String displayName;
	private final UUID player1;
	private final UUID player2;
	private final String kit;
	private final int totalRounds;
	private int currentRound;
	private int player1Wins;
	private int player2Wins;

	public DuelSession(DuelArena arena, String displayName, UUID player1, UUID player2, String kit, int rounds) {
		this.arena = arena;
		this.displayName = displayName;
		this.player1 = player1;
		this.player2 = player2;
		this.kit = kit;
		this.totalRounds = rounds;
		this.currentRound = 1;
		this.player1Wins = 0;
		this.player2Wins = 0;
	}

	public UUID getOpponent(@NotNull UUID playerId) {
		if (playerId.equals(player1)) {
			return player2;
		} else if (playerId.equals(player2)) {
			return player1;
		}
		throw new IllegalArgumentException("Invalid playerId: " + playerId);
	}

	public boolean over() {
		return player1Wins == totalRounds || player2Wins == totalRounds;
	}

	public void increment(@NotNull UUID winnerId) {
		if (winnerId.equals(player1)) {
			player1Wins++;
		} else if (winnerId.equals(player2)) {
			player2Wins++;
		}
		currentRound++;
	}

	public UUID winner() {
		if (player1Wins == totalRounds) {
			return player1;
		} else if (player2Wins == totalRounds) {
			return player2;
		}
		return null;
	}

	public int needed(@NotNull UUID playerId) {
		if (playerId.equals(player1)) {
			return Math.max(0, totalRounds - player1Wins);
		} else if (playerId.equals(player2)) {
			return Math.max(0, totalRounds - player2Wins);
		}
		throw new IllegalArgumentException("Invalid playerId: " + playerId);
	}

	public int score(@NotNull UUID playerId) {
		if (playerId.equals(player1)) {
			return player1Wins;
		} else if (playerId.equals(player2)) {
			return player2Wins;
		}
		throw new IllegalArgumentException("Invalid playerId: " + playerId);
	}
}
