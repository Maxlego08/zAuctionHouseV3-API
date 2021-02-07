package fr.maxlego08.zauctionhouse.api;

import org.bukkit.OfflinePlayer;

import fr.maxlego08.zauctionhouse.api.enums.Economy;

public interface IEconomy {

	/**
	 * 
	 * @param economy
	 * @param player
	 * @return
	 */
	double getMoney(Economy economy, OfflinePlayer player);
	
	/**
	 * 
	 * @param economy
	 * @param player
	 * @param price
	 * @return
	 */
	boolean hasMoney(Economy economy, OfflinePlayer player, long price);

	/**
	 * 
	 * @param economy
	 * @param player
	 * @param value
	 */
	void depositMoney(Economy economy, OfflinePlayer player, long value);
	
	/**
	 * 
	 * @param economy
	 * @param player
	 * @param value
	 */
	void withdrawMoney(Economy economy, OfflinePlayer player, long value);
}
