package fr.maxlego08.zauctionhouse.api.utils;

import java.awt.Color;

public class DiscordColor {

	private final int r;
	private final int g;
	private final int b;
	/**
	 * @param r
	 * @param g
	 * @param b
	 */
	public DiscordColor(int r, int g, int b) {
		super();
		this.r = r;
		this.g = g;
		this.b = b;
	}
	/**
	 * @return the r
	 */
	public int getR() {
		return r;
	}
	/**
	 * @return the g
	 */
	public int getG() {
		return g;
	}
	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}
	
	public Color getColor(){
		return new Color(this.r, this.g, this.b);
	}
	
}
