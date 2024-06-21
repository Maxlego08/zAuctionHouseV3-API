package fr.maxlego08.zauctionhouse.api;

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
import fr.maxlego08.zauctionhouse.api.utils.CacheAuctionItem;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permissible;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AuctionManager {

    /**
     * Opens the player's inventory based on the given command.
     *
     * @param player  the player whose inventory is to be opened.
     * @param command the command used to open the inventory.
     */
    void open(Player player, Command command);

    /**
     * Opens the default inventory for the player.
     *
     * @param player the player whose default inventory is to be opened.
     */
    void openDefault(Player player);

    /**
     * Opens a specific type of inventory for the player.
     *
     * @param plugin         the auction plugin instance.
     * @param type           the type of inventory to open.
     * @param player         the player whose inventory is to be opened.
     * @param auctionItem    the auction item related to the inventory.
     * @param page           the page number to display.
     * @param oldInventories the list of previous inventories.
     * @param category       the category of items to display.
     */
    void open(AuctionPlugin plugin, InventoryType type, Player player, AuctionItem auctionItem, int page,
              List<Inventory> oldInventories, String category);

    /**
     * Reloads the plugin configuration and data.
     */
    void reload();

    /**
     * Closes the inventory for all players.
     */
    void closeInventory();

    /**
     * Gets the storage interface for managing auction data.
     *
     * @return the storage interface.
     */
    IStorage getStorage();

    /**
     * Updates the auction items for sale and moves expired items to storage.
     *
     * @param type the type of storage to update.
     */
    void update(StorageType type);

    /**
     * Sells an item on the auction.
     *
     * @param auctionItem the item to be sold.
     * @param itemStack   the item stack to be sold.
     * @param player      the player selling the item.
     * @param price       the price of the item.
     * @param economy     the economy type used.
     * @param amount      the amount of items to sell.
     * @param type        the type of auction.
     */
    void sellItem(AuctionItem auctionItem, ItemStack itemStack, Player player, long price, AuctionEconomy economy, int amount, AuctionType type);

    /**
     * Gets a sorted list of auction items for the player.
     *
     * @param player the player requesting the sorted items.
     * @return a list of sorted auction items.
     */
    List<AuctionItem> getSortItems(Player player);

    /**
     * Gets the sorting preference for the player.
     *
     * @param player the player whose sorting preference is to be retrieved.
     * @return the sorting preference.
     */
    Sorting getSort(Player player);

    /**
     * Sets the sorting preference for the player.
     *
     * @param player  the player whose sorting preference is to be set.
     * @param sorting the sorting preference.
     */
    void setSort(Player player, Sorting sorting);

    /**
     * Loads the plugin configuration.
     */
    void loadConfiguration();

    /**
     * Gets the maximum number of items the player can sell based on their permissions.
     *
     * @param player the player whose permissions are to be checked.
     * @return the maximum number of items the player can sell.
     */
    long getMaxSellPerPermission(Permissible player);

    /**
     * Gets the expiration time of items the player can sell based on their permissions.
     *
     * @param player the player whose permissions are to be checked.
     * @return the expiration time of items.
     */
    long getExpirationPerPermission(Permissible player);

    /**
     * Checks if the player can sell more items.
     *
     * @param player the player to be checked.
     * @return true if the player can sell more items, false otherwise.
     */
    boolean canSellMoreItem(Player player);

    /**
     * Counts the number of items a player has in a specific storage type.
     *
     * @param player the player whose items are to be counted.
     * @param type   the type of storage.
     * @return the number of items.
     */
    long count(Player player, StorageType type);

    /**
     * Removes an item from the auction.
     *
     * @param auctionItem the item to be removed.
     * @param player      the player removing the item.
     * @param isAdmin     whether the removal is done by an admin.
     */
    void remove(AuctionItem auctionItem, Player player, boolean isAdmin);

    /**
     * Gets a list of expired items for the player.
     *
     * @param player the player whose expired items are to be retrieved.
     * @return a list of expired items.
     */
    List<AuctionItem> getExpire(Player player);

    /**
     * Removes an item from the player's storage.
     *
     * @param player      the player whose item is to be removed.
     * @param auctionItem the item to be removed.
     * @param expire      the storage type of the item.
     */
    void removeItem(Player player, AuctionItem auctionItem, StorageType expire);

    /**
     * Buys an item from the auction.
     *
     * @param auctionItem the item to be bought.
     * @param player      the player buying the item.
     */
    void buy(AuctionItem auctionItem, Player player);

    /**
     * Gets a list of items the player is currently buying.
     *
     * @param player the player whose buying items are to be retrieved.
     * @return a list of buying items.
     */
    List<AuctionItem> getBuying(Player player);

    /**
     * Counts the number of items in a specific storage type.
     *
     * @param storage the type of storage.
     * @return the number of items.
     */
    long count(StorageType storage);

    /**
     * Advances to the next sorting option for the player.
     *
     * @param player the player whose sorting option is to be advanced.
     */
    void nextSort(Player player);

    /**
     * Gets a list of items the player is selling.
     *
     * @param player the player whose selling items are to be retrieved.
     * @return a list of selling items.
     */
    List<AuctionItem> getItems(Player player);

    /**
     * Gets a list of items in a specific category.
     *
     * @param category the category of items.
     * @return a list of items in the category.
     */
    List<AuctionItem> getItems(Category category);

    /**
     * Gets a sorted list of items in a specific category for the player.
     *
     * @param player   the player requesting the sorted items.
     * @param category the category of items.
     * @return a sorted list of items in the category.
     */
    List<AuctionItem> getSortItems(Player player, Category category);

    /**
     * Removes all items of a specific storage type for the player.
     *
     * @param player the player whose items are to be removed.
     * @param type   the type of storage.
     */
    void removeAll(Player player, StorageType type);

    /**
     * Handles NPC requests from the player.
     *
     * @param player the player making the request.
     * @param name   the name of the NPC.
     */
    void onNPCRequest(Player player, String name);

    /**
     * Checks if a player is blacklisted.
     *
     * @param player the player to be checked.
     * @return true if the player is blacklisted, false otherwise.
     */
    boolean isBlacklist(OfflinePlayer player);

    /**
     * Blacklists a player.
     *
     * @param player the player to be blacklisted.
     */
    void blacklistPlayer(OfflinePlayer player);

    /**
     * Removes a player from the blacklist.
     *
     * @param player the player to be removed from the blacklist.
     */
    void unBlacklistPlayer(OfflinePlayer player);

    /**
     * Opens the plugin configuration interface for the player.
     *
     * @param player the player whose configuration interface is to be opened.
     * @param string the configuration to be opened.
     */
    void openConfiguration(Player player, String string);

    /**
     * Shows the auction history for a player.
     *
     * @param sender the command sender requesting the history.
     * @param player the player whose history is to be shown.
     * @param page   the page number to display.
     * @param type   the type of history.
     */
    void showHistory(CommandSender sender, OfflinePlayer player, int page, HistoryType type);

    /**
     * Creates an inventory for selling items.
     *
     * @param player  the player creating the inventory.
     * @param price   the price of the items.
     * @param economy the economy type used.
     * @param command the command associated with the inventory.
     */
    void createSellInventory(Player player, long price, AuctionEconomy economy, Command command);

    /**
     * Removes an item as an admin.
     *
     * @param player        the player removing the item.
     * @param auctionItem   the item to be removed.
     * @param isSilent      whether the removal is silent.
     * @param isForceRemove whether the removal is forced.
     */
    void removeAdmin(Player player, AuctionItem auctionItem, boolean isSilent, boolean isForceRemove);

    /**
     * Searches for items based on a keyword.
     *
     * @param player the player making the search.
     * @param string the keyword to search for.
     */
    void search(Player player, String string);

    /**
     * Gets a list of items matching a search keyword for the player.
     *
     * @param player the player making the search.
     * @param string the keyword to search for.
     * @return a list of items matching the search.
     */
    List<AuctionItem> getSearch(Player player, String string);

    /**
     * Sets a player's search keyword.
     *
     * @param player the player whose keyword is to be set.
     * @param word   the search keyword.
     */
    void setPlayerWord(OfflinePlayer player, String word);

    /**
     * Gets a player's search keyword.
     *
     * @param player the player whose keyword is to be retrieved.
     * @return the search keyword.
     */
    String getPlayerWord(OfflinePlayer player);

    /**
     * Opens a specific inventory for the player based on a command and inventory name.
     *
     * @param player        the player whose inventory is to be opened.
     * @param command       the command used to open the inventory.
     * @param inventoryName the name of the inventory to be opened.
     */
    void open(Player player, Command command, InventoryName inventoryName);

    /**
     * Sets the current category for the player.
     *
     * @param player   the player whose category is to be set.
     * @param category the category to set.
     */
    void setCurrentCategory(Player player, Category category);

    /**
     * Gets the current category for the player.
     *
     * @param player the player whose category is to be retrieved.
     * @return the current category.
     */
    Optional<Category> getCurrentCategory(Player player);

    /**
     * Checks if an auction item contains any blacklisted items.
     *
     * @param auctionItem the auction item to be checked.
     * @return true if the auction item contains blacklisted items, false otherwise.
     */
    boolean auctionHasBlacklistItems(AuctionItem auctionItem);

    /**
     * Checks if an auction item contains any whitelisted items.
     *
     * @param auctionItem the auction item to be checked.
     * @return true if the auction item contains whitelisted items, false otherwise.
     */
    boolean auctionHasWhitelistItems(AuctionItem auctionItem);

    /**
     * Gets the priority level for a permissible entity.
     *
     * @param permissible the entity whose priority is to be checked.
     * @return an optional containing the priority level.
     */
    Optional<Priority> getPriority(Permissible permissible);

    /**
     * Gets the priority level based on the priority value.
     *
     * @param priority the priority value.
     * @return an optional containing the priority level.
     */
    Optional<Priority> getPriority(int priority);

    /**
     * Generates a random unique identifier (UUID).
     *
     * @return a random UUID.
     */
    UUID getRandomUniqueId();

    /**
     * Gets a list of banned worlds where auctions are not allowed.
     *
     * @return a list of banned worlds.
     */
    List<String> getBannedWorld();

    /**
     * Clears the auction cache.
     */
    void clearCache();

    /**
     * Formats a price into a human-readable string.
     *
     * @param price the price to be formatted.
     * @return the formatted price string.
     */
    String getPriceFormat(long price);

    /**
     * Gets a list of banned worlds where auctions are not allowed.
     *
     * @return a list of banned worlds.
     */
    List<String> getBannedWorlds();

    /**
     * Gets the cache of auction items.
     *
     * @return the cache of auction items.
     */
    CacheAuctionItem getCacheAuctionItemList();

    /**
     * Gives an auction item to a player.
     *
     * @param auctionItem the auction item to be given.
     * @param player      the player to receive the item.
     */
    void giveAuctionItem(AuctionItem auctionItem, Player player);
}
