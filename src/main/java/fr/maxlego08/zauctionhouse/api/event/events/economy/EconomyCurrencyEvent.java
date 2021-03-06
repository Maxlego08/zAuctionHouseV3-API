package fr.maxlego08.zauctionhouse.api.event.events.economy;

import fr.maxlego08.zauctionhouse.api.event.AuctionEvent;

public class EconomyCurrencyEvent extends AuctionEvent {

	private String currency = "$";

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
