package fr.maxlego08.zauctionhouse.api.blacklist;

import java.util.List;
import java.util.Optional;

import org.bukkit.inventory.ItemStack;

public interface IBlacklistManager {

	/**
	 * Get blacklist list
	 * 
	 * @return blacklist list
	 */
	List<ItemChecker> getBlacklist();

	/**
	 * Register blacklist
	 * 
	 * @param blacklist
	 */
	void registerBlacklist(ItemChecker blacklist);

	/**
	 * Unregister blacklist
	 * 
	 * @param blacklist
	 */
	void unregisterBlacklist(ItemChecker blacklist);

	/**
	 * Unregister all blacklist
	 */
	void unregisterAll();

	/**
	 * Check if item is blacklist
	 * 
	 * @param itemStack
	 * @return blacklist
	 */
	Optional<ItemChecker> isBlacklist(ItemStack itemStack);

}
