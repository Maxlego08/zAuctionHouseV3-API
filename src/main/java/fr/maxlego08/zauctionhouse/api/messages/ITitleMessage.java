package fr.maxlego08.zauctionhouse.api.messages;

public interface ITitleMessage {

	/**
	 * 
	 * @return
	 */
	int getEnd();

	/**
	 * 
	 * @return
	 */
	int getStart();

	/*
	 * 
	 */
	String getSubTitle();

	/**
	 * 
	 * @return
	 */
	String getTitle();

	/**
	 * 
	 * @return
	 */
	int getTime();

	/**
	 * 
	 * @param end
	 */
	void setEnd(int end);

	/**
	 * 
	 * @param start
	 */
	void setStart(int start);

	/**
	 * 
	 * @param subTitle
	 */
	void setSubTitle(String subTitle);

	/**
	 * 
	 * @param title
	 */
	void setTitle(String title);

	/**
	 * 
	 * @param time
	 */
	void setTime(int time);

}
