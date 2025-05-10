package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een oranje gekleurde boventege voor speciale platforms.
 * Vaak gebruikt als decoratieve bovenkant van muren of obstakels.
 */
public class OrangeTopTile extends Tile {

	/**
	 * Maakt een nieuwe oranje boventegel aan
	 * @param initialLocation positie (x,y) waar de tegel komt
	 * @param size afmetingen van de tegel
	 */
	public OrangeTopTile(Coordinate2D initialLocation, Size size) {
		super("images/greenworld/orangetop.png", initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
