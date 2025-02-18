package com.xyrisdev.cloud.api.handler.arena;

import com.xyrisdev.cloud.arena.model.ArenaLocation;
import com.xyrisdev.cloud.arena.model.DuelArena;
import com.xyrisdev.cloud.exception.InvalidArenaStateException;
import com.xyrisdev.cloud.exception.InvalidRegenerationStateException;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;

public interface ArenaAPI {
	void create(String name, String displayName, Location center, Location redSpawn, Location blueSpawn);

	void teleport(String name, Player player);

	void teleport(String name, ArenaLocation location, Player player);

	void delete(String name);

	void name(String name, String newName);

	void displayName(String name, String newDisplayName);

	void bindKit(String name, String kit);

	void toggleKit(String name, String kit);

	boolean hasKit(String name, String kit);

	void unbindKit(String name, String kit);

	void inUse(String name, Boolean value);

	void toggleInUse(String name);

	void regeneration(String name, boolean value) throws InvalidRegenerationStateException;

	void center(String name, Location center);

	void redSpawn(String name, Location redSpawn);

	void blueSpawn(String name, Location blueSpawn);

	void corner1(String name, Location corner1);

	void corner2(String name, Location corner2);

	List<DuelArena> getAllArenas();

	List<DuelArena> getAllAvailableArenas();

	List<DuelArena> getAvailableArenasByKit(String kitName);

	DuelArena getRandomAvailableArenaByDisplayName(String type);

	List<String> getArenaNamesByDisplayName(String type);

	void clone(String name, Location center) throws InvalidArenaStateException;

	void schem(String name);

	void regenerate(DuelArena arena);
}
