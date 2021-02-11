package fr.maxlego08.zauctionhouse.api.event.events;

import org.bukkit.entity.Player;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.enums.StorageType;
import fr.maxlego08.zauctionhouse.api.event.CancelledAuctionEvent;

public class AuctionRemoveEvent extends CancelledAuctionEvent {

	private final Player player;
	private final AuctionItem auctionItem;
	private final StorageType type;

	/**
	 * @param player
	 * @param item
	 * @param type
	 */
	public AuctionRemoveEvent(Player player, AuctionItem item, StorageType type) {
		super();
		this.player = player;
		this.auctionItem = item;
		this.type = type;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the type
	 */
	public StorageType getType() {
		return type;
	}
	
	/**
	 * 
	 * @return {@link AuctionItem}
	 */
	public AuctionItem getAuctionItem() {
		return auctionItem;
	}

}
