package org.example;

import org.example.entities.buttons.FirstLevelButton;
import org.example.entities.buttons.SecondLevelButton;
import org.example.entities.text.Level1Text;
import org.example.entities.text.Level2Text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.StaticScene;

/**
 * De scene waarin de speler een level kan kiezen.
 * Bevat knoppen en tekst voor het starten van level 1 en level 2.
 */
public class SelectLevelScene extends StaticScene {

	private KnightsQuest knightsQuest;

	/**
	 * Maakt een nieuwe {@code SelectLevelScene} aan.
	 *
	 * @param knightsQuest De hoofdapplicatie van het spel.
	 */
	public SelectLevelScene(KnightsQuest knightsQuest) {
		this.knightsQuest = knightsQuest;
	}

	/**
	 * Stelt de achtergrondafbeelding en achtergrondmuziek van het levelselectiescherm in.
	 */
	@Override
	public void setupScene() {
		setBackgroundImage("images/titlescreen.jpg");
		setBackgroundAudio("music/time_for_adventure.mp3");
	}

	/**
	 * Voegt knoppen en tekst toe voor het selecteren van level 1 en level 2.
	 */
	@Override
	public void setupEntities() {
		var level1Button = new FirstLevelButton(new Coordinate2D(200, 200), knightsQuest);
		addEntity(level1Button);
		
		var level1Text = new Level1Text(new Coordinate2D(250, 125), new Size(64, 64));
		addEntity(level1Text);
		
		var level2Button = new SecondLevelButton(new Coordinate2D(1200, 200), knightsQuest);
		addEntity(level2Button);
		
		var level2Text = new Level2Text(new Coordinate2D(1250, 125), new Size(64, 64));
		addEntity(level2Text);
	}

}
