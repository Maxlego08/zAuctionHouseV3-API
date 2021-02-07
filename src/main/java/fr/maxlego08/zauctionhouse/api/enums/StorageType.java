package fr.maxlego08.zauctionhouse.api.enums;

public enum StorageType {

	STORAGE("auction"),
	BUY("auction_expire"),
	EXPIRE("auction_buy"),
	
	;
	
	private final String tableName;

	private StorageType(String tableName) {
		this.tableName = tableName;
	}
	
	public String getTableName() {
		return tableName;
	}	
	
}
