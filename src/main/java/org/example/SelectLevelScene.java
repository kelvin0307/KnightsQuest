package org.example;

import org.example.entities.buttons.FirstLevelButton;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

public class SelectLevelScene extends StaticScene {
	private KnightsQuest knightsQuest;
	
	public SelectLevelScene(KnightsQuest knightsQuest) {
		this.knightsQuest = knightsQuest;
	}
	@Override
	public void setupScene() {
		setBackgroundImage("images/titlescreen.jpg");
		setBackgroundAudio("music/time_for_adventure.mp3");
	}

	@Override
	public void setupEntities() {
		var level1Button = new FirstLevelButton(new Coordinate2D(200, 200), knightsQuest);
		addEntity(level1Button);
		
		
	}

}
