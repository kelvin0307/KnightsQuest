package org.example.entities.knight;



import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;

import javafx.scene.paint.Color;

public abstract class KnightCollisionBox extends RectangleEntity implements Collided {

	protected final KnightComposition parent;
	
	public KnightCollisionBox(Coordinate2D initialLocation, final KnightComposition parent, Size size) {
		super(initialLocation, size);
		this.parent = parent;
		setFill(Color.RED);
	}

}
