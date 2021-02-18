package fr.maxlego08.zauctionhouse.api.category;

import java.util.List;

import org.bukkit.Material;

public interface Category {

	/**
	 * Returns the string that will be displayed in the inventory
	 * @return string
	 */
	String getDisplayName();
	
	/**
	 * Returns the category name, serves as a key
	 * @return string
	 */
	String getName();

	/**
	 * Returns the list of materials
	 * @return materials
	 */
	List<Material> getMaterials();

	/**
	 * Returns true if it is the category miscellaneous
	 * @return boolean
	 */
	boolean isMiscellaneaous();
	
}
