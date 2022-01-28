package fr.maxlego08.zauctionhouse.api;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permissible;

import fr.maxlego08.zauctionhouse.api.category.Category;
import fr.maxlego08.zauctionhouse.api.command.Command;
import fr.maxlego08.zauctionhouse.api.enums.AuctionType;
import fr.maxlego08.zauctionhouse.api.enums.Economy;
import fr.maxlego08.zauctionhouse.api.enums.HistoryType;
import fr.maxlego08.zauctionhouse.api.enums.InventoryName;
import fr.maxlego08.zauctionhouse.api.enums.InventoryType;
import fr.maxlego08.zauctionhouse.api.enums.Sorting;
import fr.maxlego08.zauctionhouse.api.enums.StorageType;
import fr.maxlego08.zauctionhouse.api.inventory.Inventory;
import fr.maxlego08.zauctionhouse.api.storage.IStorage;

public interface AuctionManager {

	/**
	 * Open player inventory
	 * 
	 * @param player
	 * @param command
	 */
	public void open(Player player, Command command);

	/**
	 * 
	 * @param player
	 */
	public void openDefault(Player player);

	/**
	 * Open player inventory
	 * 
	 * @param player
	 * @param command
	 */
	public void open(AuctionPlugin plugin, InventoryType type, Player player, AuctionItem auctionItem, int page,
			List<Inventory> oldInventories, String category);

	/**
	 * Reload plugin
	 */
	public void reload();

	/**
	 * Close players inventory
	 */
	public void closeInventory();

	/**
	 * 
	 * @return {@link IEconomy}
	 */
	public IEconomy getIEconomy();

	/**
	 * 
	 * @return {@link IStorage}
	 */
	public IStorage getStorage();

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
	void sellItem(AuctionItem auctionItem, ItemStack itemStack, Player player, long price, Economy economy, int amount,
			AuctionType type);

	/**
	 * 
	 * @param player
	 * @return
	 */
	public List<AuctionItem> getSortItems(Player player);

	/**
	 * 
	 * @param player
	 * @return
	 */
	public Sorting getSort(Player player);

	/**
	 * 
	 * @param player
	 * @param sorting
	 */
	public void setSort(Player player, Sorting sorting);

	/**
	 * Load configuration
	 */
	public void loadConfiguration();

	/**
	 * 
	 * @param player
	 * @return max item player can sell
	 */
	int getMaxSellPerPermission(Permissible player);

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
	public List<AuctionItem> getExpire(Player player);

	/**
	 * 
	 * @param player
	 * @param auctionItem
	 * @param expire
	 */
	public void removeItem(Player player, AuctionItem auctionItem, StorageType expire);

	/**
	 * Buy an item
	 * 
	 * @param auctionItem
	 * @param player
	 */
	public void buy(AuctionItem auctionItem, Player player);

	/**
	 * 
	 * @param player
	 * @return
	 */
	public List<AuctionItem> getBuying(Player player);

	/**
	 * 
	 * @param storage
	 * @return
	 */
	public long count(StorageType storage);

	/**
	 * 
	 * @param player
	 */
	public void nextSort(Player player);

	/**
	 * Get player items
	 * 
	 * @param player
	 * @return
	 */
	public List<AuctionItem> getItems(Player player);

	/**
	 * 
	 * @param category
	 */
	public List<AuctionItem> getItems(Category category);

	/**
	 * 
	 * @param player
	 * @param category
	 * @return
	 */
	public List<AuctionItem> getSortItems(Player player, Category category);

	/**
	 * 
	 * @param player
	 * @param type
	 */
	public void removeAll(Player player, StorageType type);

	/**
	 * 
	 * @param player
	 * @param name
	 */
	public void onNPCRequest(Player player, String name);

	/**
	 * 
	 * @param player
	 * @return
	 */
	public boolean isBlacklist(OfflinePlayer player);

	/**
	 * 
	 * @param player
	 */
	public void blacklistPlayer(OfflinePlayer player);

	/**
	 * 
	 * @param player
	 */
	public void unblacklistPlayer(OfflinePlayer player);

	/**
	 * 
	 * @param player
	 */
	public void openConfiguration(Player player);

	/**
	 * 
	 * @param player
	 * @param page
	 * @param type
	 */
	public void showHistory(CommandSender sender, OfflinePlayer player, int page, HistoryType type);

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
	public void createSellInventory(Player player, long price, Economy economy, Command command);

	/**
	 * Get blacklist items
	 * 
	 * @deprecated
	 * @return empty collection
	 */
	public Collection<ItemStack> getBannedItems();

	/**
	 * Remove item as admin
	 * 
	 * @param player
	 * @param auctionItem
	 * @param isSilent
	 */
	public void removeAdmin(Player player, AuctionItem auctionItem, boolean isSilent, boolean isForceRemove);

	/**
	 * 
	 * @param player
	 * @param string
	 */
	public void search(Player player, String string);

	/**
	 * 
	 * @param player
	 * @param string
	 * @return
	 */
	public List<AuctionItem> getSearch(Player player, String string);

	/**
	 * Set player search
	 * 
	 * @param player
	 * @param word
	 */
	public void setPlayerWord(OfflinePlayer player, String word);

	/**
	 * Get player word search
	 * 
	 * @param player
	 * @return
	 */
	public String getPlayerWord(OfflinePlayer player);

	/**
	 * 
	 * @param player
	 * @param command
	 * @param inventoryName
	 */
	public void open(Player player, Command command, InventoryName inventoryName);

	/**
	 * 
	 * @param player
	 * @param category
	 */
	public void setCurrentCategory(Player player, Category category);

	/**
	 * 
	 * @param player
	 * @return
	 */
	public Optional<Category> getCurrentCategory(Player player);
	
	/**
	 * 
	 * @param auctionItem
	 * @return
	 */
	public boolean auctionHasBlacklistItems(AuctionItem auctionItem);

}
