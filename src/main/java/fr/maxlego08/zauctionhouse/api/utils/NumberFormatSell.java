package fr.maxlego08.zauctionhouse.api.utils;

public class NumberFormatSell {

	private final String format;
	private final long multiplicator;

	/**
	 * @param format
	 * @param multiplicator
	 */
	public NumberFormatSell(String format, long multiplicator) {
		super();
		this.format = format;
		this.multiplicator = multiplicator;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @return the multiplicator
	 */
	public long getMultiplicator() {
		return multiplicator;
	}

}
