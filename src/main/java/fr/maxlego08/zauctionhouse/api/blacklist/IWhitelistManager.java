package fr.maxlego08.zauctionhouse.api.blacklist;

import java.util.List;
import java.util.Optional;

import org.bukkit.inventory.ItemStack;

public interface IWhitelistManager {

	/**
	 * Get blacklist list
	 * 
	 * @return blacklist list
	 */
	List<IBlacklist> getWhitelist();

	/**
	 * Register blacklist
	 * 
	 * @param blacklist
	 */
	void registerWhitelist(IBlacklist blacklist);

	/**
	 * Unregister blacklist
	 * 
	 * @param blacklist
	 */
	void unregisterWhitelist(IBlacklist blacklist);

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
	Optional<IBlacklist> isWhitelist(ItemStack itemStack);

}
