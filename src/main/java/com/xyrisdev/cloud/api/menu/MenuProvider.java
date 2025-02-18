package com.xyrisdev.cloud.api.menu;

import org.bukkit.entity.Player;

@FunctionalInterface
public interface MenuProvider {
	void open(Player player, Object... args);
}
