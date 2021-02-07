package fr.maxlego08.zauctionhouse.api.enums;

public enum EnumInventory {

	INVENTORY_DEFAULT(1), 
	INVENTORY_CONFIG(2), 
	
	
	INVENTORY_SELL(3),
	
	;
	
	private final int id;

	private EnumInventory(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
