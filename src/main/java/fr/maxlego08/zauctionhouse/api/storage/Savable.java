package fr.maxlego08.zauctionhouse.api.storage;

import fr.maxlego08.zauctionhouse.api.utils.Persist;

public interface Savable {
	
	/**
	 * 
	 * @param persist
	 */
	void save(Persist persist);
	
	/**
	 * 
	 * @param persist
	 */
	void load(Persist persist);
}
