package fr.maxlego08.zauctionhouse.api.enums;

public enum InventoryName {

	AUCTION("auction"), 
	
	BUY_CONFIRM("buyconfirm"),
	
	BUY_CONFIRM_INVENTORY(true, "buyconfirminventory"),
	
	ECONOMY(true, "economy"),
	
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
	
	SHOW("show"),

	;

	private final boolean onlyZMenu;
	private final String name;

	/**
	 * @param name
	 */
	private InventoryName(String name) {
		this.name = name;
		this.onlyZMenu = false;
	}

	/**
	 * @param onlyZMenu
	 * @param name
	 */
	private InventoryName(boolean onlyZMenu, String name) {
		this.onlyZMenu = onlyZMenu;
		this.name = name;
	}

	public boolean isOnlyZMenu() {
		return onlyZMenu;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public static boolean isOnlyZMenu(String name) {
		for (InventoryName inventoryName : InventoryName.values()) {
			if (inventoryName.getName().equals(name)) {
				return inventoryName.isOnlyZMenu();
			}
		}
		return false;
	}

}
