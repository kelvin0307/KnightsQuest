package org.example.entities.knight;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;

import javafx.scene.paint.Color;

public class KnightCollidingBox extends RectangleEntity implements Collider {

	public static final double OPACITY = 0;
    private static final Color COLOR = Color.RED;
    
	protected KnightCollidingBox(Coordinate2D initialPosition, Size size) {
		super(initialPosition, size);
		setAnchorPoint(AnchorPoint.BOTTOM_LEFT);
        setFill(COLOR);
        setOpacity(OPACITY);
	}

}
