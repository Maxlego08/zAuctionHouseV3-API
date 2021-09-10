package fr.maxlego08.zauctionhouse.api.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import fr.maxlego08.zauctionhouse.api.messages.IMessage;
import fr.maxlego08.zauctionhouse.api.utils.ItemBuilder;

public enum Message {

	PREFIX("§8(§bzAuctionHouse§8) "),

	PREFIX_END("§8(§bzAuctionHouse§8)", false),

	INVENTORY_NULL("§cImpossible to find the inventory with the id §6%id%§c.", false),

	INVENTORY_CLONE_NULL("§cThe clone of the inventory is null !", false),

	INVENTORY_OPEN_ERROR("§cAn error occurred with the opening of the inventory §6%id%§c.", false),

	TIME_DAY("%02d day(s) %02d hour(s) %02d minute(s) %02d second(s)"),

	TIME_HOUR("%02d hour(s) %02d minute(s) %02d second(s)"),

	TIME_MINUTE("%02d minute(s) %02d second(s)"),

	TIME_SECOND("%02d second(s)"),

	COMMAND_SYNTAXE_ERROR("§cYou must execute the command like this§7: §2%command%"),

	COMMAND_NO_PERMISSION("§cYou don't have permission !"),

	COMMAND_NO_CONSOLE("§cOnly player can use this command."),

	COMMAND_NO_ARG("§cThis argument does not exist !"),

	COMMAND_SYNTAXE_HELP("§b» §f%syntaxe% §8- §7%description%"),

	COMMAND_HELP_CUSTOM("§6• §e/zah sell <args> §7- §fSell cmd...", "§6• §eAnother cmd"),

	DESCRIPTION_AUCTION("Opens the auction house"),

	DESCRIPTION_SUB_ITEMS("Opens the items inventory"), DESCRIPTION_SUB_CATEGORIES(
			"Opens the categories inventory"), DESCRIPTION_SUB_BUYING(
					"Opens the buying inventory"), DESCRIPTION_SUB_EXPIRE("Opens the expire inventory"),

	DESCRIPTION_BLACKLIST_LIST("See the blacklist players."),

	DESCRIPTION_BLACKLIST_ADD("Ajouter un joueur dans la blacklist"),

	DESCRIPTION_BLACKLIST_REMOVE("Retirer un joueur dans la blacklist"),

	DESCRIPTION_VERSION("Show plugin version"),

	DESCRIPTION_RELOAD("Reload plugin"),

	DESCRIPTION_SELL("Sell an item"),

	DESCRIPTION_SELL_INVENTORY("Sell an inventory"),

	DESCRIPTION_HELP("See the list of commands."),

	DESCRIPTION_CONFIG("Config plugin ingame"),

	DESCRIPTION_CLAIM("Claim your money"),

	DESCRIPTION_SEARCH("Search a item"),

	DESCRIPTION_LANG("See the list of translations."),

	DESCRIPTION_CONVERT("Convert items form another plugin to zauctionhouse"),

	DESCRIPTION_HISTORY("View your history"),

	DESCRIPTION_TRANSACTION("View a player's transactions."),

	COMMAND_RELOAD("§aPlugin successfuly reloaded."),

	COMMAND_SELL_ARGUMENT_PRICE("price"),

	COMMAND_SELL_ARGUMENT_AMOUNT("amount"),

	NO_HOLDING_ITEM("§cAre you stupid ? You can't sell air !"),

	PLUGIN_DISABLE("§cThe auction house is currently deactivated."),

	SELL_COOLDOWN("§cYou must wait §f%time%§c."),

	SELL_MAX_PRICE("§cYou can't put more than §f%max%§c for the price !"),

	SELL_MIN_PRICE("§cYou can't put less than §f%min%§c for the price !"),

	SELL_MESSAGE_DEFAULT(
			"§fYou just put §ax§f%amount% §7%item% §fon sale for §b%price%%currency%§7."), SELL_MESSAGE_INVENTORY(
					"§fYou just put §ax§f%amount% §7items §fon sale for §b%price%%currency%§7."),

	ITEM_PURCHASED("§fYou just purchased §a%item%§f."),

	ITEM_REMOVE_ADMIN("§fYou have just deleted the item §a%item%§f."), ITEM_REMOVE_SELLER_GET(
			"§fAn administrator has just removed §a%item%§f, you can retrieve it from the list of expired items."), ITEM_REMOVE_SELLER_DELETE(
					"§fAn administrator has just removed §a%item%§f, You cannot retrieve your item."),

	BUYER_PURCHASED("§a%buyer% §fjust bought §7%item% §ffor §b%price%%currency%§f."),

