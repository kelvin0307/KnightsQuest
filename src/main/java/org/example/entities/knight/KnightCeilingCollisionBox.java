package org.example.entities.knight;

import java.util.List;

import org.example.entities.tiles.Tile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

public class KnightCeilingCollisionBox extends KnightCollisionBox {

	public KnightCeilingCollisionBox(Coordinate2D initialLocation, KnightComposition parent) {
		super(initialLocation, parent, new Size(18, 5));
		
	}

	@Override
	public void onCollision(List<Collider> colliders) {
		for(var collider : colliders ) {
			if(collider instanceof Tile tile) {
				parent.handleCeilingCollision(tile);
			}
		}
	}

}
