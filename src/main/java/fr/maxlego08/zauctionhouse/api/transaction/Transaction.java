package fr.maxlego08.zauctionhouse.api.transaction;

import java.util.UUID;

import fr.maxlego08.zauctionhouse.api.enums.Economy;

public interface Transaction {

	/**
	 * 
	 * @return seller uuid
	 */
	public UUID getSeller();

	/**
	 * 
	 * @return buyer uuid
	 */
	public UUID getBuyer();

	/**
	 * 
	 * @return date
	 */
	public long getDate();

	/**
	 * 
	 * @return itemstack as string
	 */
	public String getItemStack();

	/**
	 * 
	 * @return price
	 */
	public long getPrice();

	/**
	 * 
	 * @return economy
	 */
	public Economy getEconomy();

	/**
	 * 
	 * @return
	 */
	public boolean isRead();

	/**
	 * 
	 * @param b
	 */
	public void read();

	/**
	 * 
	 * @return
	 */
	public boolean needMoney();

	/**
	 * 
	 * @param b
	 */
	public void setNeedMoney(boolean b);
	
	/**
	 * 
	 * @return
	 */
	public int getID();
	
	/**
	 * 
	 * @param id
	 */
	public void setID(int id);

}
