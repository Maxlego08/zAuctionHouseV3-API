package fr.maxlego08.zauctionhouse.api.price;

import java.util.Optional;

import org.bukkit.inventory.ItemStack;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.economy.AuctionEconomy;
import fr.maxlego08.zauctionhouse.api.economy.EconomyLimit;
import fr.maxlego08.zauctionhouse.api.storage.Saveable;

public interface PriceManager extends Saveable {
	
	/**
	 * 
	 * @param itemStack
	 * @return
	 */
	public long getMinPrice(ItemStack itemStack, AuctionEconomy auctionEconomy);

	/**
	 * 
	 * @param itemStack
	 * @return
	 */
	public long getMinPrice(AuctionItem auctionItem, AuctionEconomy auctionEconomy);

	/**
	 * 
	 * @param itemStack
	 * @return
	 */
	public long getMaxPrice(AuctionItem auctionItem, AuctionEconomy auctionEconomy);

	/**
	 * 
	 * @param itemStack
	 * @return
	 */
	public Optional<PriceItem> getPrice(ItemStack itemStack);
	
	/**
	 * 
	 * @param auctionEconomy
	 * @return
	 */
	Optional<EconomyLimit> getEconomyLimit(AuctionEconomy auctionEconomy);

}
