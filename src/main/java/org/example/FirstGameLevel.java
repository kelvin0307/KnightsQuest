package org.example;

import org.example.entities.objects.Floor;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;

import javafx.scene.paint.Color;

public class FirstGameLevel extends DynamicScene {

	@Override
	public void setupScene() {
		setBackgroundColor(Color.BLACK);
	}

	@Override
	public void setupEntities() {
		var bottomFloor = new Floor(new Coordinate2D(0, 670), 
				new Size(550, 10));
		addEntity(bottomFloor);
		
	}

}
