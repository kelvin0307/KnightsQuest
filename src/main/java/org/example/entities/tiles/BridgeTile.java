package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een brug-tegel voor het overspannen van gaten of water.
 * Maakt horizontale verbindingen tussen platforms mogelijk.
 */
public class BridgeTile extends Tile {

	/**
	 * Maakt een nieuwe brug-tegel aan
	 * @param initialLocation positie (x,y) waar de brug komt
	 * @param size afmetingen van de tegel
	 */
	public BridgeTile(Coordinate2D initialLocation, Size size) {
		super("images/bridge.png", initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
