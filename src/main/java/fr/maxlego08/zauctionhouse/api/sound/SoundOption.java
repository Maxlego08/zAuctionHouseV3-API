package fr.maxlego08.zauctionhouse.api.sound;

import org.bukkit.entity.Entity;

import fr.maxlego08.zauctionhouse.api.enums.XSound;

public interface SoundOption {

	/**
	 * 
	 * @return sound
	 */
	public XSound getSound();
	
	/**
	 * 
	 * @return pitch
	 */
	public float getPitch();
	
	/**
	 * 
	 * @return volume
	 */
	public float getVolume();
	
	/**
	 * 
	 * @param entity
	 */
	void play(Entity entity);
	
}
