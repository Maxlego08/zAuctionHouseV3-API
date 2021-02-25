package fr.maxlego08.zauctionhouse.api.filter;

import java.util.Optional;

import fr.maxlego08.zauctionhouse.api.enums.FilterType;

public interface FilterManager {

	/**
	 * 
	 * @param key
	 * @return {@link Optional}
	 */
	public Optional<Filter> getFiltre(String key);
	
	/**
	 * 
	 * @param string
	 * @return {@link Optional}
	 */
	public Optional<Filter> find(String string);

	/**
	 * Register filter
	 * 
	 * @param key
	 * @param filter
	 */
	public void registerFilter(Filter filter);

	/**
	 * 
	 * @param filter
	 * @param filterType
	 * @param string
	 * @return {@link String}
	 */
	public String stripeString(Filter filter, FilterType filterType, String string);
	
}
