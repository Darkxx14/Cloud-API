package com.xyrisdev.cloud.api.handler.kit;

import com.xyrisdev.cloud.kit.model.KitRule;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface KitAPI {
	void migrate();

	void setKitRule(String kitName, KitRule rule, boolean enabled);

	CompletableFuture<Boolean> isRuleEnabled(String kitName, KitRule rule);

	CompletableFuture<Void> setDisplayItem(String kitName, ItemStack item);

	CompletableFuture<ItemStack> getDisplayItem(String kitName);

	CompletableFuture<Boolean> isKitEnabled(String kitName);

	void setKitEnabled(String kitName, boolean enabled);

	List<String> getKits();

	CompletableFuture<List<String>> getEnabledKits();

	CompletableFuture<Optional<String>> getScoreboardLine(String kitName, int lineIndex);

	CompletableFuture<Void> setScoreboardTitle(String kitName, String title);

	CompletableFuture<String> getScoreboardTitle(String kitName);

	CompletableFuture<Void> setScoreboardLines(String kitName, List<String> lines);

	CompletableFuture<List<String>> getScoreboardLines(String kitName);
}
