package fr.maxlego08.zauctionhouse.api.storage;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.AuctionPlugin;
import fr.maxlego08.zauctionhouse.api.enums.StorageType;
import fr.maxlego08.zauctionhouse.api.transaction.Transaction;
import org.bukkit.entity.Player;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

public interface IConnection {

    Connection getConnection();

    void asyncInsert(AuctionItem auctionItem, StorageType type, String serverName);

    void asyncDelete(AuctionItem auctionItem, StorageType type, Runnable runnable);

    void selectItems(AuctionPlugin plugin, IStorage iStorage, StorageManager manager);

    void asyncInsert(Transaction transaction, Consumer<Transaction> consumer);

    void selectTransactions(AuctionPlugin plugin, IStorage iStorage, StorageManager manager);

    void asyncUpdate(AuctionItem auctionItem, StorageType type);

    void asyncUpdate(List<Transaction> transactions);

    void getAndRefreshConnection(Runnable runnable);

    void asyncDelete(Transaction transaction);

    void fetchClaimMoney(Player player, Consumer<List<Transaction>> consumer);

    void fetchUnreadMoney(Player player, Consumer<List<Transaction>> consumer);

    long fetchClaimMoneySync(UUID uniqueId, String economy);
}
