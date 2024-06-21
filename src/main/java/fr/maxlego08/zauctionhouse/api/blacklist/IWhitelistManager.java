package fr.maxlego08.zauctionhouse.api.blacklist;

import java.util.List;
import java.util.Optional;

import org.bukkit.inventory.ItemStack;

public interface IWhitelistManager {

    /**
     * Get the list of whitelisted items or entities.
     *
     * @return a list of whitelisted items or entities.
     */
    List<ItemChecker> getWhitelist();

    /**
     * Register an item or entity to the whitelist.
     *
     * @param whitelist the item or entity to be whitelisted.
     */
    void registerWhitelist(ItemChecker whitelist);

    /**
     * Unregister an item or entity from the whitelist.
     *
     * @param whitelist the item or entity to be removed from the whitelist.
     */
    void unregisterWhitelist(ItemChecker whitelist);

    /**
     * Unregister all items or entities from the whitelist.
     */
    void unregisterAll();

    /**
     * Check if an item is in the whitelist.
     *
     * @param itemStack the item to check.
     * @return an Optional containing the whitelist entry if the item is whitelisted, or an empty Optional if not.
     */
    Optional<ItemChecker> isWhitelist(ItemStack itemStack);


}
