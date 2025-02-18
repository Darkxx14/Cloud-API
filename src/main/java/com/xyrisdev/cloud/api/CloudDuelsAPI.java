package com.xyrisdev.cloud.api;

import com.xyrisdev.cloud.api.handler.arena.ArenaAPI;
import com.xyrisdev.cloud.api.handler.arena.ArenaLoaderAPI;
import com.xyrisdev.cloud.api.handler.duel.DuelAPI;
import com.xyrisdev.cloud.api.handler.duel.queue.QueueAPI;
import com.xyrisdev.cloud.api.handler.event.EventManagerAPI;
import com.xyrisdev.cloud.api.handler.kit.KitAPI;
import com.xyrisdev.cloud.api.handler.lobby.LobbyAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

@SuppressWarnings("unused")
public interface CloudDuelsAPI {

	/**
	 * Retrieves an instance of the main API, if registered.
	 * <p>If the API is not registered, an empty Optional is returned.</p>
	 *
	 * @return An Optional containing the API instance or empty if not found.
	 */
	@NotNull
	static Optional<CloudDuelsAPI> getInstance() {
		RegisteredServiceProvider<CloudDuelsAPI> registration = Bukkit.getServicesManager().getRegistration(CloudDuelsAPI.class);
		return Optional.ofNullable(registration).map(RegisteredServiceProvider::getProvider);
	}

	/**
	 * Retrieves the plugin instance that provides this API.
	 * <p>If the API is not registered, an empty Optional is returned.</p>
	 *
	 * @return An Optional containing the plugin instance or empty if not found.
	 */
	@NotNull
	static Optional<? extends Plugin> getProvidingPlugin() {
		RegisteredServiceProvider<CloudDuelsAPI> registration = Bukkit.getServicesManager().getRegistration(CloudDuelsAPI.class);
		return Optional.ofNullable(registration).map(RegisteredServiceProvider::getPlugin);
	}

	// --------------------
	// API Accessor Methods
	// --------------------

	@NotNull
	ArenaAPI arena();

	@NotNull
	ArenaLoaderAPI arenaLoader();

	@NotNull
	KitAPI kit();

	@NotNull
	LobbyAPI lobby();

	@NotNull
	DuelAPI duel();

	@NotNull
	QueueAPI queue();

	@NotNull
	EventManagerAPI eventManager();
}
