package fr.maxlego08.zauctionhouse.api;

import fr.maxlego08.zauctionhouse.api.inventory.InventoryManager;
import fr.maxlego08.zauctionhouse.api.inventory.VInventoryManager;
import org.bukkit.plugin.Plugin;

public interface AuctionPlugin extends Plugin {

    /**
     * Gets the inventory manager responsible for handling auction inventories.
     *
     * @return the {@link InventoryManager} instance.
     */
    InventoryManager getInventories();

    /**
     * Gets the virtual inventory manager responsible for handling virtual inventories in the auction system.
     *
     * @return the {@link VInventoryManager} instance.
     */
    VInventoryManager getInventoryManager();
}

