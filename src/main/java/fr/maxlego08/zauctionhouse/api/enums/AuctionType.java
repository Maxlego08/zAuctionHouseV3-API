package fr.maxlego08.zauctionhouse.api.enums;

public enum AuctionType {

	DEFAULT, BID, INVENTORY,

	;

	public boolean removeItemInHand() {
		switch (this) {
		case INVENTORY:
			return false;
		case BID:
		case DEFAULT:
		default:
			return true;
		}
	}

	public Message getSellMessage() {
		switch (this) {
		case INVENTORY:
			return Message.SELL_MESSAGE_INVENTORY;
		case BID:
		case DEFAULT:
		default:
			return Message.SELL_MESSAGE_DEFAULT;
		}
	}

	public Message getInventoryMessage(InventoryType inventoryType) {

		switch (inventoryType) {
		case BUYING:
			return Message.ITEM_LORE_BUYING;
		case EXPIRE:
			return Message.ITEM_LORE_EXPIRE;
		case ITEMS:
			return Message.ITEM_LORE_ITEMS;
		default:
			switch (this) {
			case INVENTORY:
				return Message.ITEM_LORE_INVENTORY;
			case BID:
			case DEFAULT:
			default:
				return Message.ITEM_LORE_DEFAULT;
			}
		}
	}

}
