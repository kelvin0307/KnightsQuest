package org.example.entities.knight;

import java.util.List;

import org.example.entities.Coin;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;

import javafx.scene.paint.Color;

/**
 * Een collision box die detecteert wanneer de ridder een munt aanraakt.
 * Handelt de muntcollectie af wanneer een botsing plaatsvindt.
 */
public class KnightCoinCollision extends RectangleEntity implements Collided{

	private final KnightComposition knight;

	/**
	 * Maakt een nieuwe collision box aan voor het detecteren van botsingen met munten.
	 *
	 * @param initialPosition De startlocatie van de collision box.
	 * @param size De grootte van de collision box.
	 * @param knight De {@code KnightComposition} waartoe deze box behoort.
	 */
	public KnightCoinCollision(Coordinate2D initialPosition, Size size, KnightComposition knight) {
		super(initialPosition, size);
		this.knight = knight;
		setFill(Color.TRANSPARENT);
	}

	/**
	 * Controleert op botsingen met munten. Wanneer een munt geraakt wordt, wordt de munt verwerkt door de ridder.
	 *
	 * @param collidingObjects Een lijst van objecten waarmee gebotst wordt.
	 */
	@Override
	public void onCollision(List<Collider> collidingObjects) {
		for(Collider other : collidingObjects) {
			if(other instanceof Coin coin) {
				knight.handleCoinCollision(coin);
			}
		}
	}

}
