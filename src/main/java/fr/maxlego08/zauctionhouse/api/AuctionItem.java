package fr.maxlego08.zauctionhouse.api;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import fr.maxlego08.zauctionhouse.api.economy.AuctionEconomy;
import fr.maxlego08.zauctionhouse.api.enums.AuctionType;
import fr.maxlego08.zauctionhouse.api.enums.Message;
import fr.maxlego08.zauctionhouse.api.enums.StorageType;
import fr.maxlego08.zauctionhouse.api.filter.Filter;
import fr.maxlego08.zauctionhouse.api.transaction.Transaction;

public interface AuctionItem {

	/**
	 * Get item unique item
	 * 
	 * @return uuid
	 */
	public UUID getUniqueId();

	/**
	 * Get itemStack
	 * 
	 * @return {@link ItemStack}
	 */
	public ItemStack getItemStack();
	
	/**
	 * Get auction type
	 * @return {@link AuctionType}
	 */
	public AuctionType getType();
	
	/**
	 * Get price
	 * 
	 * @return price
	 */
	public long getPrice();

	/**
	 * Get economy
	 * 
	 * @return {@link AuctionEconomy}
	 */
	public AuctionEconomy getEconomy();
	
	/**
	 * Get economy name
	 * 
	 * @return name
	 */
	public String getEconomyName();

	/**
	 * Get seller as {@link OfflinePlayer}
	 * 
	 * @return {@link OfflinePlayer}
	 */
	public OfflinePlayer getSeller();

	/**
	 * 
	 * @return {@link OfflinePlayer}
	 */
	public OfflinePlayer getBuyer();

	/**
	 * Get uuid from seller
	 * 
	 * @return {@link UUID}
	 */
	public UUID getSellerUniqueId();

	/**
	 * Get uuid from buyer
	 * 
	 * @return {@link UUID}
	 */
	public UUID getBuyerUniqueId();

	/**
	 * 
	 * @return long
	 */
	public long getExpireAt();

	/**
	 * 
	 * @param expireAt
	 */
	public void setExpireAt(long expireAt);

	/**
	 * 
	 * @param uuid
	 */
	public void setBuyer(UUID uuid);
	
	/**
	 * 
	 * @return itemsteak as string
	 */
	public String serializedItem();

	/**
	 * 
	 * @param player
	 * @return
	 */
	public ItemStack createItem(Player player, Message message);

	/**
	 * 
	 * @param b
	 */
	public void setAlreadyBuying(boolean b);

	/**
	 * 
	 * @return true if can buy
	 */
	public boolean canBuy();
	
	/**
	 * 
	 * @param b
	 */
	public void setCanBuy(boolean b);

	/**
	 * 
	 * @return
	 */
	public boolean isAlreadyBuying();

	/**
	 * 
	 * @return itemStack amoutn
	 */
	public int getAmount();

	/**
	 * 
	 * @param price 
	 * @return {@link Transaction}
	 */
	public Transaction buildTransaction(long price);
	
	/**
	 * 
	 * @return
	 */
	public List<ItemStack> getItemStacks();

	/**
	 * 
	 * @return
	 */
	public List<String> serializedItems();

	/**
	 * 	 
	 * @param player
	 * @return
	 */
	public boolean hasFreeSpace(Player player);

	/**
	 * 
	 * @param optional 
	 * @param string
	 * @return
	 */
	public boolean match(Optional<Filter> optional, String string);
	
	/**
	 * 
	 * @return is expired
	 */
	boolean isExpired();

	/**
	 * Return the storage type
	 * 
	 * @return {@link StorageType}
	 */
	StorageType getStorageType();
	
	/**
	 * Set storage typs
	 * 
	 * @param storageType
	 */
	void setStorageType(StorageType storageType);

	void setPrice(long price);
	
	String getSellerName();

	void giveIf(Player player, Predicate<AuctionItem> predicate);
	
	int getPriority();
	
	public String priceFormat();
}
