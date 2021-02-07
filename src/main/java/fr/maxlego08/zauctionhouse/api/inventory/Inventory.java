package fr.maxlego08.zauctionhouse.api.inventory;

import java.util.List;

import org.bukkit.entity.Player;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.button.Button;
import fr.maxlego08.zauctionhouse.api.button.buttons.PlaceholderButton;
import fr.maxlego08.zauctionhouse.api.enums.InventoryType;

public interface Inventory {

	/**
	 * 
	 * @return inventory size
	 */
	public int size();
	
	/**
	 * 
	 * @return
	 */
	public InventoryType getType();
	
	
	/**
	 * 
	 * @return inventory name
	 */
	public String getName();
	
	/**
	 * 
	 * @param replace
	 * @param newChar
	 * @return inventory name
	 */
	public String getName(String replace, String newChar);
	
	/**
	 * 
	 * @param button type
	 * @return buttons list
	 */
	public <T extends Button> List<T> getButtons(Class<T> type);
	
	/**
	 * 
	 * @return buttons list
	 */
	public List<Button> getButtons();
	
	/**
	 * 
	 * @param player
	 */
	public void open(Player player);

	/**
	 * 
	 * @param page
	 * @return
	 */
	public List<PlaceholderButton> sortButtons(int page);
	
	/**
	 * 
	 * @return int
	 */
	public int getMaxPage();
	
	public int getMaxPage(List<AuctionItem> items);
	
	/**
	 * 
	 * @return
	 */
	public String getFileName();

	/**
	 * 
	 * @return
	 */
	public int getAuctionPageSize();

	
}
