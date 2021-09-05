package fr.maxlego08.zauctionhouse.api.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.maxlego08.zauctionhouse.api.enums.CategoryType;
import fr.maxlego08.zauctionhouse.zcore.utils.ZUtils;

public class MaterialData extends ZUtils {

	private final String name;
	private final Material material;
	private final CategoryType type;
	private int data;

	/**
	 * @param material
	 * @param data
	 */
	public MaterialData(Material material, int data) {
		super();
		this.material = material;
		this.data = data;
		this.name = null;
		this.type = null;
	}

	public MaterialData(String string) {
		if (string.startsWith("name")) {
			this.type = CategoryType.NAME;
			this.name = color(string.substring(5));
			this.material = null;
		} else if (string.startsWith("lore")) {
			this.type = CategoryType.LORE;
			this.name = color(string.substring(5));
			this.material = null;

		} else if (string.startsWith("material")) {

			this.type = CategoryType.MATERIAL;
			String currentName = string.substring(9);
			String[] splid = currentName.split(";");
			this.name = color(splid[0]);
			this.material = Material.valueOf(splid[1].toUpperCase());
			try {
				this.data = Integer.valueOf(splid[2]);
			} catch (Exception e) {
				this.data = 0;
			}

		} else if (string.contains(";")) {

			this.name = null;
			this.type = null;

			String[] splid = string.split(";");
			String material = splid[0].toUpperCase();
			this.material = Material.valueOf(material);
			try {
				this.data = Integer.valueOf(splid[1]);
			} catch (Exception e) {
				this.data = 0;
			}
		} else {
			this.material = Material.valueOf(string.toUpperCase());
			this.data = 0;
			this.name = null;
			this.type = null;
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
		if (this.type != null) {

			ItemMeta itemMeta = itemStack.getItemMeta();
			switch (this.type) {
			case LORE:
				if (itemMeta.hasLore())
					return itemMeta.getLore().stream().anyMatch(e -> e.contains(this.name));
				break;
			case NAME:
				if (itemMeta.hasDisplayName())
					return itemMeta.getDisplayName().contains(this.name);
				break;
			case MATERIAL: {

				if (fr.maxlego08.zauctionhouse.zcore.utils.itemstack.NMSUtils.isNewVersion()
						&& itemStack.getType().equals(this.material)) {
					if (itemMeta.hasDisplayName()) {
						return false;
					}
					if (itemMeta.hasLore()) {
						return false;
					}
					return true;

				} else if (itemStack.getType().equals(this.material) && this.data == itemStack.getData().getData()) {
					if (itemMeta.hasDisplayName()) {
						return false;
					}
					if (itemMeta.hasLore()) {
						return false;
					}
					return true;
				}
			}
			default:
				break;
			}
			return false;

		} else if (fr.maxlego08.zauctionhouse.zcore.utils.itemstack.NMSUtils.isNewVersion())
			return itemStack.getType().equals(this.material);
		else
			return itemStack.getType().equals(this.material) && this.data == itemStack.getData().getData();
	}

}
