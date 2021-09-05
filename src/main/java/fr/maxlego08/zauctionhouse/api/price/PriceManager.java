package fr.maxlego08.zauctionhouse.api.price;

import java.util.Optional;

import org.bukkit.inventory.ItemStack;

import fr.maxlego08.zauctionhouse.api.storage.Saveable;

public interface PriceManager extends Saveable {

	/**
	 * 
	 * @param itemStack
	 * @return
	 */
	public long getMinPrice(ItemStack itemStack);

	/**
	 * 
	 * @param itemStack
	 * @return
	 */
	public long getMaxPrice(ItemStack itemStack);

	/**
	 * 
	 * @param itemStack
	 * @return
	 */
	public Optional<PriceItem> getPrice(ItemStack itemStack);

}
