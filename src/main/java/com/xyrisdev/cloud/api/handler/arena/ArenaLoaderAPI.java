package com.xyrisdev.cloud.api.handler.arena;

import com.xyrisdev.cloud.arena.model.DuelArena;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ArenaLoaderAPI {
	public DuelArena load(String name);

	public List<DuelArena> load();

	public void save(@NotNull DuelArena arena);

	public void delete(String name);

	public int getArenaCount();

	public List<DuelArena> getAllArenas();
}
