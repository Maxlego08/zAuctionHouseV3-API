package fr.maxlego08.zauctionhouse.api.event.events;

import org.bukkit.entity.Player;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.IEconomy;
import fr.maxlego08.zauctionhouse.api.enums.Economy;
import fr.maxlego08.zauctionhouse.api.event.CancelledAuctionEvent;
import fr.maxlego08.zauctionhouse.api.messages.IMessage;

public class AuctionPreBuyEvent extends CancelledAuctionEvent {

	private final IEconomy iEconomy;
	private final Economy economy;
	private final Player player;
	private final AuctionItem auctionItem;
	private boolean hasEnoughtMoney;
	private long price;
	private IMessage buyerMessage;
	private IMessage sellerMessage;

	/**
	 * @param iEconomy
	 * @param economy
	 * @param player
	 * @param auctionItem
	 * @param hasEnoughtMoney
	 * @param price
	 * @param buyerMessage
	 * @param sellerMessage
	 */
	public AuctionPreBuyEvent(IEconomy iEconomy, Economy economy, Player player, AuctionItem auctionItem,
			boolean hasEnoughtMoney, long price, IMessage buyerMessage, IMessage sellerMessage) {
		super();
		this.iEconomy = iEconomy;
		this.economy = economy;
		this.player = player;
		this.auctionItem = auctionItem;
		this.hasEnoughtMoney = hasEnoughtMoney;
		this.price = price;
		this.buyerMessage = buyerMessage;
		this.sellerMessage = sellerMessage;
	}

	/**
	 * @return the iEconomy
	 */
	public IEconomy getiEconomy() {
		return iEconomy;
	}

	/**
	 * @return the economy
	 */
	public Economy getEconomy() {
		return economy;
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
	 * @return the hasEnoughtMoney
	 */
	public boolean isHasEnoughtMoney() {
		return hasEnoughtMoney;
	}

	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @param hasEnoughtMoney
	 *            the hasEnoughtMoney to set
	 */
	public void setHasEnoughtMoney(boolean hasEnoughtMoney) {
		this.hasEnoughtMoney = hasEnoughtMoney;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}

	/**
	 * @return the buyerMessage
	 */
	public IMessage getBuyerMessage() {
		return buyerMessage;
	}

	/**
	 * @return the sellerMessage
	 */
	public IMessage getSellerMessage() {
		return sellerMessage;
	}

	/**
	 * @param buyerMessage
	 *            the buyerMessage to set
	 */
	public void setBuyerMessage(IMessage buyerMessage) {
		this.buyerMessage = buyerMessage;
	}

	/**
	 * @param sellerMessage
	 *            the sellerMessage to set
	 */
	public void setSellerMessage(IMessage sellerMessage) {
		this.sellerMessage = sellerMessage;
	}

}
