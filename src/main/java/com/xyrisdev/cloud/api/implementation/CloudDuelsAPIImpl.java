package com.xyrisdev.cloud.api.implementation;

import com.xyrisdev.cloud.CloudDuels;
import com.xyrisdev.cloud.api.CloudDuelsAPI;
import com.xyrisdev.cloud.api.handler.arena.ArenaAPI;
import com.xyrisdev.cloud.api.handler.arena.ArenaLoaderAPI;
import com.xyrisdev.cloud.api.handler.duel.DuelAPI;
import com.xyrisdev.cloud.api.handler.duel.queue.QueueAPI;
import com.xyrisdev.cloud.api.handler.duel.request.RequestAPI;
import com.xyrisdev.cloud.api.handler.event.EventManagerAPI;
import com.xyrisdev.cloud.api.handler.kit.KitAPI;
import com.xyrisdev.cloud.api.handler.lobby.LobbyAPI;
import com.xyrisdev.cloud.implementation.DuelManager;
import com.xyrisdev.cloud.implementation.queue.DuelQueueManager;
import com.xyrisdev.cloud.implementation.request.DuelRequestManager;
import org.jetbrains.annotations.NotNull;

public class CloudDuelsAPIImpl implements CloudDuelsAPI {

	@Override
	public @NotNull ArenaAPI arena() {
		return CloudDuels.getInstance().getArenaImpl();
	}

	@Override
	public @NotNull ArenaLoaderAPI arenaLoader() {
		return CloudDuels.getInstance().getArenaLoader();
	}

	@Override
	public @NotNull KitAPI kit() {
		return CloudDuels.getInstance().getKitManager();
	}

	@Override
	public @NotNull LobbyAPI lobby() {
		return CloudDuels.getInstance().getLobbyManager();
	}

	@Override
	public @NotNull DuelAPI duel() {
		return DuelManager.get();
	}

	@Override
	public @NotNull QueueAPI queue() {
		return DuelQueueManager.get();
	}

	@Override
	public @NotNull RequestAPI request() {
		return DuelRequestManager.get();
	}

	@Override
	public @NotNull EventManagerAPI eventManager() {
		return CloudDuels.getEventManager();
	}
}
