package fr.maxlego08.zauctionhouse.api.transaction;

import java.util.List;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.enums.Economy;
import fr.maxlego08.zauctionhouse.api.enums.HistoryType;

public interface TransactionManager {

	/**
	 * Allows to add a transaction and stcoker
	 * @param auctionItem
	 */
	public void storeTransaction(AuctionItem auctionItem);

	/**
	 * Allows you to retrieve a list of transactions
	 * @param player
	 * @param type
	 * @return {@link List} of transaction
	 */
	public List<Transaction> getTransactions(OfflinePlayer player, HistoryType type);

	/**
	 * Allows to retrieve the list of transactions where the player has to retrieve the money.
	 * @param player
	 * @return {@link List} of transaction
	 */
	public List<Transaction> getMoneyTransactions(OfflinePlayer player);

	/**
	 * Gives the number of transactions where the player has to get the money back.
	 * @param offlinePlayer
	 * @return amount of transaction who need to get money
	 */
	public boolean needMoney(OfflinePlayer offlinePlayer);

	/**
	 * Permet d'obtenir le nombre de transaction non lu
	 * @param offlinePlayer
	 * @return amount of transaction who is not read
	 */
	public long countUnRead(OfflinePlayer offlinePlayer);

	/**
	 * Allows to read unread transactions
	 * @param player
	 */
	public void updateUnRead(OfflinePlayer player);
	
	/**
	 * Allows you to retrieve your stored money
	 * @param player
	 */
	public void claimMoney(Player player);

	/**
	 * 
	 * @param player
	 * @param economy
	 * @return
	 */
	public long getMonais(Player player, Economy economy);
	
	/**
	 * Get transactions buy player and economy
	 * @param offlinePlayer
	 * @param economy
	 * @return
	 */
	public List<Transaction> getMoneyTransactions(OfflinePlayer offlinePlayer, Economy economy);
	
}
