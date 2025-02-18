package com.xyrisdev.cloud.kit.model;

import com.xyrisdev.cloud.CloudDuels;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum KitRule {

	HUNGER, // If enabled, players will not lose hunger. DEFAULT = false - Players will lose hunger.
	BUILD, // If enabled, players will be able to place blocks. DEFAULT = false - Players will not be able to place blocks.
	BREAK, // If enabled, players will be able to break blocks. DEFAULT = false - Players will not be able to break blocks.
	PLAYER_PLACED_BLOCK_BREAK, // If enabled, players will be able to break blocks placed by them. DEFAULT = false - Players will not be able to break blocks they placed.
	FALL_DAMAGE, // If enabled, players will not take fall damage. DEFAULT = false - Players will take fall damage.
	DAMAGE, // If enabled, players will not take damage. DEFAULT = false - Players will take damage.
	HEALTH_REGENERATION, // If enabled, players will not regenerate health. DEFAULT = false - Players will regenerate health.
	CRAFTING, // If enabled, players will not be able to craft items. DEFAULT = false - Players will be able to craft items.
	DESPAWN_ARROWS, // If enabled, the shooted arrows will despawn automatically. DEFAULT = false - The shooted arrows will not despawn automatically.
	BOXING, // If enabled
	SUMO; // If enabled

	public static boolean enabled(KitRule rule, String kit) {
		return CloudDuels.getInstance().getKitManager().isRuleEnabled(kit, rule).join();
	}

	public static @Nullable KitRule fromString(@NotNull String rule) {
		try {
			return KitRule.valueOf(rule.toUpperCase());
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
}