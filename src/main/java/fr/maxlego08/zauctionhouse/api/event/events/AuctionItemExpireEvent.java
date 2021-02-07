package fr.maxlego08.zauctionhouse.api.event.events;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.enums.StorageType;
import fr.maxlego08.zauctionhouse.api.event.CancelledAuctionEvent;

public class AuctionItemExpireEvent extends CancelledAuctionEvent {

	private long expireAt;
	private final long currentMilliSecond;
	private final AuctionItem item;
	private final StorageType type;

	public AuctionItemExpireEvent(long expireAt, long currentMilliSecond, AuctionItem item, StorageType type) {
		super();
		this.expireAt = expireAt;
		this.currentMilliSecond = currentMilliSecond;
		this.item = item;
		this.type = type;
	}

	/**
	 * @return the expireAt
	 */
	public long getExpireAt() {
		return expireAt;
	}

	/**
	 * @param expireAt
	 *            the expireAt to set
	 */
	public void setExpireAt(long expireAt) {
		this.expireAt = expireAt;
	}

	/**
	 * @return the currentMilliSecond
	 */
	public long getCurrentMilliSecond() {
		return currentMilliSecond;
	}

	/**
	 * @return the item
	 */
	public AuctionItem getItem() {
		return item;
	}

	/**
	 * @return the type
	 */
	public StorageType getType() {
		return type;
	}

}
