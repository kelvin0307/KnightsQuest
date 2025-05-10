package org.example.entities.knight;



import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;

import javafx.scene.paint.Color;

/**
 * Een basis botsingsvakje voor de ridder dat helpt bij het detecteren van botsingen.
 * Dit is een abstracte klasse die andere botsingsvakjes kunnen uitbreiden.
 */
public abstract class KnightCollisionBox extends RectangleEntity implements Collided {

	protected final KnightComposition parent;

	/**
	 * Maakt een nieuw botsingsvakje aan
	 * @param initialLocation startpositie (x,y coördinaten)
	 * @param parent de ridder waar dit vakje bij hoort
	 * @param size hoe groot het vakje moet zijn (breedte, hoogte)
	 */
	public KnightCollisionBox(Coordinate2D initialLocation, final KnightComposition parent, Size size) {
		super(initialLocation, size);
		this.parent = parent;
		setFill(Color.RED);
	}

}
