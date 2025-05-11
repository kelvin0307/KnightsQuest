package org.example.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

/**
 * Een vlagobject dat als sprite wordt weergegeven en botsingen detecteert.
 */
public class FirstFlag extends SpriteEntity implements Collider {

	/**
	 * Maakt een vlag op de opgegeven locatie.
	 *
	 * @param initialLocation De startpositie van de vlag.
	 */
	public FirstFlag(Coordinate2D initialLocation) {
		super("images/greenworld/flag.png", initialLocation, new Size(500, 500));
		// TODO Auto-generated constructor stub
	}

}
