package fr.maxlego08.zauctionhouse.api.event.events;

import org.bukkit.entity.Player;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.event.CancelledAuctionEvent;
import fr.maxlego08.zauctionhouse.api.transaction.Transaction;

public class AuctionPostBuyEvent extends CancelledAuctionEvent {

	private final Player player;
	private final AuctionItem auctionItem;
	private final Transaction transaction;

	/**
	 * @param player
	 * @param auctionItem
	 * @param transaction
	 */
	public AuctionPostBuyEvent(Player player, AuctionItem auctionItem, Transaction transaction) {
		super();
		this.player = player;
		this.auctionItem = auctionItem;
		this.transaction = transaction;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the auctionItem
	 */
	public AuctionItem getAuctionItem() {
		return auctionItem;
	}

	/**
	 * @return the transaction
	 */
	public Transaction getTransaction() {
		return transaction;
	}

}
