package fr.maxlego08.zauctionhouse.api.storage;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.maxlego08.zauctionhouse.api.AuctionItem;

public interface ObjectBuilder<T> {

	/**
	 * Build {@link AuctionItem} from {@link ResultSet}
	 * @param resultSet
	 * @return {@link AuctionItem}
	 */
	T build(ResultSet resultSet) throws SQLException;

}
