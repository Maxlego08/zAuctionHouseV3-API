package fr.maxlego08.zauctionhouse.api;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permissible;

import fr.maxlego08.zauctionhouse.api.category.Category;
import fr.maxlego08.zauctionhouse.api.command.Command;
import fr.maxlego08.zauctionhouse.api.economy.AuctionEconomy;
import fr.maxlego08.zauctionhouse.api.enums.AuctionType;
import fr.maxlego08.zauctionhouse.api.enums.HistoryType;
import fr.maxlego08.zauctionhouse.api.enums.InventoryName;
import fr.maxlego08.zauctionhouse.api.enums.InventoryType;
import fr.maxlego08.zauctionhouse.api.enums.Sorting;
import fr.maxlego08.zauctionhouse.api.enums.StorageType;
import fr.maxlego08.zauctionhouse.api.inventory.Inventory;
import fr.maxlego08.zauctionhouse.api.storage.IStorage;
import fr.maxlego08.zauctionhouse.api.utils.Priority;

public interface AuctionManager {

	/**
	 * Open player inventory
	 * 
	 * @param player
	 * @param command
	 */
	void open(Player player, Command command);

	/**
	 * 
	 * @param player
	 */
	void openDefault(Player player);

	/**
	 * Open player inventory
	 * 
	 * @param player
	 * @param command
	 */
	void open(AuctionPlugin plugin, InventoryType type, Player player, AuctionItem auctionItem, int page,
			List<Inventory> oldInventories, String category);

	/**
	 * Reload plugin
	 */
	void reload();

	/**
	 * Close players inventory
	 */
	void closeInventory();

	/**
	 * 
	 * @return {@link IStorage}
	 */
	IStorage getStorage();

	/**
	 * Allows you to update items for sale, items that are expired will go into
	 * item storage expired
	 */
	void update(StorageType type);

	/**
	 * Sell an item
	 * 
	 * @param itemStack
	 * 
	 * @param item
	 *            that will be sold
	 * @param player
	 *            who sells the item
	 * @param price
	 *            of the item
	 * @param if
	 *            the item uses playerpoint
	 * @param the
	 *            number of items offered for sale
	 */
	void sellItem(AuctionItem auctionItem, ItemStack itemStack, Player player, long price, AuctionEconomy economy, int amount,
			AuctionType type);

	/**
	 * 
	 * @param player
	 * @return
	 */
	List<AuctionItem> getSortItems(Player player);

	/**
	 * 
	 * @param player
	 * @return
	 */
	Sorting getSort(Player player);

	/**
	 * 
	 * @param player
	 * @param sorting
	 */
	void setSort(Player player, Sorting sorting);

	/**
	 * Load configuration
	 */
	void loadConfiguration();

	/**
	 * 
	 * @param player
	 * @return max item player can sell
	 */
	 long getMaxSellPerPermission(Permissible player);
	
	/**
	 * 
	 * @param player
	 * @return expiration
	 */
	 long getExpirationPerPermission(Permissible player);

	/**
	 * 
	 * @param player
	 * @return
	 */
	boolean canSellMoreItem(Player player);

	/**
	 * 
	 * @param player
	 * @param type
	 * @return
	 */
	long count(Player player, StorageType type);

	/**
	 * Remove an item
	 * 
	 * @param auctionItem
	 * @param player
	 * @param isAdmin
	 */
	void remove(AuctionItem auctionItem, Player player, boolean isAdmin);

	/**
	 * Get expire item
	 * 
	 * @param player
	 * @return
	 */
	List<AuctionItem> getExpire(Player player);

	/**
	 * 
	 * @param player
	 * @param auctionItem
	 * @param expire
	 */
	void removeItem(Player player, AuctionItem auctionItem, StorageType expire);

	/**
	 * Buy an item
	 * 
	 * @param auctionItem
	 * @param player
	 */
	void buy(AuctionItem auctionItem, Player player);

	/**
	 * 
	 * @param player
	 * @return
	 */
	List<AuctionItem> getBuying(Player player);

