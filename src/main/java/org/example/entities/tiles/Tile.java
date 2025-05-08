package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class Tile extends SpriteEntity implements Collider{

	public Tile(String resource, Coordinate2D initialLocation, Size size) {
		super(resource, initialLocation, size);
	}

}
