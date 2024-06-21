package fr.maxlego08.zauctionhouse.api.economy;

import java.util.Collection;
import java.util.Optional;

public interface EconomyManager {

    /**
     * Gets a collection of all registered economies.
     *
     * @return a collection of {@link AuctionEconomy} instances.
     */
    Collection<AuctionEconomy> getEconomies();

    /**
     * Registers a new economy.
     *
     * @param economy the {@link AuctionEconomy} to register.
     * @return true if the economy was successfully registered, false otherwise.
     */
    boolean registerEconomy(AuctionEconomy economy);

    /**
     * Removes an existing economy.
     *
     * @param economy the {@link AuctionEconomy} to remove.
     * @return true if the economy was successfully removed, false otherwise.
     */
    boolean removeEconomy(AuctionEconomy economy);

    /**
     * Gets an economy by its name.
     *
     * @param economyName the name of the economy to retrieve.
     * @return an {@link Optional} containing the {@link AuctionEconomy} if found, or an empty {@link Optional} if not found.
     */
    Optional<AuctionEconomy> getEconomy(String economyName);

    /**
     * Loads all available economies.
     */
    void loadEconomies();
}

