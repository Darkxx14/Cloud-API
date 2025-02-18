package com.xyrisdev.cloud.menu;

import com.xyrisdev.cloud.api.menu.MenuRegistry;
import com.xyrisdev.cloud.api.menu.MenuType;
import com.xyrisdev.cloud.api.menu.provider.DuelMenuProvider;
import com.xyrisdev.cloud.util.xmenu.GuiBuilder;
import com.xyrisdev.cloud.util.xmenu.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CustomDuelMenu implements DuelMenuProvider {

	@Override
	public void open(Player player, @NotNull Player target) {
		GuiBuilder inventory = new GuiBuilder(27, "Duel " + target.getName());

		ItemStack selectKit = new ItemBuilder(Material.PAPER)
				.name("Select Kit")
				.build();

		inventory.setItem(10, selectKit, event -> {
			event.setCancelled(true);
			MenuRegistry.open(MenuType.DUEL_KIT_SELECTION, player, target);
		});

		ItemStack selectRounds = new ItemBuilder(Material.PAPER)
				.name("Select Rounds")
				.build();

		inventory.setItem(12, selectRounds, event -> {
			event.setCancelled(true);
			MenuRegistry.open(MenuType.DUEL_ROUND_SELECTION, player, target);
		});

		// and so on...

		inventory.open(player);
	}
}
