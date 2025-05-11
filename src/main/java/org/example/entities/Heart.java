package org.example.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

/**
 * Grafische representatie van een levenshartje.
 * Wordt gebruikt door {@code HealthManager} om de health van de speler visueel weer te geven.
 */
public class Heart extends SpriteEntity {

	/**
	 * Maakt een hartje op de opgegeven locatie.
	 *
	 * @param initialLocation De positie van het hartje op het scherm.
	 */
	protected Heart(Coordinate2D initialLocation) {
		super("images/heart.png", initialLocation);
		// TODO Auto-generated constructor stub
	}

}
