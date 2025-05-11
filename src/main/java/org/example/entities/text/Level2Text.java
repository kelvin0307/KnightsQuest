package org.example.entities.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.TextEntity;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Level2Text extends TextEntity {

	public Level2Text(Coordinate2D initialLocation, Size size) {
		super(initialLocation, "Level 2");
		setFill(Color.ORANGE);
		 Font pixelFont = Font.loadFont(
		            getClass().getResource("/fonts/PixelOperator8-Bold.ttf").toExternalForm(),
		            50 
		        );
		 setFont(pixelFont);
	}

}
