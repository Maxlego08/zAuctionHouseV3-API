package fr.maxlego08.zauctionhouse.api.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import fr.maxlego08.zauctionhouse.api.messages.IMessage;
import fr.maxlego08.zauctionhouse.api.utils.ItemBuilder;

public enum Message {

	PREFIX("§8(§bzAuctionHouse§8) ", "#92bed8zAuctionHouse #666666• "),

	PREFIX_END("§8(§bzAuctionHouse§8)", false),

	INVENTORY_NULL("§cImpossible to find the inventory with the id §6%id%§c.", false),

	INVENTORY_CLONE_NULL("§cThe clone of the inventory is null !", false),

	INVENTORY_OPEN_ERROR("§cAn error occurred with the opening of the inventory §6%id%§c.", false),

	TIME_DAY("%02dd %02dh %02dm", "%02dᴅ %02dʜ %02dᴍ"),

	TIME_HOUR("%02dh %02dm %02ds", "%02dʜ %02dᴍ %02ds"),

	TIME_MINUTE("%02dᴍ %02ds"),

	TIME_SECOND("%02ds"),


	FORMAT_SECOND("second"),
	FORMAT_SECONDS("seconds"),

	FORMAT_MINUTE("minute"),
	FORMAT_MINUTES("minutes"),

	FORMAT_HOUR("hour"),
	FORMAT_HOURS("hours"),

	FORMAT_DAY("d"),
	FORMAT_DAYS("days"),

	COMMAND_SYNTAXE_ERROR("§cYou must execute the command like this§7: §2%command%"),

	COMMAND_NO_PERMISSION("§cYou don't have permission !"),

	COMMAND_NO_CONSOLE("§cOnly player can use this command."),

	COMMAND_COOLDOWN("§cYou must wait a few seconds between each command."),

	COMMAND_NO_ARG("§cThis argument does not exist !"),

	COMMAND_SYNTAXE_HELP("§b» §f%syntaxe% §8- §7%description%"),

	COMMAND_HELP_CUSTOM("§6» §e/zah sell <args> §7- §fSell cmd...", "§6» §eAnother cmd"),

	DESCRIPTION_AUCTION("Opens the auction house"),

	DESCRIPTION_SUB_ITEMS("Opens the items inventory"),

	DESCRIPTION_SUB_CATEGORIES("Opens the categories inventory"),

	DESCRIPTION_SUB_BUYING("Opens the buying inventory"),

	DESCRIPTION_SUB_EXPIRE("Opens the expire inventory"),

	DESCRIPTION_BLACKLIST_LIST("See the blacklist players."),

	DESCRIPTION_BLACKLIST_ADD("Add a player to the blacklist"),

	DESCRIPTION_BLACKLIST_REMOVE("Remove a player from the blacklist"),

	DESCRIPTION_VERSION("Show plugin version"), DESCRIPTION_OPEN("Open auction to a player"),

	DESCRIPTION_PURGE("Remove old transaction"),

	DESCRIPTION_RELOAD("Reload plugin"),

	DESCRIPTION_SELL("Sell an item"),

	DESCRIPTION_SELL_INVENTORY("Sell an inventory"),

	DESCRIPTION_HELP("See the list of commands."),

	DESCRIPTION_CONFIG("Config plugin ingame"),

	DESCRIPTION_CLAIM("Claim your money"),
	DESCRIPTION_GIVE("Give economy item"),

	DESCRIPTION_ADDON("Show addon list"),

	DESCRIPTION_SEARCH("Search a item"),

	DESCRIPTION_LANG("See the list of translations."),

	DESCRIPTION_CONVERT("Convert items form another plugin to zauctionhouse"),

	DESCRIPTION_HISTORY("View your history"),

	DESCRIPTION_TRANSACTION("View a player's transactions."),
	DESCRIPTION_PRICE("Display item average price"),

	COMMAND_RELOAD("§aPlugin successfuly reloaded."),

	COMMAND_SELL_ARGUMENT_PRICE("price"),

	COMMAND_SELL_ARGUMENT_AMOUNT("amount"),

	COMMAND_SELL_CUSTOM_HELPING("§cYou must execute the command like this§7: §f/hdv vendre §a<price> §b[<amount>]"),
	
	COMMAND_SEARCH_CUSTOM_HELPING("§cYou must execute the command like this§7: §f/hdv search §a<word>"),

	COMMAND_OPEN_CUSTOM_HELPING("§cYou must execute the command like this§7: §f/ah"),

