package fr.maxlego08.zauctionhouse.api.economy;

public interface EconomyLimit {

	/**
	 * Gets the name of the economy to which this limit applies.
	 *
	 * @return the name of the economy as a string.
	 */
	String getEconomyName();

	/**
	 * Gets the maximum limit for the economy.
	 *
	 * @return the maximum limit as a long.
	 */
	long getMax();

	/**
	 * Gets the minimum limit for the economy.
	 *
	 * @return the minimum limit as a long.
	 */
	long getMin();
}

