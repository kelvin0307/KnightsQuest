package org.example.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.LoopingAnimation;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

/**
 * Een munt die de speler kan verzamelen in het spel.
 * Heeft een draaiende animatie om zichtbaar te zijn voor de speler.
 */
public class Coin extends DynamicSpriteEntity {
	public int value;

	/**
	 * Maakt een nieuwe munt aan op de opgegeven locatie
	 * @param initialLocation de positie (x,y) waar de munt verschijnt
	 */
	public Coin(Coordinate2D initialLocation) {
		super("sprites/coin.png", initialLocation, new Size(48, 48), 1, 12);
		playAnimation(new LoopingAnimation(0, 0, 0, 11));
		

	}


	
	}


