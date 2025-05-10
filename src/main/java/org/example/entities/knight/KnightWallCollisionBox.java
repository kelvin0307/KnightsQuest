package org.example.entities.knight;

import java.util.List;

import org.example.KnightsQuest;
import org.example.entities.tiles.Tile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

public class KnightWallCollisionBox extends KnightCollisionBox {

	
	public KnightWallCollisionBox(Coordinate2D initialLocation, KnightComposition knightcomposition) {
		super(initialLocation, knightcomposition, new Size(5, 50));
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCollision(List<Collider> collidingObjects) {
		for(var collider : collidingObjects) {
			if(collider instanceof Tile tile) {
				parent.handleWallCollision(tile);
			}
		}
	}

}
