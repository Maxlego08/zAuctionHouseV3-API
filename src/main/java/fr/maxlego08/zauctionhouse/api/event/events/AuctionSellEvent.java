package fr.maxlego08.zauctionhouse.api.event.events;

import org.bukkit.entity.Player;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.enums.Economy;
import fr.maxlego08.zauctionhouse.api.event.CancelledAuctionEvent;

public class AuctionSellEvent extends CancelledAuctionEvent {

	private final AuctionItem auctionItem;
	private final long price;
	private final Player player;
	private final Economy economy;

	/**
	 * @param auctionItem
	 * @param price
	 * @param player
	 * @param economy
	 */
	public AuctionSellEvent(AuctionItem auctionItem, long price, Player player, Economy economy) {
		super();
		this.auctionItem = auctionItem;
		this.price = price;
		this.player = player;
		this.economy = economy;
	}

	/**
	 * @return the auctionItem
	 */
	public AuctionItem getAuctionItem() {
		return auctionItem;
	}

	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the economy
	 */
	public Economy getEconomy() {
		return economy;
	}

}