	NO_HOLDING_ITEM("§cAre you stupid ? You can't sell air !"),

	PLAYER_LAG_PING(
			"§cYou cannot sell items at this time. (its disableSaleIfPlayerIsLagging in config.json)"), PLAYER_LAG_TPS(
					"§cYou cannot sell items at this time. (its disableSaleIfServerIsLagging in config.json)"),

	PLUGIN_DISABLE("§cThe auction house is currently deactivated."),

	SELL_COOLDOWN("§cYou must wait §f%time%§c."),

	SELL_MAX_PRICE("§cYou can't put more than §f%max%§c for the price !"), 
	SELL_MIN_PRICE("§cYou can't put less than §f%min%§c for the price !"),

	SELL_MESSAGE_DEFAULT("§fYou just put §ax§f%amount% §7%item% §fon sale for §b%price%§7.",
			"#e6fff3You just put #8ee6e3x%amount% &7%item% #e6fff3on sale for #ffacd5%price%&f."),

	SELL_MESSAGE_INVENTORY("§fYou just put §ax§f%amount% §7items §fon sale for §b%price%§7.",
			"#e6fff3You just put #8ee6e3%amount% &7items #e6fff3on sale for #ffacd5%price%&f."),

	ITEM_PURCHASED("§fYou just purchased §a%item%§f."),

	ITEM_REMOVE_ADMIN("§fYou have just deleted the item §a%item%§f."),

	ITEM_REMOVE_SELLER_GET(
			"§fAn administrator has just removed §a%item%§f, you can retrieve it from the list of expired items."),

	ITEM_REMOVE_SELLER_DELETE("§fAn administrator has just removed §a%item%§f, You cannot retrieve your item."),

	BUYER_PURCHASED("§a%buyer% §fjust bought §7%item% §ffor §b%price%§f.", "#ffacd5%buyer% #e6fff3just bought &7%item% #e6fff3for #92bed8%price%#e6fff3."),

	REMOVE_MESSAGE("§7You just removed this item from the sales !",
			"#e6fff3You just removed #8ee6e3x%amount% &7%item% #e6fff3from the sales."),

	ASCENDING_PRICE("Ascending price", "ᴀsᴄᴇɴᴅɪɴɢ ᴘʀɪᴄᴇ"),

	ASCENDING_DATE("Ascending date", "ᴀsᴄᴇɴᴅɪɴɢ ᴅᴀᴛᴇ"),

	DECREASING_DATE("Decreasing date", "ᴅᴇᴄʀᴇᴀsɪɴɢ ᴅᴀᴛᴇ"),

	DECREASING_PRICE("Decreasing price", "ᴅᴇᴄʀᴇᴀsɪɴɢ ᴘʀɪᴄᴇ"),

	ITEM_LORE_DEFAULT(
			Arrays.asList(
					"§8§m-+------------------------------+-", 
					"§8[§a!§8] §7%status%",
					"",
					"  §f* §fSeller§7: §b%seller%",
					"  §f* §fPrice§7: §b%price%", 
					"  §f* §fExpire§7: §b%time%",
					"§8§m-+------------------------------+-"
			),
			Arrays.asList("", 
					" &f⌂ #e6fff3sᴇʟʟᴇʀ#8c8c8c: #92bed8%seller%", 
					" &f☆ #e6fff3ᴘʀɪᴄᴇ#8c8c8c: #ffacd5%price%",
					" &f⌚ #e6fff3ᴇxᴘɪʀᴇ#8c8c8c: #969696%time%",
					"",
					" %status%"
			)
			),

	ITEM_LORE_EXPIRE(
			Arrays.asList(
					"§8§m-+------------------------------+-",
					"§8[§a!§8] §7Click to retrieve the item", 
					"",
					"  §f* §fExpire§7: §b%time%", 
					"§8§m-+------------------------------+-"
			),
			Arrays.asList(
			        "",
			        " &f⌚ #e6fff3ᴇxᴘɪʀᴇ#8c8c8c: #969696%time%",
			        "",
			        "#8c8c8c• #92bed8ᴄʟɪᴄᴋ #e6fff3ᴛᴏ ʀᴇᴛʀɪᴇᴠᴇ ᴛʜɪs ɪᴛᴇᴍ"
					)
			),

