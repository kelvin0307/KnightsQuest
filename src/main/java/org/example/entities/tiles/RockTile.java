package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een natuurlijke rots tegel voor levels.
 * Heeft een ruig uiterlijk en wordt vaak gebruikt voor natuurlijke obstakels.
 */
public class RockTile extends Tile{

	/**
	 * Maakt een nieuwe rots tegel aan
	 * @param initialLocation positie (x,y) waar de rots komt
	 * @param size afmetingen van de rots
	 */
	public RockTile(Coordinate2D initialLocation, Size size) {
		super("images/greenworld/rock1.png", initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