	REMOVE_MESSAGE("§7You just removed this item from the sales !"),

	ASCENDING_PRICE("Ascending price"),

	ASCENDING_DATE("Ascending date"),

	DECREASING_DATE("Decreasing date"),

	DECREASING_PRICE("Decreasing price"),

	ITEM_LORE_DEFAULT("§8§m-+------------------------------+-", "§8[§a!§8] §7%status%", "",
			"  §f* §fSeller§7: §b%seller%", "  §f* §fPrice§7: §b%price%", "  §f* §fExpire§7: §b%time%",
			"§8§m-+------------------------------+-"),

	ITEM_LORE_EXPIRE("§8§m-+------------------------------+-", "§8[§a!§8] §7Click to retrieve the item", "",
			"  §f* §fExpire§7: §b%time%", "§8§m-+------------------------------+-"),

	ITEM_LORE_BUYING("§8§m-+------------------------------+-", "§8[§a!§8] §7Click to retrieve the item", "",
			"  §f* §fExpire§7: §b%time%", "§8§m-+------------------------------+-"),

	ITEM_LORE_ITEMS("§8§m-+------------------------------+-", "§8[§a!§8] §7Click to retrieve the item", "",
			"  §f* §fExpire§7: §b%time%", "§8§m-+------------------------------+-"),

	ITEM_LORE_INVENTORY("§8§m-+------------------------------+-", "§8[§a!§8] §7%status%", "",
			"  §7* §fType§7: §bInventory", "  §7* §fSeller§7: §b%seller%", "  §7* §fPrice§7: §b%price%",
			"  §7* §fExpire§7: §b%time%", "", "  §f* §7§oRight click to buy", "  §f* §7§oLeft click to see the content",
			"§8§m-+------------------------------+-"),

	PRICE_FORMAT_ITEM("%price%%currency%"),

	STATUS_PLAYER("Click to retrieve this item"), STATUS_BUYER("Click to buy this item"),

	NO_MONEY_BUTTON(ItemBuilder.buildNoMoney()),

	ERROR_BUY("§cYou can't buy this item"),

	SELL_CREATIVE_ERROR("§cYou can't sell an item in creative mode !"),

	SELL_ITEM_ERROR("§cYou cannot sell this item, it is banned from the plugin."),

	SELL_ITEM_BREAK("§cYou cannot sell a broken item."),

	SELL_WORLD_ERROR("§cYou cannot sell in this world"),

	SELL_ITEM_TAX_DEFAULT("§cYou need §f%tax%%currency% §cto be able to sell this item."),

	SELL_ITEMS_ERROR(
			"§cYou cannot sell more than §f%max% §citems. §8(§7Did you set the §fzauctionhouse.max.<number permission in the configuration file> §7?§8)"),

	BROADCAST_SELL_ANNONCE("§fPlayer §b%player% §fhas added §7%item% §ffor §d%price%§o%currency% §fto the auction!"),

	BROADCAST_BUY_ANNONCE(
			"§fPlayer §b%player% §fhas just bought §7%item% §ffor §d%price%§o%currency% §fto the auction!"),

	NO_ENOUGHT_MONEY("§cYou don't have enough money to buy this !"),

	PLUGIN_NOT_READY("§cThe plugin has not finished to be initialized, please be patient..."),

	WORLD_IS_BANNED("§cYou can't use the auction house here."),

	INVENTORY_FULL("§cYour inventory is full."),

	COMMAND_IS_DISABLE("§cThe command is disabled."),

	BLACKLIST_INFORMATION("§cYou are blacklisted, you cannot use the auction house."),

	BLACKLIST_LIST("§7List of blacklis playerst§8: §f%players%"),

	BLACKLIST_EMPTY("§cNo blacklist players"),

	BLACKLIST_ADD("§7You have just added the player §f%player% §7 to the blacklist."),

	BLACKLIST_REMOVE("§7You come to remove the player §f%player% §7 from the blacklist."),

	TRANSACTION_EMPTY_PURCHASE("§cYou have not made any purchase transactions."),

	TRANSACTION_EMPTY_SALE("§cYou have not made any sales transactions."),

	TRANSACTION_EMPTY_BOTH("§cYou have not made any transactions."),

	TRANSACTION_MESSAGE_LIST("§8(§bzAuctionHouse§8) §fTransactions §7%type% §8(§a%page%§8/§a%maxPage%§8)", "%content%",
			"§8(§b?§8) §7§oDo §f§o/ah history %nextPage% %type% §7§oto go to the next page."),

