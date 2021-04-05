package fr.maxlego08.zauctionhouse.api.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MaterialData {

	private final Material material;
	private int data;

	/**
	 * @param material
	 * @param data
	 */
	public MaterialData(Material material, int data) {
		super();
		this.material = material;
		this.data = data;
	}

	public MaterialData(String string) {
		if (string.contains(";")) {
			String[] splid = string.split(";");
			this.material = Material.valueOf(splid[0].toUpperCase());
			try {
				this.data = Integer.valueOf(splid[1]);
			} catch (Exception e) {
				this.data = 0;
			}
		} else {
			this.material = Material.valueOf(string.toUpperCase());
			this.data = 0;
		}
	}

	/**
	 * @return the material
	 */
	public Material getMaterial() {
		return material;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	public String name() {
		if (data == 0)
			return material.name();
		return material.name() + ";" + data;
	}

	@SuppressWarnings("deprecation")
	public boolean same(ItemStack itemStack) {
//		if (ItemDecoder.isNewVersion())
//			return itemStack.getType().equals(this.material);
//		else
			return itemStack.getType().equals(this.material) && this.data == itemStack.getData().getData();
	}

}
