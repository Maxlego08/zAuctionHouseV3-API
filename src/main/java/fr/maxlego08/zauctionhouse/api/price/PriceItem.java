package fr.maxlego08.zauctionhouse.api.price;

import org.bukkit.inventory.ItemStack;

public interface PriceItem {

	/**
	 * 
	 * @return
	 */
	ItemStack getItemStack();

	/**
	 * 
	 * @return
	 */
	long getMinPrice();

	/**
	 * 
	 * @return
	 */
	long getMaxPrice();
	
	boolean onlyMaterial();

}
