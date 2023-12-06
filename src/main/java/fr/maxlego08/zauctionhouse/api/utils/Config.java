package fr.maxlego08.zauctionhouse.api.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemFlag;

import fr.maxlego08.zauctionhouse.api.enums.Sorting;
import fr.maxlego08.zauctionhouse.api.storage.Saveable;
import fr.maxlego08.zauctionhouse.api.storage.Storage;
import fr.maxlego08.zauctionhouse.api.tax.TaxType;

public class Config implements Saveable {

	public static transient boolean USE_ZMENU_INVENTORY = false;

	public static transient boolean enableDebugMode = false;
	public static transient boolean enableDebugModeTime = false;
	public static transient boolean enablePermissionForSellingTime = false;
	public static transient boolean enablePlugin = true;
	public static transient boolean creativeSell = true;
	public static transient boolean useSellCooldown = true;
	public static transient boolean useNoMoneyItem = true;
	public static transient boolean useLog = true;
	public static transient boolean useLogInFile = false;
	public static transient boolean enableCustomHelpMessage = false;
	public static transient boolean enableCustomSellMessage = false;
	public static transient boolean enableCustomOpenMessage = false;
	public static transient boolean enablePrioritySort = false;
	public static transient boolean enablePrioritySortLimit = false;
	public static transient long maxPrice = 999999999999999999l;
	public static transient long minPrice = 10l;
	public static transient long cooldownCommandSell = 5;
	public static transient long noMoneyItemTicks = 20;
	public static transient long sellTime = 48 * 3600;
	public static transient long expireTime = 24 * 3600 * 7;
	public static transient Storage storage = Storage.JSON;
	public static transient String mainCommand = "zauctionhouse";
	public static transient List<String> subCommands = Arrays.asList("zauction", "ah", "hdv", "zah", "zhdv");
	public static transient List<String> sellCommandAliases = Arrays.asList("sell", "vendre", "s");
	public static transient Sorting defaultSort = Sorting.DECREASING_DATE;
	public static transient List<NumberFormatSell> numberFormatSells = new ArrayList<>();

	public static transient boolean enableDefaultTax = false;
	public static transient boolean enableItemsTax = false;
	public static transient TaxType taxType = TaxType.SELL;
	public static transient double taxDefaultPercent = 10.0;
	public static transient boolean enableTaxByPassPermission = false;
	public static transient String taxBypassPermission = "zauctionhouse.bypass.tax";

	public static transient String defaultEconomy = "VAULT";
	public static transient DiscordWebhookConfig discordWebhook;

	public static transient boolean disableSaleIfPlayerIsLagging = true;
	public static transient int maxPingForSellAnItem = 600;

	public static transient boolean disableSaleIfServerIsLagging = true;
	public static transient int minTpsForSellAnItem = 16;

	public static transient String addonPermission = null;
	public static transient String versionPermission = null;

	public static transient String transactionDateFormat = "YYYY MM dd hh:mm:ss";

	public static transient long cacheItemStackMilliSeconds = 1000;
	public static transient boolean enablePapiInAuctionItemLore = true;

	public static transient boolean enableCacheItems = false;
	public static transient long cacheSeconds = 15;

	public static transient int sortCooldownChange = 5;

	public static transient int autoSaveSecond = 60 * 15;

	public static transient boolean enableLogFileSaveInformations = true;
	public static transient boolean enableOpenSyncInventory = false;
	public static transient boolean disableCommands = false;

	public static transient boolean enableAddItemFlagToAuctionItem = false;
	public static transient List<ItemFlag> itemFlags = Arrays.asList(ItemFlag.values());

	public static transient ClickType showClick = ClickType.RIGHT;

	public static transient String tablSqlPrefix = "";
	public static transient int maxSqlRetryAmount = 5;

	public static transient long removeTransactionAfterSeconds = 86400 * 7;

	public static transient String numberFormatThousand = "k ";
	public static transient String numberFormatMillion = "m ";
	public static transient String numberFormatBillion = "M ";
	public static transient String numberFormatTrillion = "T ";
	public static transient String decimalFormatDefault = "#.#";
	public static transient String decimalFormatThousand = "#.#";
	public static transient String decimalFormatMillion = "#.#";
	public static transient String decimalFormatBillion = "#.#";
	public static transient String decimalFormatTrillion = "#.##";

