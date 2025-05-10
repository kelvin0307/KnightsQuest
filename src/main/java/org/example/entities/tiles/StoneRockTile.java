package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een rotsachtige stenen tegel voor natuurlijke omgevingen.
 * Gebruikt een ruigere steen texture dan de gewone StoneTile.
 */
public class StoneRockTile extends Tile {

	/**
	 * Maakt een nieuwe rots-stenen tegel aan
	 * @param initialLocation positie (x,y) waar de tegel komt
	 * @param size afmetingen van de tegel
	 */
	public StoneRockTile( Coordinate2D initialLocation, Size size) {
		super("images/greenworld/stonerock.png", initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
