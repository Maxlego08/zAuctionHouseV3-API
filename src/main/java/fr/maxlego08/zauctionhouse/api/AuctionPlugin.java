package fr.maxlego08.zauctionhouse.api;

import org.bukkit.plugin.Plugin;

import fr.maxlego08.zauctionhouse.api.inventory.InventoryManager;
import fr.maxlego08.zauctionhouse.api.inventory.VInventoryManager;

public interface AuctionPlugin extends Plugin {

	InventoryManager getInventories();

	VInventoryManager getInventoryManager();

}
