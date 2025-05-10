package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een tegel van helder blauw ijs voor winterse levels.
 * Heeft een doorzichtig uiterlijk en wordt vaak gebruikt voor ijspalissades.
 */
public class BlueIceTile extends Tile{

	/**
	 * Maakt een nieuwe blauwe ijs-tegel aan
	 * @param initialLocation positie (x,y) waar het ijsblok komt
	 * @param size afmetingen van de tegel
	 */
	public BlueIceTile(Coordinate2D initialLocation, Size size) {
		super("images/greenworld/blueice.png", initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
