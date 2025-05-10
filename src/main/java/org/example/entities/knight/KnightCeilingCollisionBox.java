package org.example.entities.knight;

import java.util.List;

import org.example.entities.tiles.Tile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

/**
 * Vertegenwoordigt een collision box voor het detecteren van botsingen met plafonds voor de ridder.
 * Deze gespecialiseerde collision box is gepositioneerd bovenop de ridder en behandelt
 * botsingen met tegels boven de ridder.
 */
public class KnightCeilingCollisionBox extends KnightCollisionBox {

	/**
	 * Maakt een nieuwe KnightCeilingCollisionBox op de opgegeven locatie.
	 *
	 * @param initialLocation de startpositie van de collision box (Coordinate2D)
	 * @param parent de KnightComposition waar deze collision box bij hoort
	 */
	public KnightCeilingCollisionBox(Coordinate2D initialLocation, KnightComposition parent) {
		super(initialLocation, parent, new Size(18, 5));
		
	}

	/**
	 * Verwerkt botsingsgebeurtenissen met andere objecten.
	 * Controleert alle botsende objecten en meldt plafondbotsingen
	 * aan de parent KnightComposition wanneer een tegel wordt geraakt.
	 *
	 * @param colliders een lijst van objecten waarmee gebotst is
	 */
	@Override
	public void onCollision(List<Collider> colliders) {
		for(var collider : colliders ) {
			if(collider instanceof Tile tile) {
				parent.handleCeilingCollision(tile);
			}
		}
	}

}
