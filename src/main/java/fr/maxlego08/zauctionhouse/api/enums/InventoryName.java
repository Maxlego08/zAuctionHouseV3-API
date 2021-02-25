package fr.maxlego08.zauctionhouse.api.enums;

public enum InventoryName {

	AUCTION("auction"),
	BUY_CONFIRM("buyconfirm"),
	REMOVE_CONFIRM("removeconfirm"),
	EXPIRE("expire"),
	BUYING("buying"),
	ITEMS("items"),
	CATEGORIES("categories"),
	SELL("sell"),
	SELL_SHOW("sellshow"),
	CATEGORY("category"),
	ADMIN_REMOVE("adminremove"),
	
	SEARCH("search"),
	
	;

	private final String name;

	/**
	 * @param name
	 */
	private InventoryName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
