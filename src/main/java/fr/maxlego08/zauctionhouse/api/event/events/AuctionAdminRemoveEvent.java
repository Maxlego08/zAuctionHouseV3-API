package fr.maxlego08.zauctionhouse.api.event.events;

import org.bukkit.entity.Player;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.event.CancelledAuctionEvent;

public class AuctionAdminRemoveEvent extends CancelledAuctionEvent {

	private final Player player;
	private final AuctionItem auctionItem;

	/**
	 * @param player
	 * @param auctionItem
	 */
	public AuctionAdminRemoveEvent(Player player, AuctionItem auctionItem) {
		super();
		this.player = player;
		this.auctionItem = auctionItem;
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
