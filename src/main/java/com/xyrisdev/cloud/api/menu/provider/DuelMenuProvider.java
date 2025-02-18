package com.xyrisdev.cloud.api.menu.provider;

import com.xyrisdev.cloud.api.menu.MenuProvider;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface DuelMenuProvider extends MenuProvider {

	@Override
	default void open(Player player, Object @NotNull ... args) {
		if (args.length == 0 || !(args[0] instanceof Player target)) {
			throw new UnsupportedOperationException("This menu requires a target player!");
		}
		open(player, target);
	}

	void open(Player player, Player target);
}
