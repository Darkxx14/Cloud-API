package com.xyrisdev.cloud.api.scoreboard;

import dev.mqzen.boards.base.BoardAdapter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ScoreboardRegistry {

	private static final Map<BoardType, BoardAdapter> adapters = new ConcurrentHashMap<>();

	public static void register(BoardType type, BoardAdapter adapter) {
		adapters.put(type, adapter);
	}

	public static void unregister(BoardType type) {
		adapters.remove(type);
	}

	public static BoardAdapter adapter(BoardType type) {
		return adapters.get(type);
	}

	public static boolean has(BoardType type) {
		return adapters.containsKey(type);
	}
}
