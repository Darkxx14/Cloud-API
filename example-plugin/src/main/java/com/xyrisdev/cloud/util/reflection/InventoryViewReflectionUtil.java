package com.xyrisdev.cloud.util.reflection;

import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.inventory.Inventory;

import java.lang.reflect.Method;

public class InventoryViewReflectionUtil {

	/**
	 * Retrieves the top inventory from an InventoryEvent using reflection.
	 * This method ensures compatibility across different Spigot versions.
	 *
	 * @param event The InventoryEvent to inspect.
	 * @return The top Inventory object.
	 */
	public static Inventory getTopInventory(InventoryEvent event) {
		try {
			Object view = event.getView();
			Method getTopInventory = view.getClass().getMethod("getTopInventory");
			getTopInventory.setAccessible(true);
			return (Inventory) getTopInventory.invoke(view);
		} catch (Exception e) {
			throw new RuntimeException("Failed to retrieve top inventory using reflection.", e);
		}
	}
}
