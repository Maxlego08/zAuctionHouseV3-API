package fr.maxlego08.zauctionhouse.api.enums;

public enum Sorting {

	DECREASING_DATE,
	
	DECREASING_PRICE,
	
	ASCENDING_DATE, 
	
	ASCENDING_PRICE, 
	


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
		case DECREASING_DATE:
			return Message.DECREASING_DATE.getMessage();
		case DECREASING_PRICE:
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
			return Sorting.DECREASING_DATE;
		case DECREASING_DATE:
			return Sorting.DECREASING_PRICE;
		case DECREASING_PRICE:
			return Sorting.ASCENDING_DATE;
		}
		return Sorting.DECREASING_PRICE;
	}
	
}
