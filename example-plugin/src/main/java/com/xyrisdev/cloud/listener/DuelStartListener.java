package com.xyrisdev.cloud.listener;

import com.xyrisdev.cloud.api.event.CloudHandler;
import com.xyrisdev.cloud.api.event.CloudListener;
import com.xyrisdev.cloud.api.events.duel.DuelStartEvent;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class DuelStartListener implements CloudListener {

	@CloudHandler
	public void onDuelStart(@NotNull DuelStartEvent event) {
		Player player = event.getPlayer1();
		Player player2 = event.getPlayer2();

		player.setGameMode(GameMode.SURVIVAL);
		player2.setGameMode(GameMode.SURVIVAL);
	}
}
