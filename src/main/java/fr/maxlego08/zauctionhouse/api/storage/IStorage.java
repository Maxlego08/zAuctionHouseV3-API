package fr.maxlego08.zauctionhouse.api.storage;

import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

import org.bukkit.entity.Player;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.AuctionPlugin;
import fr.maxlego08.zauctionhouse.api.enums.StorageType;
import fr.maxlego08.zauctionhouse.api.transaction.Transaction;

public interface IStorage {

	/**
	 * Load items
	 * @param storageManager 
	 * @param plugin
	 */
	void load(StorageManager storageManager, AuctionPlugin plugin);

	/**
	 * Add an item
	 * @param plugin
	 * @param item
	 * @param type
	 */
	void saveItem(AuctionPlugin plugin, AuctionItem auctionItem, StorageType type);
	
	/**
	 * Remove items
	 * @param plugin
	 * @param item
	 * @param type
	 */
	void removeItem(AuctionPlugin plugin, AuctionItem auctionItem, StorageType type);
	
	/**
	 * Save items
	 * @param plugin
	 * @param items
	 * @param type
	 */
	void saveItems(AuctionPlugin plugin, List<AuctionItem> auctionItems, StorageType type);

	/**
	 * Updates items
	 * @param type
	 */
	void update(AuctionPlugin plugin, StorageType type);

	/**
	 * 
	 * @param type
	 * @return
	 */
	List<AuctionItem> getItems(AuctionPlugin plugin, StorageType type);

	/**
	 * 
	 * @param plugin
	 */
	void save(AuctionPlugin plugin);

	/**
	 * Store transaction
	 * @param transaction
	 * @param consumer 
	 */
	void storeTransaction(Transaction transaction, Consumer<Transaction> consumer);

	/**
	 * 
	 * @param transactions
	 */
	void saveTransactions(List<Transaction> transactions);

	/**
	 * 
	 * @param plugin
	 * @param auctionItem
	 */
	void updateItem(AuctionPlugin plugin, AuctionItem auctionItem, StorageType type);

	/**
	 * 
	 * @return transactions
	 */
	List<Transaction> getTransactions();

	/**
	 * Allows you to update transactions
	 * 
	 * @param transactions
	 */
	void updateTransaction(List<Transaction> transactions);

	/**
	 * Allows you to purge transactions
	 * 
	 * @param seconds
	 * @param runnable
	 */
	void purgeTransactions(long seconds, Runnable runnable);

	/**
	 * Allows you to retrieve transactions for the claim money
	 * 
	 * @param player
	 * @param object
	 */
	void fetchClaimMoney(Player player, Consumer<List<Transaction>> consumer);

	/**
	 * Allows to know if the player is in cooldown for the claim money
	 * 
	 * @param uniqueId
	 * @return boolean
	 */
	boolean isCooldown(UUID uniqueId);

	boolean uuidExist(UUID uuid);

}
