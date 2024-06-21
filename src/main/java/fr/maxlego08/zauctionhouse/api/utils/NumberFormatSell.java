package fr.maxlego08.zauctionhouse.api.utils;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFormatSell {

	private final String format;
	private final long multiplicator;
	private final Pattern pattern = Pattern.compile("^([\\d,.]+)(.*)$");

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

	public boolean match(String input) {

		Matcher matcher = this.pattern.matcher(input);

		if (matcher.find()) {
			String valeur = matcher.group(2);
			return valeur.toLowerCase().startsWith(this.getFormat().toLowerCase());
		}

		return false;
	}

	public String replace(String input) {

		Matcher matcher = this.pattern.matcher(input);

		if (matcher.find()) {
			String nombre = matcher.group(1); 
			String valeur = matcher.group(2); 		

			valeur = valeur.toLowerCase().replaceFirst(this.getFormat().toLowerCase(), "");
			return nombre + valeur;
		}

		return input;

	}

}
