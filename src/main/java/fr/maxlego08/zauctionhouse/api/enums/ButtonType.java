package fr.maxlego08.zauctionhouse.api.enums;

import fr.maxlego08.zauctionhouse.api.exceptions.ButtonTypeException;

public enum ButtonType {

	NONE,

	NONE_SLOT,

	BACK,

	NEXT,

	HOME,

	PREVIOUS,

	INVENTORY,

	PERFORM_COMMAND,

	AUCTION_ITEM,

	BUY_INVENTORY,

	SHOW_ITEM,
	
	REMOVE_ITEM,
	
	BUY_ITEM,
	
	CHANGE_SORT,
	
	CATEGORIES,
	
	REMOVE_ALL,
	
	SELL_INVENTORY_SLOT,
	
	SELL_INVENTORY_ACCEPT,
	
	SELL_INVENTORY_CANCEL,
	
	SELL_INVENTORY_BUY,
	
	CLAIM,

	ADMIN_REMOVE,
	
	SHOW_SLOT,
	
	;

	/**
	 * 
	 * @param string
	 * @param inventoryName
	 * @return
	 * @throws ButtonTypeException
	 */
	public static ButtonType from(String string, String inventoryName, String real) throws ButtonTypeException {
		if (string != null)
			for (ButtonType type : values())
				if (type.name().equalsIgnoreCase(string))
					return type;
		throw new ButtonTypeException("Impossible de trouver le " + string + " pour type dans l'inventaire "
				+ inventoryName + " (" + real + ")");
	}

	public boolean isClickable() {
		return this != NONE;
	}

	public boolean isSlots() {
		return this == NONE_SLOT;
	}

	public boolean isOtherClick() {
		switch (this) {
		case AUCTION_ITEM:
			return true;
		case BACK:
		case HOME:
		case INVENTORY:
		case NEXT:
		case NONE:
		case NONE_SLOT:
		case PERFORM_COMMAND:
		case PREVIOUS:
		case BUY_INVENTORY:
		case SELL_INVENTORY_ACCEPT:
		case SELL_INVENTORY_CANCEL:
		case SELL_INVENTORY_SLOT:
		case SHOW_ITEM:
		default:
			return false;
		}
	}

	public boolean isAuction() {
		switch (this) {
		case AUCTION_ITEM:
			return true;
		case SHOW_ITEM:
		case BACK:
		case HOME:
		case INVENTORY:
		case NEXT:
		case NONE:
		case NONE_SLOT:
		case PERFORM_COMMAND:
		case PREVIOUS:
		case SELL_INVENTORY_ACCEPT:
		case SELL_INVENTORY_CANCEL:
		case SELL_INVENTORY_SLOT:
		default:
			return false;
		}
	}
	
	public boolean isNeedItems() {
		switch (this) {
		case AUCTION_ITEM:
		case SELL_INVENTORY_SLOT:
		case SHOW_ITEM:
		case NEXT:
		case PREVIOUS:
		case SHOW_SLOT:
			return true;
		case SELL_INVENTORY_ACCEPT:
		case SELL_INVENTORY_CANCEL:
		case BACK:
		case HOME:
		case INVENTORY:
		case NONE:
		case NONE_SLOT:
		case PERFORM_COMMAND:
		default:
			return false;
		}
	}

	public boolean isPageChange() {
		switch (this) {
		case AUCTION_ITEM:
		case SELL_INVENTORY_SLOT:
		case SHOW_ITEM:
		case SELL_INVENTORY_ACCEPT:
		case SELL_INVENTORY_CANCEL:
		case BACK:
		case HOME:
		case INVENTORY:
		case NONE:
		case NONE_SLOT:
		case SHOW_SLOT:
		case PERFORM_COMMAND:
		default:
			return false;
		case NEXT:
		case PREVIOUS:
			return true;
		}
	}

	public boolean isPermament() {
		switch (this) {
		case AUCTION_ITEM:
		case BACK:
			return false;
		case ADMIN_REMOVE:
		case BUY_INVENTORY:
		case BUY_ITEM:
		case CATEGORIES:
		case CHANGE_SORT:
		case CLAIM:
		case HOME:
		case INVENTORY:
		case NEXT:
		case NONE:
		case NONE_SLOT:
		case PERFORM_COMMAND:
		case PREVIOUS:
		case REMOVE_ALL:
		case REMOVE_ITEM:
		case SELL_INVENTORY_ACCEPT:
		case SELL_INVENTORY_BUY:
		case SELL_INVENTORY_CANCEL:
		case SELL_INVENTORY_SLOT:
		case SHOW_ITEM:
		case SHOW_SLOT:
		default:
			return true;
		}
	}

}
