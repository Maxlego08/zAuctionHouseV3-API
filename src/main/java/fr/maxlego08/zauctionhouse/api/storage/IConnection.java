package fr.maxlego08.zauctionhouse.api.storage;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.AuctionPlugin;
import fr.maxlego08.zauctionhouse.api.enums.StorageType;
import fr.maxlego08.zauctionhouse.api.transaction.Transaction;

public interface IConnection {

	/**
	 * 
	 * @return
	 */
	public Connection getConnection();

	/*
	 * 
	 */
	public void asyncConnect();

	/**
	 * 
	 * @throws SQLException
	 */
	public void connect() throws SQLException;

	/**
	 * 
	 */
	public void disconnect();

	/**
	 * Insert items
	 * 
	 * @param auctionItem
	 * @param type
	 */
	public void asyncInsert(AuctionItem auctionItem, StorageType type);

	/**
	 * Delete item
	 * 
	 * @param auctionItem
	 * @param type
	 */
	public void asyncDelete(AuctionItem auctionItem, StorageType type);

	/**
	 * 
	 * @param sqlStorage
	 * @param manager
	 */
	public void selectItems(AuctionPlugin plugin, IStorage iStorage, StorageManager manager);

	/**
	 * 
	 * @param transaction
	 */
	public void asyncInsert(Transaction transaction);

	/**
	 * 
	 * @param plugin
	 * @param sqlStorage
	 * @param manager
	 */
	public void selectTransactions(AuctionPlugin plugin, IStorage iStorage, StorageManager manager);

	/**
	 * 
	 * @param auctionItem
	 * @param type
	 */
	public void asyncUpdate(AuctionItem auctionItem, StorageType type);

	/**
	 * 
	 * @param transactions
	 */
	public void asyncUpdate(List<Transaction> transactions);

	/**
	 * 
	 * @param runnable
	 * @return
	 */
	public void getAndRefreshConnection(Runnable runnable);

}
