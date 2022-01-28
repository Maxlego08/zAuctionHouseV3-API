package fr.maxlego08.zauctionhouse.api.tax;

import java.util.Optional;

import org.bukkit.inventory.ItemStack;

import fr.maxlego08.zauctionhouse.api.storage.Saveable;

public interface TaxManager extends Saveable{

	/**
	 * 
	 * @param itemStack
	 * @return
	 */
	Optional<Tax> getTax(ItemStack itemStack);

	/**
	 * 
	 * @param price
	 * @param itemStack
	 * @param type
	 * @return
	 */
	double getTax(long price, ItemStack itemStack, TaxType type);
	
	double reverceTax(long price, ItemStack itemStack);
	
	double getTaxPercent(ItemStack itemStack, TaxType type);
	
}
