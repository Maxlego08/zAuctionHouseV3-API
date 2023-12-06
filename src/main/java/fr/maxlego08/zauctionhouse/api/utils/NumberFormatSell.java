package fr.maxlego08.zauctionhouse.api.utils;

import java.util.Map;

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
	 * @param format
	 * @param multiplicator
	 */
	public NumberFormatSell(Map<String, Object> map) {
		this((String) map.get("format"), ((Number) map.get("multiplication")).longValue());
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
