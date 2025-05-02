package org.example.entities.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

public class GrassTile extends Tile implements Collider {

	public GrassTile (Coordinate2D initialLocation, Size size) {
		super ("images/greenworld/greenTile.png",initialLocation, size);
		// TODO Auto-generated constructor stub
	}

}
