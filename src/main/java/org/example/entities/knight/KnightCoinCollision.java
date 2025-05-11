package org.example.entities.knight;

import java.util.List;

import org.example.entities.Coin;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;

public class KnightCoinCollision extends RectangleEntity implements Collided{
	private final KnightComposition knight;
	
	public KnightCoinCollision(Coordinate2D initialPosition, Size size, KnightComposition knight) {
		super(initialPosition, size);
		this.knight = knight;
	}

	@Override
	public void onCollision(List<Collider> collidingObjects) {
		for(Collider other : collidingObjects) {
			if(other instanceof Coin coin) {
				knight.handleCoinCollision(coin);
			}
		}
	}

}
