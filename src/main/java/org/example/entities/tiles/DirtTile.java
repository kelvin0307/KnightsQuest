package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een aarde-tegel voor natuurlijke ondergronden.
 * Donkerder alternatief voor de standaard gras-tegel.
 */
public class DirtTile extends Tile {

	/**
	 * Maakt een nieuwe aarde-tegel aan
	 * @param initialLocation positie (x,y) waar de aarde komt
	 * @param size afmetingen van de tegel
	 */
	public DirtTile(Coordinate2D initialLocation, Size size) {
		super("images/greenworld/dirt.png", initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
