package com.xyrisdev.cloud;

import com.xyrisdev.cloud.api.CloudDuelsAPI;
import com.xyrisdev.cloud.api.menu.MenuRegistry;
import com.xyrisdev.cloud.api.menu.MenuType;
import com.xyrisdev.cloud.listener.DuelStartListener;
import com.xyrisdev.cloud.menu.CustomDuelMenu;
import com.xyrisdev.cloud.util.xmenu.GuiManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExamplePlugin extends JavaPlugin {

	private static CloudDuelsAPI api = null;

	@Override
	public void onEnable() {
		RegisteredServiceProvider<CloudDuelsAPI> rsp = getServer().getServicesManager().getRegistration(CloudDuelsAPI.class);

		if (rsp == null) {
			getServer().getPluginManager().disablePlugin(this);
			return;
		}

		api = rsp.getProvider();

		// Register the GuiManager (Optional You can use any library or defualt bukkit api to create menus.)
		GuiManager.register(this);

		// Register a custom menu to override our default duel menu.
		MenuRegistry.register(MenuType.DUEL, new CustomDuelMenu());

		// Register our example listener
		getApi().eventManager().register(DuelStartListener.class);
	}

	@Override
	public void onDisable() {
		api = null;
	}

	public static CloudDuelsAPI getApi() {
		return api;
	}
}
