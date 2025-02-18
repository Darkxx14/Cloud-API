package com.xyrisdev.cloud.api.menu;

import org.bukkit.entity.Player;

import java.util.EnumMap;
import java.util.Map;

public final class MenuRegistry {

	private static final Map<MenuType, MenuProvider> MENUS = new EnumMap<>(MenuType.class);

	private MenuRegistry() {}

	public static void register(MenuType type, MenuProvider provider) {
		if (type != null && provider != null) {
			MENUS.put(type, provider);
		}
	}

	public static void open(MenuType type, Player player, Object... args) {
		MenuProvider provider = MENUS.get(type);
		if (provider == null) {
			player.sendRichMessage("<red>No menu registered for this type!");
			return;
		}

		provider.open(player, args);
	}
}
