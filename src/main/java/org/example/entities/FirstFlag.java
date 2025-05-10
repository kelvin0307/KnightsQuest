package org.example.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class FirstFlag extends SpriteEntity implements Collider {

	public FirstFlag(Coordinate2D initialLocation) {
		super("images/greenworld/flag.png", initialLocation, new Size(100, 400));
		// TODO Auto-generated constructor stub
	}

}
