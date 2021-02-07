package fr.maxlego08.zauctionhouse.api.enums;

public enum Permission {

	ZAUCTIOHOUSE_USE, ZAUCTIOHOUSE_HELP, ZAUCTIOHOUSE_HISTORY, ZAUCTIOHOUSE_TRANSACTION,

	ZAUCTIOHOUSE_BLACKLIST_ADD, ZAUCTIOHOUSE_BLACKLIST, ZAUCTIOHOUSE_BLACKLIST_REMOVE,

	ZAUCTIOHOUSE_RELOAD,
	
	ZAUCTIOHOUSE_SELL, 
	ZAUCTIOHOUSE_SELL_INVENTORY,
	
	ZAUCTIOHOUSE_ADMIN_REMOVE, ZAUCTIOHOUSE_CONFIG, ZAUCTIOHOUSE_CLAIM, ZAUCTIOHOUSE_CONVERT,

	;

	private String permission;

	private Permission() {
		this.permission = this.name().toLowerCase().replace("_", ".");
	}

	public String getPermission() {
		return permission;
	}

}