	ITEM_LORE_BUYING(
			Arrays.asList(
					"§8§m-+------------------------------+-", 
					"§8[§a!§8] §7Click to retrieve the item",
					"",
					"  §f* §fExpire§7: §b%time%", 
					"§8§m-+------------------------------+-"
			),
			Arrays.asList(
					"",
					" &f⌚ #e6fff3ᴇxᴘɪʀᴇ#8c8c8c: #969696%time%",
					"",
					"#8c8c8c• #92bed8ᴄʟɪᴄᴋ #e6fff3ᴛᴏ ʀᴇᴛʀɪᴇᴠᴇ ᴛʜɪs ɪᴛᴇᴍ"
			)
			),

	ITEM_LORE_ITEMS(
			Arrays.asList(
					"§8§m-+------------------------------+-",
					"§8[§a!§8] §7Click to retrieve the item", 
					"",
					"  §f* §fExpire§7: §b%time%",
					"§8§m-+------------------------------+-"
					),
			Arrays.asList(
			          "",
			          " &f⌚ #e6fff3ᴇxᴘɪʀᴇ#8c8c8c: #969696%time%",
			          "",
			          "#8c8c8c• #92bed8ᴄʟɪᴄᴋ #e6fff3ᴛᴏ ʀᴇᴛʀɪᴇᴠᴇ ᴛʜɪs ɪᴛᴇᴍ"
					)
			),

	ITEM_LORE_INVENTORY(
			Arrays.asList(
			"§8§m-+------------------------------+-", 
			"§8[§a!§8] §7%status%", 
			"",
			"  §7* §fType§7: §bInventory",
			"  §7* §fSeller§7: §b%seller%", 
			"  §7* §fPrice§7: §b%price%",
			"  §7* §fExpire§7: §b%time%",
			"",
			"  §f* §7§oRight click to buy",
			"  §f* §7§oLeft click to see the content",
			"§8§m-+------------------------------+-"
			),
			Arrays.asList(
			        "",
			        " &f⌂ #e6fff3sᴇʟʟᴇʀ#8c8c8c: #92bed8%seller%",
			        " &f☆ #e6fff3ᴘʀɪᴄᴇ#8c8c8c: #ffacd5%price%",
			        " &f⌚ #e6fff3ᴇxᴘɪʀᴇ#8c8c8c: #969696%time%",
			        "",
			        " &f» #cfcfcfʀɪɢʜᴛ ᴄʟɪᴄᴋ ᴛᴏ ʙᴜʏ",
			        " &f» #cfcfcfʟᴇғᴛ ᴄʟɪᴄᴋ ᴛᴏ sᴇᴇ ᴛʜᴇ ᴄᴏɴᴛᴇɴᴛ",
			        "",
			        " %status%"
					)
			),

	STATUS_PLAYER("Click to retrieve this item", "#8c8c8c• #92bed8ᴄʟɪᴄᴋ #e6fff3ᴛᴏ ʀᴇᴛʀɪᴇᴠᴇ ᴛʜɪs ɪᴛᴇᴍ"), 
	
	STATUS_BUYER("Click to buy this item", "#8c8c8c• #92bed8ᴄʟɪᴄᴋ #e6fff3ᴛᴏ ʙᴜʏ ᴛʜɪs ɪᴛᴇᴍ"),

	NO_MONEY_BUTTON(ItemBuilder.buildNoMoney()),

	ERROR_BUY_ERROR("§cYou can't buy this item."), 
	ERROR_REMOVE_ERROR("§cYou can't remove this item."),
	ERROR_REMOVE_FULL("§cYou must have empty slot in your inventory to retrieve the item."),

	ERROR_BUY_MONEY("§cYou don’t have enough money to buy this."),

	SELL_CREATIVE_ERROR("§cYou can't sell an item in creative mode !"),

	SELL_ITEM_ERROR("§cYou cannot sell this item, it is banned from the plugin."),

	SELL_ITEM_BREAK("§cYou cannot sell a broken item."),

	SELL_WORLD_ERROR("§cYou cannot sell in this world"),

	SELL_ITEM_TAX_DEFAULT("§cYou need §f%tax% §cto be able to sell this item."),

	SELL_ITEMS_ERROR(
			"§cYou cannot sell more than §f%max% §citems. §8(§7Did you set the §fzauctionhouse.max.<number permission in the configuration file> §7?§8)"),

	SELL_ITEM_WHITELIST("§cYou do not have permission to add this item."),

	BROADCAST_SELL_ANNONCE("§fPlayer §b%player% §fhas added §7%item% §ffor §d%price% §fto the auction!"),

