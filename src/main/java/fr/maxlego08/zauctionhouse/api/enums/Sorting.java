package fr.maxlego08.zauctionhouse.api.enums;

public enum Sorting {

	ASCENDING_PRICE(), 
	
	DECRASING_PRICE(), 
	
	ASCENDING_DATE(), 

	DECRASING_DATE(),

	;

	private Sorting() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		switch (this) {
		case ASCENDING_DATE:
			return Message.ASCENDING_DATE.getMessage();
		case ASCENDING_PRICE:
			return Message.ASCENDING_PRICE.getMessage();
		case DECRASING_DATE:
			return Message.DECREASING_DATE.getMessage();
		case DECRASING_PRICE:
			return Message.DECREASING_PRICE.getMessage();
		default:
			return "";
		}
	}

	public Sorting next() {
		switch (this) {
		case ASCENDING_DATE:
			return Sorting.ASCENDING_PRICE;
		case ASCENDING_PRICE:
			return Sorting.DECRASING_DATE;
		case DECRASING_DATE:
			return Sorting.DECRASING_PRICE;
		case DECRASING_PRICE:
			return Sorting.ASCENDING_DATE;
		}
		return Sorting.DECRASING_PRICE;
	}
	
}
