package org.example.entities.knight;

import java.util.List;

import org.example.entities.tiles.Tile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

/**
 * Een onzichtbaar vakje dat botsingen met muren aan de zijkant van de ridder detecteert.
 * Voorkomt dat de ridder door muren heen kan lopen.
 */
public class KnightWallCollisionBox extends KnightCollisionBox {

    /**
     * Maakt een muur-detectievakje aan.
     * @param initialLocation positie aan de zijkant van de ridder
     * @param parent de ridder waar dit vakje bij hoort
     */
    public KnightWallCollisionBox(Coordinate2D initialLocation, KnightComposition parent) {
        super(initialLocation, parent, new Size(5, 50));
    }

    /**
     * Wordt aangeroepen wanneer de ridder tegen een muur aanloopt.
     * @param collidingObjects lijst van objecten waartegen gebotst is
     */
    @Override
    public void onCollision(List<Collider> collidingObjects) {
        for (var collider : collidingObjects) {
            if (collider instanceof Tile tile) {
                parent.handleWallCollision(tile);
            }
        }
    }
}
