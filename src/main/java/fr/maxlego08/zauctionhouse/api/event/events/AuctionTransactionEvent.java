package fr.maxlego08.zauctionhouse.api.event.events;

import fr.maxlego08.zauctionhouse.api.event.CancelledAuctionEvent;
import fr.maxlego08.zauctionhouse.api.transaction.Transaction;

public class AuctionTransactionEvent extends CancelledAuctionEvent {

	private final Transaction transaction;

	/**
	 * @param transaction
	 */
	public AuctionTransactionEvent(Transaction transaction) {
		super();
		this.transaction = transaction;
	}

	/**
	 * @return the transaction
	 */
	public Transaction getTransaction() {
		return transaction;
	}

}
