package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een oranje gekleurde rots-tegel met een ruig uiterlijk.
 * Gebruikt voor natuurlijk ogende obstakels met een opvallende kleur.
 */
public class OrangeRockTile extends Tile {

	/**
	 * Maakt een nieuwe oranje rots-tegel aan
	 * @param initialLocation positie (x,y) waar de rots komt
	 * @param size grootte van de tegel (breedte, hoogte)
	 */
	public OrangeRockTile(Coordinate2D initialLocation, Size size) {
		super("images/greenworld/orangerock.png", initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
