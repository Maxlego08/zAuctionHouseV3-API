package fr.maxlego08.zauctionhouse.api;

import fr.maxlego08.zauctionhouse.api.economy.AuctionEconomy;
import fr.maxlego08.zauctionhouse.api.enums.AuctionType;
import fr.maxlego08.zauctionhouse.api.enums.Message;
import fr.maxlego08.zauctionhouse.api.enums.StorageType;
import fr.maxlego08.zauctionhouse.api.filter.Filter;
import fr.maxlego08.zauctionhouse.api.transaction.Transaction;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public interface AuctionItem {

    /**
     * Gets the unique identifier for the item.
     *
     * @return the UUID of the item.
     */
    UUID getUniqueId();

    /**
     * Gets the item stack representing the auction item.
     *
     * @return the {@link ItemStack}.
     */
    ItemStack getItemStack();

    /**
     * Gets the type of the auction.
     *
     * @return the {@link AuctionType}.
     */
    AuctionType getType();

    /**
     * Gets the price of the auction item.
     *
     * @return the price.
     */
    long getPrice();

    /**
     * Sets the price of the auction item.
     *
     * @param price the price to set.
     */
    void setPrice(long price);

    /**
     * Gets the economy type used in the auction.
     *
     * @return the {@link AuctionEconomy}.
     */
    AuctionEconomy getEconomy();

    /**
     * Gets the name of the economy type used.
     *
     * @return the economy name.
     */
    String getEconomyName();

    /**
     * Gets the seller of the auction item as an {@link OfflinePlayer}.
     *
     * @return the seller.
     */
    OfflinePlayer getSeller();

    /**
     * Gets the buyer of the auction item as an {@link OfflinePlayer}.
     *
     * @return the buyer.
     */
    OfflinePlayer getBuyer();

    /**
     * Sets the buyer of the auction item using their UUID.
     *
     * @param uuid the UUID of the buyer.
     */
    void setBuyer(UUID uuid);

    /**
     * Gets the UUID of the seller.
     *
     * @return the UUID of the seller.
     */
    UUID getSellerUniqueId();

    /**
     * Gets the UUID of the buyer.
     *
     * @return the UUID of the buyer.
     */
    UUID getBuyerUniqueId();

    /**
     * Gets the expiration time of the auction item.
     *
     * @return the expiration time in milliseconds.
     */
    long getExpireAt();

    /**
     * Sets the expiration time of the auction item.
     *
     * @param expireAt the expiration time in milliseconds.
     */
    void setExpireAt(long expireAt);

    /**
     * Serializes the item stack to a string.
     *
     * @return the serialized item stack.
     */
    String serializedItem();

    /**
     * Creates an item stack with specific player and message attributes.
     *
     * @param player  the player for whom the item is created.
     * @param message the message associated with the item.
     * @return the created {@link ItemStack}.
     */
    ItemStack createItem(Player player, Message message);

    /**
     * Checks if the item can be bought.
     *
     * @return true if the item can be bought, false otherwise.
     */
    boolean canBuy();

    /**
     * Sets whether the item can be bought.
     *
     * @param b true if the item can be bought, false otherwise.
     */
    void setCanBuy(boolean b);

    /**
     * Checks if the item is already being bought.
     *
     * @return true if the item is already being bought, false otherwise.
     */
    boolean isAlreadyBuying();

    /**
     * Sets whether the item is already being bought.
     *
     * @param b true if the item is already being bought, false otherwise.
     */
    void setAlreadyBuying(boolean b);

    /**
     * Gets the amount of items in the item stack.
     *
     * @return the amount of items.
     */
    int getAmount();

    /**
     * Builds a transaction for the auction item at the specified price.
     *
     * @param price the price for the transaction.
     * @return the {@link Transaction}.
     */
    Transaction buildTransaction(long price);

    /**
     * Gets the list of item stacks associated with the auction item.
     *
     * @return a list of {@link ItemStack}s.
     */
    List<ItemStack> getItemStacks();

    /**
     * Serializes the list of item stacks to a list of strings.
     *
     * @return a list of serialized item stacks.
     */
    List<String> serializedItems();

    /**
     * Checks if the player has free space for the item.
     *
     * @param player the player to check.
     * @return true if the player has free space, false otherwise.
     */
    boolean hasFreeSpace(Player player);

    /**
     * Matches the auction item with a specified filter and string.
     *
     * @param optional the optional filter to match.
     * @param string   the string to match.
     * @return true if the item matches the filter and string, false otherwise.
     */
    boolean match(Optional<Filter> optional, String string);

    /**
     * Checks if the auction item has expired.
     *
     * @return true if the item has expired, false otherwise.
     */
    boolean isExpired();

    /**
     * Gets the storage type of the auction item.
     *
     * @return the {@link StorageType}.
     */
    StorageType getStorageType();

    /**
     * Sets the storage type of the auction item.
     *
     * @param storageType the storage type to set.
     */
    void setStorageType(StorageType storageType);

    /**
     * Gets the name of the seller.
     *
     * @return the seller's name.
     */
    String getSellerName();

    /**
     * Gives the auction item to a player if the specified predicate is satisfied.
     *
     * @param player    the player to give the item to.
     * @param predicate the predicate to check.
     */
    void giveIf(Player player, Predicate<AuctionItem> predicate);

    /**
     * Gets the priority of the auction item.
     *
     * @return the priority.
     */
    int getPriority();

    /**
     * Formats the price of the auction item as a string.
     *
     * @return the formatted price.
     */
    String priceFormat();

    /**
     * Formats the remaining time of the auction item as a string.
     *
     * @return the formatted time.
     */
    String timeFormat();

    /**
     * Formats the status of the auction item based on the specified unique ID.
     *
     * @param uniqueId the unique ID to check the status against.
     * @return the formatted status.
     */
    String statusFormat(UUID uniqueId);

    /**
     * Gets the UUID of the buyer.
     *
     * @return the UUID of the buyer.
     */
    UUID getBuyerUUID();

    /**
     * Gets the server name associated with the auction item.
     *
     * @return the server name.
     */
    String getServer();
}

