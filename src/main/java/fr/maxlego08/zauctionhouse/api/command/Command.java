package fr.maxlego08.zauctionhouse.api.command;

import java.util.List;

import fr.maxlego08.zauctionhouse.api.inventory.Inventory;

public interface Command {

	/**
	 * 
	 * @return
	 */
	public String getCommand();
	
	/**
	 * 
	 * @return
	 */
	public String getPermission();
	
	/**
	 * 
	 * @return
	 */
	public String getDescription();
	
	/**
	 * 
	 * @return
	 */
	public List<String> getAliases();
	
	/**
	 * 
	 * @return
	 */
	public Inventory getInventory();
	
	
}
