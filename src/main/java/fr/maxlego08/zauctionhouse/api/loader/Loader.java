package fr.maxlego08.zauctionhouse.api.loader;

import org.bukkit.configuration.file.YamlConfiguration;

public interface Loader<T> {

	/**
	 * Load object from yml
	 * @param configuration
	 * @param path
	 * @return
	 */
	T load(YamlConfiguration configuration, String name, Object... args) throws Exception;
	
	/**
	 * Save object to yml
	 * @param object
	 * @param configuration
	 * @param path
	 */
	void save(T object, YamlConfiguration configuration, String path);
	
}