	public static transient boolean betterPrice = true;
	public static transient boolean betterPriceReduction = false;

	public static transient char betterPriceEspace = ' ';
	public static transient boolean enableMinMaxPricePerItems = false;
	public static transient boolean enableSellAnnonce = false;
	public static transient String permissionSellAnnonce = null;
	public static transient boolean displayErrorBuyMessage = false;
	public static transient boolean enableBuyAnnonce = false;

	public static transient boolean enableClaimMoney = false;
	public static transient boolean enableClaimMoneyMessageOnJoin = false;
	public static transient boolean enableTransactionMessageOnJoin = false;

	public static transient boolean disableSellBreakItem = false;

	public static transient boolean giveItemAfterPurchase = false;
	public static transient boolean sendItemToPurchaseInventoryIfIsFull = true;
	public static transient boolean openInventoryAfterRemoveConfirm = true;
	public static transient boolean openInventoryAfterBuying = false;
	public static transient boolean needPriceForSellInventory = true;
	public static transient boolean disablePriceErrorDefault = true;
	public static transient boolean enableCommandInventories = false;
	public static transient boolean enableVersionChecker = true;

	public static transient boolean enableRedisAutoUpdateInventory = false;
	public static transient boolean enableRedisAutoGiveMoneyIfPlayerIsOnline = false;

	public static transient boolean disableDefaultSellPriceFormatError = false;

	public static transient long cooldownClaimMoneyMessageTicks = 10;
	public static transient long cooldownClaimMoneySecond = 300;

	public static transient long cooldownInformationsMessageTicks = 15;

	public static transient int transactionPageSize = 5;

	public static transient boolean displayCooldownMessage = true;
	public static transient boolean enableCooldownClick = false;
	public static transient long cooldownClickMilliseconds = 500;

	public static transient long commandCooldownMilliSeconds = 5000;
	public static transient boolean enableCooldownCommand = true;

	public static transient boolean categoryCheckOnlyMaterial = true;

	public static List<String> blacklistPlayers = new ArrayList<String>();

	public static transient DupeConfig dupeConfig;

	public static boolean enableShulkerPacks = false;

	static {
		numberFormatSells.add(new NumberFormatSell("k", 1000));
		numberFormatSells.add(new NumberFormatSell("m", 1000000));
		numberFormatSells.add(new NumberFormatSell("B", 1000000000));
		numberFormatSells.add(new NumberFormatSell("T", 1000000000000l));
	}

	public void save(Persist persist) {
		persist.save(this);

	}


