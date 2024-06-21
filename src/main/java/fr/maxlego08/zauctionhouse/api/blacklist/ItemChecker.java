package fr.maxlego08.zauctionhouse.api.blacklist;

import org.bukkit.inventory.ItemStack;

public interface ItemChecker {

	/**
	 * Gets the name of the item checker.
	 *
	 * @return the name of the item checker.
	 */
	String getName();

	/**
	 * Checks if an item is blacklisted/whitelisted.
	 *
	 * @param itemStack the item to check.
	 * @return true if the item is blacklisted/whitelisted, false otherwise.
	 */
	boolean checkItemStack(ItemStack itemStack);
}

