package fr.maxlego08.zauctionhouse.api.tax;

import org.bukkit.inventory.ItemStack;

public interface Tax {

	/**
	 * 
	 * @return
	 */
	ItemStack getItemStack();
	
	/**
	 * 
	 * @return
	 */
	double getPercent();
	
	
}
