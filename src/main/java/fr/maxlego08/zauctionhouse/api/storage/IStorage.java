package fr.maxlego08.zauctionhouse.api.storage;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.AuctionPlugin;
import fr.maxlego08.zauctionhouse.api.economy.AuctionEconomy;
import fr.maxlego08.zauctionhouse.api.enums.StorageType;
import fr.maxlego08.zauctionhouse.api.transaction.Transaction;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

public interface IStorage {

    void load(StorageManager storageManager, AuctionPlugin plugin);

    void saveItem(AuctionPlugin plugin, AuctionItem auctionItem, StorageType type);

    void removeItem(AuctionPlugin plugin, AuctionItem auctionItem, StorageType type);

    void saveItems(AuctionPlugin plugin, List<AuctionItem> auctionItems, StorageType type);

    void update(AuctionPlugin plugin, StorageType type);

    List<AuctionItem> getItems(AuctionPlugin plugin, StorageType type);

    void save(AuctionPlugin plugin);

    void storeTransaction(Transaction transaction, Consumer<Transaction> consumer);

    void saveTransactions(List<Transaction> transactions);

    void updateItem(AuctionPlugin plugin, AuctionItem auctionItem, StorageType type);

    List<Transaction> getTransactions();

    void updateTransaction(List<Transaction> transactions);

    void purgeTransactions(long seconds, Runnable runnable);

    void fetchClaimMoney(Player player, Consumer<List<Transaction>> consumer);

    void fetchUnreadMoney(Player player, Consumer<List<Transaction>> consumer);

    boolean isCooldown(UUID uniqueId);

    boolean uuidExist(UUID uuid);

    String getServerName();

    void giveMoneyOnSellServer(AuctionEconomy economy, OfflinePlayer player, long finalPrice, String server);

    long fetchClaimMoneySync(UUID uniqueId, String economy);

    void checkIsItemIsValid(Player player, AuctionItem auctionItem, Consumer<Boolean> consumer);
}
