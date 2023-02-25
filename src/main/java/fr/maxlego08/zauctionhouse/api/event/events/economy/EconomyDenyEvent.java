package fr.maxlego08.zauctionhouse.api.event.events.economy;

import fr.maxlego08.zauctionhouse.api.event.AuctionEvent;

@Deprecated
public class EconomyDenyEvent extends AuctionEvent {

	private String message;

	public EconomyDenyEvent() {
		super();
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
