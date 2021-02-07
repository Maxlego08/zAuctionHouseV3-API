package fr.maxlego08.zauctionhouse.api.button.buttons;

import fr.maxlego08.zauctionhouse.api.inventory.Inventory;

public interface InventoryButton extends PermissibleButton{

	/**
	 * 
	 * @return {@link Inventory}
	 */
	public Inventory getInventory();
	
}
