package com.xyrisdev.cloud.api.handler.kit;

import com.xyrisdev.cloud.kit.model.KitRule;
import org.bukkit.Material;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface KitAPI {
	void migrate();

	void setKitRule(String kitName, KitRule rule, boolean enabled);

	boolean isRuleEnabled(String kitName, KitRule rule);

	void setDisplayItem(String kitName, Material material);

	Optional<Material> getDisplayItem(final String kitName);

	boolean isKitEnabled(String kitName);

	void setKitEnabled(String kitName, boolean enabled);

	List<String> getKits();

	List<String> getEnabledKits();

	CompletableFuture<Void> setScoreboardTitle(String kitName, String title);

	String getScoreboardTitle(String kitName);

	CompletableFuture<Void> setScoreboardLines(String kitName, List<String> lines);

	List<String> getScoreboardLines(String kitName);
}
