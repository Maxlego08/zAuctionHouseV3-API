package fr.maxlego08.zauctionhouse.api.storage;

public interface StorageManager {

	/**
	 * Set ready
	 * 
	 * @param value
	 */
	void setReady(boolean value);

	/**
	 * Set your custom storage
	 * 
	 * @param iStorage
	 */
	void setCustomStorage(IStorage iStorage);
	
	/**
	 * Return storage
	 * 
	 * @return {@link IStorage}
	 */
	IStorage getIStorage();
	
	Storage getStorage();
	
}
