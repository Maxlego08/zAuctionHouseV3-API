package fr.maxlego08.zauctionhouse.api.utils;

import fr.maxlego08.zauctionhouse.api.AuctionItem;

import java.util.List;

public class CacheAuctionItem {

	private final List<AuctionItem> auctionItems;
	private long expiredAt;

	public CacheAuctionItem(List<AuctionItem> auctionItems, long seconds) {
		super();
		this.auctionItems = auctionItems;
		this.expiredAt = System.currentTimeMillis() + (1000 * seconds);
	}

	/**
	 * @return the auctionItems
	 */
	public List<AuctionItem> getAuctionItems() {
		return auctionItems;
	}

	/**
	 * @return the expiredAt
	 */
	public long getExpiredAt() {
		return expiredAt;
	}

	public boolean isValid() {
		return this.expiredAt > System.currentTimeMillis();
	}

	public void invalid() {
		this.expiredAt = 0;		
	}

}