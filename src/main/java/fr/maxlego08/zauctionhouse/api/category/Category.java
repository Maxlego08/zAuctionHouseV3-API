package fr.maxlego08.zauctionhouse.api.category;

import java.util.List;

import org.bukkit.Material;

public interface Category {

	String getName();

	List<Material> getMaterials();

	boolean isMiscellaneaous();
	
}
