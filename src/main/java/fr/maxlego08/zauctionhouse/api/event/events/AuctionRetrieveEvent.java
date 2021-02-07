package fr.maxlego08.zauctionhouse.api.event.events;

import org.bukkit.entity.Player;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.event.CancelledAuctionEvent;

public class AuctionRetrieveEvent extends CancelledAuctionEvent {

	private final boolean isAdmin;
	private final Player player;
	private final AuctionItem auctionItem;

	/**
	 * @param isAdmin
	 * @param player
	 * @param auctionItem
	 */
	public AuctionRetrieveEvent(boolean isAdmin, Player player, AuctionItem auctionItem) {
		super();
		this.isAdmin = isAdmin;
		this.player = player;
		this.auctionItem = auctionItem;
	}

	/**
	 * @return the isAdmin
	 */
	public boolean isAdmin() {
		return isAdmin;
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

}
