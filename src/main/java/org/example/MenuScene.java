package org.example;

import org.example.entities.buttons.QuitButton;
import org.example.entities.buttons.SelectLevelButton;
import org.example.entities.buttons.SettingsButton;
import org.example.entities.buttons.StartGameButton;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

public class MenuScene extends StaticScene {
	private KnightsQuest knightsquest;
	
	public MenuScene(KnightsQuest knightsquest) {
		this.knightsquest = knightsquest;
	}
	@Override
	public void setupScene() {
		setBackgroundImage("images/titlescreen.jpg");
		setBackgroundAudio("music/time_for_adventure.mp3");
	}

	@Override
	public void setupEntities() {
	    double buttonSpacing = 125; 
	    double startY = getHeight() / 3; 
	    double centerX = getWidth() / 2;

	    var startGameButton = new StartGameButton(new Coordinate2D(centerX, startY), knightsquest);
	    startGameButton.setAnchorPoint(AnchorPoint.TOP_CENTER);
	    addEntity(startGameButton);

	    var selectLevelButton = new SelectLevelButton(new Coordinate2D(centerX, startY + buttonSpacing), knightsquest);
	    selectLevelButton.setAnchorPoint(AnchorPoint.TOP_CENTER);
	    addEntity(selectLevelButton);

	    var settingsButton = new SettingsButton(new Coordinate2D(centerX, startY + 2 * buttonSpacing), knightsquest);
	    settingsButton.setAnchorPoint(AnchorPoint.TOP_CENTER);
	    addEntity(settingsButton);

	    var quitButton = new QuitButton(new Coordinate2D(centerX, startY + 3 * buttonSpacing), knightsquest);
	    quitButton.setAnchorPoint(AnchorPoint.TOP_CENTER);
	    addEntity(quitButton);
	}


}
