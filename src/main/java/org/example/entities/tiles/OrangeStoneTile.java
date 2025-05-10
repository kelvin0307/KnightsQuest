package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een oranje gekleurde stenen tegel voor decoratieve doeleinden.
 * Wordt vaak gebruikt in combinatie met andere oranje tegels voor visuele variatie.
 */
public class OrangeStoneTile extends Tile {

	/**
	 * Maakt een nieuwe oranje stenen tegel aan
	 * @param initialLocation de positie (x,y) waar de tegel komt
	 * @param size de afmetingen van de tegel (breedte, hoogte)
	 */
	public OrangeStoneTile( Coordinate2D initialLocation, Size size) {
		super("images/greenworld/orangestone.png", initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
