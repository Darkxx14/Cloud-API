package com.xyrisdev.cloud.api.handler.lobby;

import com.xyrisdev.cloud.lobby.model.LocationKey;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface LobbyAPI {
	Location getCenter();

	Location getCorner1();

	Location getCorner2();

	void setCenter(Location location);

	void setCorner1(Location location);

	void setCorner2(Location location);

	void teleport(Player player, LocationKey key);

	boolean isInLobby(Player player);
}
