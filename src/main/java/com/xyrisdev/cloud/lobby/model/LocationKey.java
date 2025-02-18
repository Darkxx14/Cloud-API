package com.xyrisdev.cloud.lobby.model;

import lombok.Getter;
import org.jetbrains.annotations.Nullable;

@Getter
public enum LocationKey {
	CENTER("lobby.center"),
	CORNER1("lobby.corner1"),
	CORNER2("lobby.corner2");

	private final String path;

	LocationKey(String path) {
		this.path = path;
	}

	public static @Nullable LocationKey fromString(String name) {
		for (LocationKey key : values()) {
			if (key.name().equalsIgnoreCase(name)) {
				return key;
			}
		}
		return null;
	}
}