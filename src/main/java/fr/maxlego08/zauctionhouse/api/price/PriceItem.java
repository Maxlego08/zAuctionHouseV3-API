package fr.maxlego08.zauctionhouse.api.price;

import org.bukkit.inventory.ItemStack;

public interface PriceItem {

	/**
	 * Get the min price for this item
	 * 
	 * @return min price
	 */
	long getMinPrice();

	/**
	 * Get the max price for this item
	 * 
	 * @return max price
	 */
	long getMaxPrice();
	
	/**
	 * Check if an ItemStack is similar or not
	 * 
	 * @param itemStack
	 * @return boolean
	 */
	boolean isSimilar(ItemStack itemStack);
	
	/**
	 * 
	 * @return name
	 */
	String getName();
	
	

}
