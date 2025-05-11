package org.example;

import org.example.entities.knight.KnightComposition;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

import javafx.scene.paint.Color;

public class SecondGameLevel extends DynamicScene{
	private KnightComposition knight;
	private final KnightsQuest knightsquest;
	
	public SecondGameLevel(KnightsQuest knightsquest) {
		this.knightsquest = knightsquest;
	}
	
	@Override
	public void setupScene() {
		setBackgroundImage("images/greenworld/water.png");
	}

	@Override
	public void setupEntities() {
		knight = new KnightComposition(new Coordinate2D(0, 0), knightsquest);
		addEntity(knight);
	}

}