	public void load(Persist persist) {

		if (persist != null) {
			persist.loadOrSaveDefault(this, Config.class);
		}
		if (blacklistPlayers == null) {
			blacklistPlayers = new ArrayList<String>();
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("USE_ZMENU_INVENTORY: ").append(USE_ZMENU_INVENTORY).append("\n");
		sb.append("enableDebugMode: ").append(enableDebugMode).append("\n");
		sb.append("enableDebugModeTime: ").append(enableDebugModeTime).append("\n");
		sb.append("enablePermissionForSellingTime: ").append(enablePermissionForSellingTime).append("\n");
		sb.append("enablePlugin: ").append(enablePlugin).append("\n");
		sb.append("creativeSell: ").append(creativeSell).append("\n");
		sb.append("useSellCooldown: ").append(useSellCooldown).append("\n");
		sb.append("useNoMoneyItem: ").append(useNoMoneyItem).append("\n");
		sb.append("useLog: ").append(useLog).append("\n");
		sb.append("useLogInFile: ").append(useLogInFile).append("\n");
		sb.append("enableCustomHelpMessage: ").append(enableCustomHelpMessage).append("\n");
		sb.append("enableCustomSellMessage: ").append(enableCustomSellMessage).append("\n");
		sb.append("enableCustomOpenMessage: ").append(enableCustomOpenMessage).append("\n");
		sb.append("enablePrioritySort: ").append(enablePrioritySort).append("\n");
		sb.append("enablePrioritySortLimit: ").append(enablePrioritySortLimit).append("\n");
		sb.append("maxPrice: ").append(maxPrice).append("\n");
		sb.append("minPrice: ").append(minPrice).append("\n");
		sb.append("cooldownCommandSell: ").append(cooldownCommandSell).append("\n");
		sb.append("noMoneyItemTicks: ").append(noMoneyItemTicks).append("\n");
		sb.append("sellTime: ").append(sellTime).append("\n");
		sb.append("expireTime: ").append(expireTime).append("\n");
		sb.append("storage: ").append(storage).append("\n");
		sb.append("mainCommand: ").append(mainCommand).append("\n");
		sb.append("subCommands: ").append(subCommands).append("\n");
		sb.append("sellCommandAliases: ").append(sellCommandAliases).append("\n");
		sb.append("defaultSort: ").append(defaultSort).append("\n");
		sb.append("numberFormatSells: ").append(numberFormatSells).append("\n");
		sb.append("enableDefaultTax: ").append(enableDefaultTax).append("\n");
		sb.append("enableItemsTax: ").append(enableItemsTax).append("\n");
		sb.append("taxType: ").append(taxType).append("\n");
		sb.append("taxDefaultPercent: ").append(taxDefaultPercent).append("\n");
		sb.append("enableTaxByPassPermission: ").append(enableTaxByPassPermission).append("\n");
		sb.append("taxBypassPermission: ").append(taxBypassPermission).append("\n");
		sb.append("defaultEconomy: ").append(defaultEconomy).append("\n");
		sb.append("discordWebhook: ").append(discordWebhook).append("\n");
		sb.append("disableSaleIfPlayerIsLagging: ").append(disableSaleIfPlayerIsLagging).append("\n");
		sb.append("maxPingForSellAnItem: ").append(maxPingForSellAnItem).append("\n");
		sb.append("disableSaleIfServerIsLagging: ").append(disableSaleIfServerIsLagging).append("\n");
		sb.append("minTpsForSellAnItem: ").append(minTpsForSellAnItem).append("\n");
		sb.append("addonPermission: ").append(addonPermission).append("\n");
		sb.append("versionPermission: ").append(versionPermission).append("\n");
		sb.append("transactionDateFormat: ").append(transactionDateFormat).append("\n");
		sb.append("cacheItemStackMilliSeconds: ").append(cacheItemStackMilliSeconds).append("\n");
		sb.append("enablePapiInAuctionItemLore: ").append(enablePapiInAuctionItemLore).append("\n");
		sb.append("enableCacheItems: ").append(enableCacheItems).append("\n");
		sb.append("cacheSeconds: ").append(cacheSeconds).append("\n");
		sb.append("sortCooldownChange: ").append(sortCooldownChange).append("\n");
		sb.append("autoSaveSecond: ").append(autoSaveSecond).append("\n");
		sb.append("enableLogFileSaveInformations: ").append(enableLogFileSaveInformations).append("\n");
		sb.append("enableOpenSyncInventory: ").append(enableOpenSyncInventory).append("\n");
		sb.append("disableCommands: ").append(disableCommands).append("\n");
		sb.append("enableAddItemFlagToAuctionItem: ").append(enableAddItemFlagToAuctionItem).append("\n");
		sb.append("itemFlags: ").append(itemFlags).append("\n");
		sb.append("showClick: ").append(showClick).append("\n");
		sb.append("tablSqlPrefix: ").append(tablSqlPrefix).append("\n");
		sb.append("maxSqlRetryAmount: ").append(maxSqlRetryAmount).append("\n");
		sb.append("removeTransactionAfterSeconds: ").append(removeTransactionAfterSeconds).append("\n");
		sb.append("numberFormatThousand: ").append(numberFormatThousand).append("\n");
		sb.append("numberFormatMillion: ").append(numberFormatMillion).append("\n");
		sb.append("numberFormatBillion: ").append(numberFormatBillion).append("\n");
		sb.append("numberFormatTrillion: ").append(numberFormatTrillion).append("\n");
		sb.append("decimalFormatDefault: ").append(decimalFormatDefault).append("\n");
		sb.append("decimalFormatThousand: ").append(decimalFormatThousand).append("\n");
		sb.append("decimalFormatMillion: ").append(decimalFormatMillion).append("\n");
		sb.append("decimalFormatBillion: ").append(decimalFormatBillion).append("\n");
		sb.append("decimalFormatTrillion: ").append(decimalFormatTrillion).append("\n");
		sb.append("betterPrice: ").append(betterPrice).append("\n");
		sb.append("betterPriceReduction: ").append(betterPriceReduction).append("\n");
		sb.append("betterPriceEspace: ").append(betterPriceEspace).append("\n");
		sb.append("enableMinMaxPricePerItems: ").append(enableMinMaxPricePerItems).append("\n");
		sb.append("enableSellAnnonce: ").append(enableSellAnnonce).append("\n");
		sb.append("permissionSellAnnonce: ").append(permissionSellAnnonce).append("\n");
		sb.append("displayErrorBuyMessage: ").append(displayErrorBuyMessage).append("\n");
		sb.append("enableBuyAnnonce: ").append(enableBuyAnnonce).append("\n");
		sb.append("enableClaimMoney: ").append(enableClaimMoney).append("\n");
		sb.append("enableClaimMoneyMessageOnJoin: ").append(enableClaimMoneyMessageOnJoin).append("\n");
		sb.append("enableTransactionMessageOnJoin: ").append(enableTransactionMessageOnJoin).append("\n");
		sb.append("disableSellBreakItem: ").append(disableSellBreakItem).append("\n");
		sb.append("giveItemAfterPurchase: ").append(giveItemAfterPurchase).append("\n");
		sb.append("sendItemToPurchaseInventoryIfIsFull: ").append(sendItemToPurchaseInventoryIfIsFull).append("\n");
		sb.append("openInventoryAfterRemoveConfirm: ").append(openInventoryAfterRemoveConfirm).append("\n");
		sb.append("openInventoryAfterBuying: ").append(openInventoryAfterBuying).append("\n");
		sb.append("needPriceForSellInventory: ").append(needPriceForSellInventory).append("\n");
		sb.append("disablePriceErrorDefault: ").append(disablePriceErrorDefault).append("\n");
		sb.append("enableCommandInventories: ").append(enableCommandInventories).append("\n");
		sb.append("enableVersionChecker: ").append(enableVersionChecker).append("\n");
		sb.append("enableRedisAutoUpdateInventory: ").append(enableRedisAutoUpdateInventory).append("\n");
		sb.append("enableRedisAutoGiveMoneyIfPlayerIsOnline: ").append(enableRedisAutoGiveMoneyIfPlayerIsOnline)
				.append("\n");
		sb.append("disableDefaultSellPriceFormatError: ").append(disableDefaultSellPriceFormatError).append("\n");
		sb.append("cooldownClaimMoneyMessageTicks: ").append(cooldownClaimMoneyMessageTicks).append("\n");
		sb.append("cooldownClaimMoneySecond: ").append(cooldownClaimMoneySecond).append("\n");
		sb.append("cooldownInformationsMessageTicks: ").append(cooldownInformationsMessageTicks).append("\n");
		sb.append("transactionPageSize: ").append(transactionPageSize).append("\n");
		sb.append("displayCooldownMessage: ").append(displayCooldownMessage).append("\n");
		sb.append("enableCooldownClick: ").append(enableCooldownClick).append("\n");
		sb.append("cooldownClickMilliseconds: ").append(cooldownClickMilliseconds).append("\n");
		sb.append("commandCooldownMilliSeconds: ").append(commandCooldownMilliSeconds).append("\n");
		sb.append("enableCooldownCommand: ").append(enableCooldownCommand).append("\n");
		sb.append("categoryCheckOnlyMaterial: ").append(categoryCheckOnlyMaterial).append("\n");
		sb.append("blacklistPlayers: ").append(blacklistPlayers).append("\n");
		sb.append("dupeConfig: ").append(dupeConfig).append("\n");

		return sb.toString();
	}

}
