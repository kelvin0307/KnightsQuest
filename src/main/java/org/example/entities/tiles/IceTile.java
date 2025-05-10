package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een gladde ijs-tegel die mogelijk slippend gedrag veroorzaakt.
 * Wordt gebruikt voor winterse levels of speciale platformgebieden.
 */
public class IceTile extends Tile {

	/**
	 * Maakt een nieuwe ijs-tegel aan
	 * @param initialLocation positie (x,y) waar het ijs komt
	 * @param size afmetingen van de tegel
	 */
	public IceTile(Coordinate2D initialLocation, Size size) {
		super("images/greenworld/ice.png", initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
