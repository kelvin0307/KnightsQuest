package org.example;

import org.example.entities.buttons.FirstLevelButton;
import org.example.entities.text.Level1Text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
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
		
		var level1Text = new Level1Text(new Coordinate2D(250, 125), new Size(64, 64));
		addEntity(level1Text);
	}

}
