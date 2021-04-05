package fr.maxlego08.zauctionhouse.api.enums;

public enum Transalation {

	FR("Français", "https://groupez.xyz/resources/22")
	
	;

	private final String langue;
	private final String link;

	/**
	 * @param langue
	 * @param link
	 */
	private Transalation(String langue, String link) {
		this.langue = langue;
		this.link = link;
	}

	/**
	 * @return the langue
	 */
	public String getLangue() {
		return langue;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

}
