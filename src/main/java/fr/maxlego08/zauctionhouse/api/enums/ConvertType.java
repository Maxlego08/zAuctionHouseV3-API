package fr.maxlego08.zauctionhouse.api.enums;

public enum ConvertType {

	ZAUCTIONHOUSEV2("https://groupez.xyz/resources/zauctionhouse.1"),

	CRAZYAUCTION("https://www.spigotmc.org/resources/crazy-auctions.25219/"),
	
	AUCTIONHOUSEDB("https://www.spigotmc.org/resources/auctionhouse.61836/"),
	
	AUCTIONHOUSERETRO("https://www.spigotmc.org/resources/auctionhouse-retro.69278/"),
	
	DATABASETOJSON("https://groupez.xyz/resources/zauctionhouse.1"),
	
	JSONTODATABASE("https://groupez.xyz/resources/zauctionhouse.1"),

	;

	private final String pluginLink;

	/**
	 * @param pluginLink
	 */
	private ConvertType(String pluginLink) {
		this.pluginLink = pluginLink;
	}

	/**
	 * @return the pluginLink
	 */
	public String getPluginLink() {
		return pluginLink;
	}

}
