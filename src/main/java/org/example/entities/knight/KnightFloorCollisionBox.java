package org.example.entities.knight;

import java.util.List;

import org.example.entities.tiles.Tile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

public class KnightFloorCollisionBox extends KnightCollisionBox {

    public KnightFloorCollisionBox(Coordinate2D initialLocation, KnightComposition knightComposition) {
        super(initialLocation, knightComposition, new Size(18, 5)); 
    }

    @Override
    public void onCollision(List<Collider> colliders) {
        for (var collider : colliders) {
            if (collider instanceof Tile tile) {
               parent.handleFloorCollision(tile);
            }
        }
    }
}
