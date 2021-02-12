package fr.maxlego08.zauctionhouse.api.enums;

public enum Permission {

	ZAUCTIONHOUSE_USE, ZAUCTIONHOUSE_HELP, ZAUCTIONHOUSE_HISTORY, ZAUCTIONHOUSE_TRANSACTION,

	ZAUCTIONHOUSE_BLACKLIST_ADD, ZAUCTIONHOUSE_BLACKLIST, ZAUCTIONHOUSE_BLACKLIST_REMOVE,

	ZAUCTIONHOUSE_RELOAD,
	
	ZAUCTIONHOUSE_SELL, 
	ZAUCTIONHOUSE_SELL_INVENTORY,
	
	ZAUCTIONHOUSE_ADMIN_REMOVE, ZAUCTIONHOUSE_CONFIG, ZAUCTIONHOUSE_CLAIM, ZAUCTIONHOUSE_CONVERT,

	;

	private String permission;

	private Permission() {
		this.permission = this.name().toLowerCase().replace("_", ".");
	}

	public String getPermission() {
		return permission;
	}

}
