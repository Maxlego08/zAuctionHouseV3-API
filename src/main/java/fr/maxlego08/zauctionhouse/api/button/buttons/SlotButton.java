package fr.maxlego08.zauctionhouse.api.button.buttons;

import java.util.List;

public interface SlotButton extends PermissibleButton {

	/**
	 * 
	 * @return
	 */
	public List<Integer> getSlots();
	
}
