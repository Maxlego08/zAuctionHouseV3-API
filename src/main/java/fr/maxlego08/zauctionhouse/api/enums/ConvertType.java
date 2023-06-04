package fr.maxlego08.zauctionhouse.api.enums;

public enum ConvertType {

	ZAUCTIONHOUSEV2("https://groupez.dev/resources/1"),

	CRAZYAUCTION("https://www.spigotmc.org/resources/25219/"),
	
	AUCTIONHOUSEDB("https://www.spigotmc.org/resources/61836/"),
	
	AUCTIONHOUSERETRO("https://www.spigotmc.org/resources/69278/"),
	
	DATABASETOJSON("https://groupez.dev/resources/1"),
	
	JSONTODATABASE("https://groupez.dev/resources/1"),

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
