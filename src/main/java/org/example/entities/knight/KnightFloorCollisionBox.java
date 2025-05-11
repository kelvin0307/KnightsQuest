package org.example.entities.knight;

import java.util.List;

import org.example.entities.tiles.Tile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

/**
 * Een vakje onderaan de ridder dat de grond detecteert.
 * Zorgt dat de ridder niet door platforms valt.
 */
public class KnightFloorCollisionBox extends KnightCollisionBox {

    /**
     * Maakt een nieuw grond-detectie vakje
     * @param initialLocation positie onderaan de ridder
     * @param knightComposition de ridder waar dit bij hoort
     */
    public KnightFloorCollisionBox(Coordinate2D initialLocation, KnightComposition knightComposition) {
        super(initialLocation, knightComposition, new Size(18, 5)); 
    }

    /**
     * Wordt aangeroepen als de ridder de grond raakt
     * @param colliders lijst van dingen die geraakt zijn
     */
    @Override
    public void onCollision(List<Collider> colliders) {
        // Begin elk frame met: aannemen dat we NIET op de grond staan
        parent.getKnight().isOnGround = false;

        for (var collider : colliders) {
            if (collider instanceof Tile tile) {
                parent.handleFloorCollision(tile);
                parent.getKnight().isOnGround = true;
            }
        }
    }

}
