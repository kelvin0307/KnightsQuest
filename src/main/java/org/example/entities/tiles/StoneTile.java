package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een stenen tegel die gebruikt wordt als onderdeel van het level.
 * Deze tegel heeft een standaard stenen uiterlijk en gedraagt zich als een solide object.
 */
public class StoneTile extends Tile {

	/**
	 * Maakt een nieuwe stenen tegel aan
	 * @param initialLocation de positie waar de tegel moet komen (x,y coördinaten)
	 * @param size de grootte van de tegel (breedte, hoogte)
	 */
	public StoneTile(Coordinate2D initialLocation, Size size) {
		super("images/greenworld/stone.png", initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
