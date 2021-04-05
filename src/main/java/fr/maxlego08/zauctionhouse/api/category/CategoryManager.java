package fr.maxlego08.zauctionhouse.api.category;

import java.util.List;
import java.util.Optional;

import org.bukkit.inventory.ItemStack;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.storage.Saveable;

public interface CategoryManager extends Saveable {

	/**
	 * 
	 * @param name
	 * @return
	 */
	public Optional<Category> getByName(String name);

	/**
	 * 
	 * @param material
	 * @return
	 */
	public Optional<Category> getByMaterial(ItemStack itemStack);

	/**
	 * 
	 * @param auctionItems
	 * @return
	 */
	public List<AuctionItem> getMiscellaneaous(List<AuctionItem> auctionItems);

}