	TRANSACTION_MESSAGE_SHOW(
			"§8(§bzAuctionHouse§8) §fTransactions §7%type% §fof §b%player% §8(§a%page%§8/§a%maxPage%§8)", "%content%",
			"§8(§b?§8) §7§oDo §f§o/ah transaction %player% %nextPage% %type% §7§oto go to the next page."),

	TRANSACTION_MESSAGE_CONTENT_SALE(
			"§f%seller% have sold x§a%amount% §o%item% §fto the player §b%buyer% for §7%price%%currency% §8(§7%date%§8)"),

	TRANSACTION_MESSAGE_CONTENT_PURCHASE(
			"§f%buyer% have purchased x§a%amount% §o%item% §fto the player §b%seller% for §7%price%%currency% §8(§7%date%§8)"),

	TRANSACTION_MESSAGE_CONTENT_YOU("You"),

	CONNECT_CLAIM("§aYou have money to recover, make §b/ah claim §ato recover for your money."), CONNECT_TRANSACTIONS(
			"§aYou sold %item% during your absence."),

	ITEM_ECONOMY_FULL("§7You have a full inventory, your items are gone in the inventory of expired items."),

	CLAIM_MONEY_ERROR("§cYou have no pending transactions."), CLAIM_MONEY_SUCCESS(
			"§aYou just got your money back on hold."),

	SELL_INVENTORY_ERROR("§cYou did not put any item, sale canceled."),

	SELL_INVENTORY_ITEM(new ItemBuilder(Material.CHEST, "§7Sale of inventory").build()),

	COOLDOWN_MESSAGE(MessageType.ACTION, " §cYou must wait §f%cooldown% §cbefore you can do this action."),

	;

	private List<String> messages;
	private String message;
	private Map<String, Object> titles = new HashMap<>();
	private boolean use = true;
	private MessageType type = MessageType.TCHAT;

	private ItemStack itemStack;

	/**
	 * 
	 * @param message
	 */
	private Message(String message) {
		this.message = message;
		this.use = true;
	}

	/**
	 * 
	 * @param message
	 */
	private Message(MessageType type, String message) {
		this.message = message;
		this.use = true;
		this.type = type;
	}

	/**
	 * @param itemStack
	 */
	private Message(ItemStack itemStack) {
		this.itemStack = itemStack;
		this.type = MessageType.ITEMSTACK;
	}

	private Message(String title, String subTitle, int a, int b, int c) {
		this.use = true;
		this.titles.put("title", title);
		this.titles.put("subtitle", subTitle);
		this.titles.put("start", a);
		this.titles.put("time", b);
		this.titles.put("end", c);
		this.titles.put("isUse", true);
		this.type = MessageType.TITLE;
	}

	/**
	 * 
	 * @param message
	 */
	private Message(String... message) {
		this.messages = Arrays.asList(message);
		this.use = true;
	}

	/**
	 * 
	 * @param message
	 * @param use
	 */
	private Message(String message, boolean use) {
		this.message = message;
		this.use = use;
	}

	public String getMessage() {
		return message;
	}

	public String toMsg() {
		return message;
	}

	public String msg() {
		return message;
	}

	public boolean isUse() {
		return use;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getMessages() {
		return messages == null ? Arrays.asList(message) : messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public boolean isMessage() {
		return messages != null && messages.size() > 1;
	}

	public String getTitle() {
		return (String) titles.getOrDefault("title", null);
	}

	public Map<String, Object> getTitles() {
		return titles;
	}

	public void setTitles(Map<String, Object> titles) {
		this.titles = titles;
	}

	public String getSubTitle() {
		return (String) titles.getOrDefault("subtitle", null);
	}

	public boolean isTitle() {
		return titles.containsKey("title");
	}

	public int getStart() {
		return ((Number) titles.getOrDefault("start", 0)).intValue();
	}

	public int getEnd() {
		return ((Number) titles.getOrDefault("end", 0)).intValue();
	}

	public int getTime() {
		return ((Number) titles.getOrDefault("time", 0)).intValue();
	}

	public boolean isUseTitle() {
		return (boolean) titles.getOrDefault("isUse", "true");
	}

	public String replace(String a, String b) {
		return message.replace(a, b);
	}

	public MessageType getType() {
		return type;
	}

	public ItemStack getItemStack() {
		return itemStack;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public void setItemStack(ItemStack itemStack) {
		this.itemStack = itemStack;
	}

	public static Message form(String replace) {
		for (Message message : Message.values())
			if (message.name().equalsIgnoreCase(replace))
				return message;
		return null;
	}

	public IMessage getIMessage() {
		return null;
	}

}
