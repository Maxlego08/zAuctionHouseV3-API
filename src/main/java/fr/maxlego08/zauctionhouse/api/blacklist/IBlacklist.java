package fr.maxlego08.zauctionhouse.api.blacklist;

import org.bukkit.inventory.ItemStack;

public interface IBlacklist {

	
	String getName();
	
	/***
	 * Check if item is blacklist
	 * 
	 * @param itemStack
	 * @return item is blacklist
	 */
	boolean isBlacklist(ItemStack itemStack);
	
}
