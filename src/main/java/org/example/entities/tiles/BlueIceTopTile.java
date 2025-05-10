package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een blauwe ijsrand-tegel voor de bovenkant van ijsplatforms.
 * Zorgt voor een visueel onderscheid tussen ijsblokken en de omgeving.
 */
public class BlueIceTopTile extends Tile {

	/**
	 * Maakt een nieuwe blauwe ijsrand-tegel aan
	 * @param initialLocation positie (x,y) waar de ijsrand komt
	 * @param size afmetingen van de tegel (meestal breed en smal)
	 */
	public BlueIceTopTile(Coordinate2D initialLocation, Size size) {
		super("images/greenworld/blueicetop.png", initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
