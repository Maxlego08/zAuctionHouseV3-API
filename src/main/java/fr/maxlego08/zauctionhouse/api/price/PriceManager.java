package fr.maxlego08.zauctionhouse.api.price;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.economy.AuctionEconomy;
import fr.maxlego08.zauctionhouse.api.economy.EconomyLimit;
import fr.maxlego08.zauctionhouse.api.storage.Savable;
import org.bukkit.inventory.ItemStack;

import java.util.Optional;

/**
 * This interface defines methods for managing prices within an auction economy system.
 */
public interface PriceManager extends Savable {

    /**
     * Retrieves the minimum price for the specified ItemStack within the given AuctionEconomy.
     *
     * @param itemStack      The ItemStack for which to retrieve the minimum price.
     * @param auctionEconomy The AuctionEconomy context in which to determine the price.
     * @return The minimum price for the specified ItemStack.
     */
    long getMinPrice(ItemStack itemStack, AuctionEconomy auctionEconomy);

    /**
     * Retrieves the minimum price for the specified AuctionItem within the given AuctionEconomy.
     *
     * @param auctionItem    The AuctionItem for which to retrieve the minimum price.
     * @param auctionEconomy The AuctionEconomy context in which to determine the price.
     * @return The minimum price for the specified AuctionItem.
     */
    long getMinPrice(AuctionItem auctionItem, AuctionEconomy auctionEconomy);

    /**
     * Retrieves the maximum price for the specified AuctionItem within the given AuctionEconomy.
     *
     * @param auctionItem    The AuctionItem for which to retrieve the maximum price.
     * @param auctionEconomy The AuctionEconomy context in which to determine the price.
     * @return The maximum price for the specified AuctionItem.
     */
    long getMaxPrice(AuctionItem auctionItem, AuctionEconomy auctionEconomy);

    /**
     * Retrieves the price information associated with the specified ItemStack, if available.
     *
     * @param itemStack The ItemStack for which to retrieve price information.
     * @return An Optional containing the PriceItem associated with the ItemStack, if available.
     */
    Optional<PriceItem> getPrice(ItemStack itemStack);

    /**
     * Retrieves the economy limit information associated with the specified AuctionEconomy, if available.
     *
     * @param auctionEconomy The AuctionEconomy for which to retrieve economy limit information.
     * @return An Optional containing the EconomyLimit associated with the AuctionEconomy, if available.
     */
    Optional<EconomyLimit> getEconomyLimit(AuctionEconomy auctionEconomy);

}