	/**
	 * 
	 * @param storage
	 * @return
	 */
	long count(StorageType storage);

	/**
	 * 
	 * @param player
	 */
	void nextSort(Player player);

	/**
	 * Get player items
	 * 
	 * @param player
	 * @return
	 */
	List<AuctionItem> getItems(Player player);

	/**
	 * 
	 * @param category
	 */
	List<AuctionItem> getItems(Category category);

	/**
	 * 
	 * @param player
	 * @param category
	 * @return
	 */
	List<AuctionItem> getSortItems(Player player, Category category);

	/**
	 * 
	 * @param player
	 * @param type
	 */
	void removeAll(Player player, StorageType type);

	/**
	 * 
	 * @param player
	 * @param name
	 */
	void onNPCRequest(Player player, String name);

	/**
	 * 
	 * @param player
	 * @return
	 */
	boolean isBlacklist(OfflinePlayer player);

	/**
	 * 
	 * @param player
	 */
	void blacklistPlayer(OfflinePlayer player);

	/**
	 * 
	 * @param player
	 */
	void unblacklistPlayer(OfflinePlayer player);

	/**
	 * 
	 * @param player
	 * @param string 
	 */
	void openConfiguration(Player player, String string);

	/**
	 * 
	 * @param player
	 * @param page
	 * @param type
	 */
	void showHistory(CommandSender sender, OfflinePlayer player, int page, HistoryType type);

	/**
	 * Allows you to sell an inventory
	 * 
	 * @param itemStack
	 * @param player
	 * @param price
	 * @param economy
	 * @param command
	 * @param how
	 * @param inventory
	 */
	void createSellInventory(Player player, long price, AuctionEconomy economy, Command command);

	/**
	 * Get blacklist items
	 * 
	 * @deprecated
	 * @return empty collection
	 */
	Collection<ItemStack> getBannedItems();

	/**
	 * Remove item as admin
	 * 
	 * @param player
	 * @param auctionItem
	 * @param isSilent
	 */
	void removeAdmin(Player player, AuctionItem auctionItem, boolean isSilent, boolean isForceRemove);

	/**
	 * 
	 * @param player
	 * @param string
	 */
	void search(Player player, String string);

	/**
	 * 
	 * @param player
	 * @param string
	 * @return
	 */
	List<AuctionItem> getSearch(Player player, String string);

	/**
	 * Set player search
	 * 
	 * @param player
	 * @param word
	 */
	void setPlayerWord(OfflinePlayer player, String word);

	/**
	 * Get player word search
	 * 
	 * @param player
	 * @return
	 */
	String getPlayerWord(OfflinePlayer player);

	/**
	 * 
	 * @param player
	 * @param command
	 * @param inventoryName
	 */
	void open(Player player, Command command, InventoryName inventoryName);

	/**
	 * 
	 * @param player
	 * @param category
	 */
	void setCurrentCategory(Player player, Category category);

	/**
	 * 
	 * @param player
	 * @return
	 */
	Optional<Category> getCurrentCategory(Player player);

	/**
	 * 
	 * @param auctionItem
	 * @return
	 */
	boolean auctionHasBlacklistItems(AuctionItem auctionItem);

	/**
	 * Get priority
	 * 
	 * @param permissible
	 * @return optional
	 */
	Optional<Priority> getPriority(Permissible permissible);
	
	/**
	 * Get priority
	 * 
	 * @param priority
	 * @return optional
	 */
	Optional<Priority> getPriority(int priority);
	
	
	/**
	 * Register economy
	 * 
	 * @param auctionEconomy
	 */
	void registerEconomy(AuctionEconomy auctionEconomy);
	
	/**
	 * Get economy by name
	 * 
	 * @param economyName
	 * @return optional
	 */
	Optional<AuctionEconomy> getEconomy(String economyName);
	
	/**
	 * Retrieve the list of economy
	 * 
	 * @return economies
	 */
	List<AuctionEconomy> getEconomies();

	UUID getRandomUniqueId();

}
