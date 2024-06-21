package fr.maxlego08.zauctionhouse.api.economy;

import org.bukkit.OfflinePlayer;

public interface AuctionEconomy {

	/**
	 * Retrieves the player's balance.
	 *
	 * @param offlinePlayer the player whose balance is to be retrieved.
	 * @return the player's balance as a long.
	 */
	long getMoney(OfflinePlayer offlinePlayer);

	/**
	 * Checks if a player has enough money.
	 *
	 * @param offlinePlayer the player whose balance is to be checked.
	 * @param price         the amount of money required.
	 * @return true if the player has enough money, false otherwise.
	 */
	boolean hasMoney(OfflinePlayer offlinePlayer, long price);

	/**
	 * Deposits money into a player's account.
	 *
	 * @param offlinePlayer the player whose account will receive the money.
	 * @param value         the amount of money to deposit.
	 */
	void depositMoney(OfflinePlayer offlinePlayer, long value);

	/**
	 * Withdraws money from a player's account.
	 *
	 * @param offlinePlayer the player whose account will be debited.
	 * @param value         the amount of money to withdraw.
	 */
	void withdrawMoney(OfflinePlayer offlinePlayer, long value);

	/**
	 * Gets the currency symbol or name used in the economy.
	 * This is used for display purposes in messages and inventories.
	 *
	 * @return the currency as a string.
	 */
	String getCurrency();

	/**
	 * Gets the format used for displaying prices in the sales command.
	 *
	 * @return the format string.
	 */
	String getFormat();

	/**
	 * Gets the message sent when a player does not have enough money.
	 *
	 * @return the deny message as a string.
	 */
	String getDenyMessage();

	/**
	 * Gets the name of the economy system.
	 *
	 * @return the name of the economy as a string.
	 */
	String getName();

	/**
	 * Formats a price string according to the economy's currency format.
	 *
	 * @param priceAsString the price as a string.
	 * @param amount        the amount of the item being formatted.
	 * @return the formatted price string.
	 */
	default String format(String priceAsString, long amount) {
		return getCurrency().replace("%price%", priceAsString).replace("%s%", amount > 1 ? "s" : "");
	}
}
