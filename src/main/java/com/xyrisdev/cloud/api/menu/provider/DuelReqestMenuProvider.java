package com.xyrisdev.cloud.api.menu.provider;

import com.xyrisdev.cloud.api.menu.MenuProvider;
import com.xyrisdev.cloud.implementation.request.model.DuelRequest;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface DuelReqestMenuProvider extends MenuProvider {

	@Override
	default void open(Player player, Object @NotNull ... args) {
		if (args.length == 0 || !(args[0] instanceof DuelRequest request)) {
			throw new UnsupportedOperationException("This menu requires a DuelRequest object!");
		}
		open(player, request);
	}

	void open(Player player, DuelRequest request);
}
