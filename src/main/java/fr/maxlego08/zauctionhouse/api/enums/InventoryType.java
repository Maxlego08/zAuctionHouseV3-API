package fr.maxlego08.zauctionhouse.api.enums;

public enum InventoryType {

	DEFAULT,

	AUCTION,

	EXPIRE,

	BUYING,

	BUY_CONFIRM,

	REMOVE_CONFIRM,

	ITEMS,

	CATEGORIES,

	CATEGORY,

	SELL,

	SELL_SHOW,

	ADMIN_REMOVE,

	;

	/**
	 * 
	 * @param string
	 * @return
	 */
	public static InventoryType form(String string) {
		if (string == null)
			return DEFAULT;
		try {
			InventoryType type = valueOf(string.toUpperCase());
			return type == null ? DEFAULT : type;
		} catch (Exception e) {
			return DEFAULT;
		}
	}

	public boolean isRemoveAsAdmin() {
		return this == InventoryType.ADMIN_REMOVE;
	}

	public boolean isDefault() {
		return true;
	}

	public boolean isConfirm() {
		return this == InventoryType.BUY_CONFIRM || this == InventoryType.REMOVE_CONFIRM;
	}

	public boolean needToReset() {
		return this == InventoryType.BUY_CONFIRM || this == InventoryType.REMOVE_CONFIRM
				|| this == InventoryType.SELL_SHOW || this == InventoryType.ADMIN_REMOVE;
	}

	public boolean isBuyConfirm() {
		return this == InventoryType.BUY_CONFIRM;
	}

	public boolean isRemove() {
		return this == InventoryType.ADMIN_REMOVE || this == InventoryType.REMOVE_CONFIRM;
	}

	public boolean isPagination() {
		return this == AUCTION || this == EXPIRE || this == BUYING || this == CATEGORY || this == ITEMS;
	}

	public boolean isBuy() {
		return this == BUYING;
	}

	public boolean isAutoRun() {
		return this == AUCTION || this == CATEGORY;
	}

}