	BROADCAST_BUY_ANNONCE("§fPlayer §b%player% §fhas just bought §7%item% §ffor §d%price% §fto the auction!"),

	NO_ENOUGHT_MONEY("§cYou don't have enough money to buy this !"),

	NO_ENOUGHT_PLACE("§cYou don't have enough space in your inventory to buy this item."),

	PLUGIN_NOT_READY("§cThe plugin has not finished to be initialized, please be patient..."),
	
	PLUGIN_NOT_READY_HDB("§cThe §fHeadDataBase §cplugin is not yet active, the plugin inventories have not yet loaded, please wait until HDB is working."),

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
			"§f%seller% have sold x§a%amount% §o%item% §fto the player §b%buyer% for §7%price% §8(§7%date%§8)"),

	TRANSACTION_MESSAGE_CONTENT_PURCHASE(
			"§f%buyer% have purchased x§a%amount% §o%item% §fto the player §b%seller% for §7%price% §8(§7%date%§8)"),

	TRANSACTION_MESSAGE_CONTENT_YOU("You"),

	CONNECT_CLAIM("§aYou have money to recover, make §b/ah claim §ato recover for your money."), 
	
	CONNECT_TRANSACTIONS("§aYou sold %item% item(s) during your absence."),

	ITEM_ECONOMY_FULL("§7You have a full inventory, your items are gone in the inventory of expired items."),

	CLAIM_MONEY_WAIT("§7Wait few seconds..."), CLAIM_MONEY_COOLDOWN(
			"§cYou have to wait a few minutes before you can do this command again."),

	CLAIM_MONEY_CRASH(
			"§7Unable to retrieve transactions at this time, please contact an administrator."), CLAIM_MONEY_ERROR(
					"§cYou have no pending transactions."), CLAIM_MONEY_SUCCESS(
							"§aYou just got your money back on hold."),

	SELL_INVENTORY_ERROR("§cYou did not put any item, sale canceled."),

	SELL_INVENTORY_ITEM(new ItemBuilder(Material.CHEST, "§7Sale of inventory").build()),

	COOLDOWN_MESSAGE(MessageType.ACTION, " §cYou must wait §f%cooldown% §cbefore you can do this action."),

	PURGE_START("§aPurge start. §8(§7Wait few seconds§8)"), PURGE_END("§aThe purge of transactions is over."),

	CLICK_COOLDOWN(MessageType.ACTION, "§cYou must wait before you can perform this action."),

	FORCE_OPEN("§aYou have just opened the auction house for the player §f%player%§a."),

	PRIORITY("No priority"),

	ECONOMY_NOT_FOUND("§cCannot find economy with name §f%name%§c."),

	DUPE_INFO("§aThe player §f%player% §ahas just put on sale and removed 3 items in less than 60 seconds !"),

	DUPE_INFODISCORD("The player **%player%** has just put on sale and removed 3 items in less than 60 seconds !"),

	ECONOMY_GIVE_ERROR_NOTFOUND("§cThe economy §f%name% §ccannot be found"),
	ECONOMY_GIVE_ERROR_TYPE("§cThe economy §f%name% §cis not item economy"),
	ECONOMY_GIVE_SUCCESS("§aYou just got the §f%name% §aeconomy item."),

	BOTH("both"),
	PURCHASE("purchase"),
	SALE("sale"),

	;

	private List<String> messages;
	private List<String> messagesNewVersion;
	private String message;
	private Map<String, Object> titles = new HashMap<>();
	private boolean use = true;
	private MessageType type = MessageType.TCHAT;
	private String messageNewVersion;

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
	private Message(String message, String newVersionMessage) {
		this.message = message;
		this.messageNewVersion = newVersionMessage;
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
	 * @param messages
	 * @param messagesNewVersion
	 */
	private Message(List<String> messages, List<String> messagesNewVersion) {
		this.messages = messages;
		this.messagesNewVersion = messagesNewVersion;
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

	public String getMessageNewVersion() {
		return messageNewVersion;
	}

	public IMessage getIMessage() {
		return null;
	}

	public boolean isValid() {

		if (this.messages == null) {
			this.messages = new ArrayList<String>();
		}

		switch (type) {
		case ACTION:
			return this.message != null;
		case TCHAT:
			return this.message != null || !this.messages.isEmpty();
		case TITLE:
		case ITEMSTACK:
		case NONE:
			return true;
		default:
			break;
		}

		return true;
	}

	public List<String> getMessagesNewVersion() {
		return messagesNewVersion;
	}
	
}
