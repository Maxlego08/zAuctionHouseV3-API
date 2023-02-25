package fr.maxlego08.zauctionhouse.api.event.events;

import org.bukkit.entity.Player;

import fr.maxlego08.zauctionhouse.api.economy.AuctionEconomy;
import fr.maxlego08.zauctionhouse.api.event.CancelledAuctionEvent;
import fr.maxlego08.zauctionhouse.api.transaction.Transaction;

public class AuctionClaimEvent extends CancelledAuctionEvent {

	private final Player player;
	private final Transaction transaction;
	private long price;
	private AuctionEconomy economy;

	/**
	 * @param player
	 * @param transaction
	 * @param price
	 * @param economy
	 */
	public AuctionClaimEvent(Player player, Transaction transaction, long price, AuctionEconomy economy) {
		super();
		this.player = player;
		this.transaction = transaction;
		this.price = price;
		this.economy = economy;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the transaction
	 */
	public Transaction getTransaction() {
		return transaction;
	}

	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @return the economy
	 */
	public AuctionEconomy getEconomy() {
		return economy;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}

	/**
	 * @param economy
	 *            the economy to set
	 */
	public void setEconomy(AuctionEconomy economy) {
		this.economy = economy;
	}

}
