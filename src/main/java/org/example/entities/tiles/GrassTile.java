package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een standaard gras-tegel voor natuurlijke ondergronden.
 * Basis tegel voor buitenlevels en groene gebieden.
 */
public class GrassTile extends Tile {

	/**
	 * Maakt een nieuwe gras-tegel aan
	 * @param initialLocation positie (x,y) waar het gras komt
	 * @param size afmetingen van de tegel
	 */
	public GrassTile (Coordinate2D initialLocation, Size size) {
		super ("images/greenworld/greenTile.png",initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
