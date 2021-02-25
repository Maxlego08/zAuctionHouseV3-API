package fr.maxlego08.zauctionhouse.api.filter;

import java.util.Arrays;
import java.util.List;

import org.bukkit.inventory.ItemStack;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.enums.AuctionType;
import fr.maxlego08.zauctionhouse.api.enums.FilterType;

public abstract class Filter {

	private final String key;

	/**
	 * @param key
	 */
	public Filter(String key) {
		super();
		this.key = key;
	}

	/**
	 * Perform filter
	 * 
	 * @param auctionItem
	 * @param string
	 */
	public boolean perform(AuctionItem auctionItem, String string) {
		FilterType filterType = this.findFilterType(string);
		if (filterType == null)
			return false;
		string = this.stripe(filterType, string);
		return this.perform(auctionItem, filterType, string);
	}

	/**
	 * 
	 * @param auctionItem
	 * @param filterType
	 * @param string
	 * @return
	 */
	protected abstract boolean perform(AuctionItem auctionItem, FilterType filterType, String string);

	/**
	 * 
	 * @param auctionItem
	 * @return {@link List}
	 */
	protected List<ItemStack> getItems(AuctionItem auctionItem) {
		if (auctionItem.getType().equals(AuctionType.INVENTORY))
			return auctionItem.getItemStacks();
		return Arrays.asList(auctionItem.getItemStack());
	}

	public String getKey() {
		return key;
	}

	public String stripe(FilterType filterType, String string) {
		return string.substring(this.getKey().length() + filterType.getType().length());
	}

	protected FilterType findFilterType(String string) {
		string = String.valueOf(string.substring(this.getKey().length()));
		for (FilterType filterType : FilterType.values())
			if (string.startsWith(filterType.getType()))
				return filterType;
		return null;
	}

}
