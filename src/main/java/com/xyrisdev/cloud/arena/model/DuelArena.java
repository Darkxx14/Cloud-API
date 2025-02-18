package com.xyrisdev.cloud.arena.model;

import com.xyrisdev.cloud.CloudDuels;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class DuelArena {
	private String name;
	private String displayName;
	private Location center;
	private Location redSpawn;
	private Location blueSpawn;
	private Location corner1;
	private Location corner2;
	@Builder.Default
	private List<String> kits = new ArrayList<>();
	private boolean inUse;
	private boolean regeneration;

	public void addKit(String kit) {
		if (!kits.contains(kit)) kits.add(kit);
	}

	public void removeKit(String kit) {
		kits.remove(kit);
	}

	public void toggleInUse() {
		this.inUse = !this.inUse;
	}

	public void toggleRegeneration() {
		this.regeneration = !this.regeneration;
	}

	public File getSchem() {
		return new File(CloudDuels.getInstance().getDataFolder(), "arenas/schem/" + this.name + ".schem");
	}
}
