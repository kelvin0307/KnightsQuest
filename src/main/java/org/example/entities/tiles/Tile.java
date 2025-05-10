package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

/**
 * Basisklasse voor alle soorten tegels in het spel.
 * Tegels zijn de bouwstenen van de levels en kunnen botsingen detecteren.
 */
public class Tile extends SpriteEntity implements Collider{

	/**
	 * Maakt een nieuwe tegel aan
	 * @param resource pad naar het plaatje van de tegel
	 * @param initialLocation positie waar de tegel komt (x,y)
	 * @param size grootte van de tegel (breedte, hoogte)
	 */
	public Tile(String resource, Coordinate2D initialLocation, Size size) {
		super(resource, initialLocation, size);
	}

}
