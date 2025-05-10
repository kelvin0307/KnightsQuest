package org.example;

import org.example.entities.buttons.QuitButton;
import org.example.entities.buttons.SelectLevelButton;
import org.example.entities.buttons.SettingsButton;
import org.example.entities.buttons.StartGameButton;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

/**
 * Het hoofdmenu van het Knight's Quest spel.
 * Bevat navigatieknoppen en achtergrondmuziek.
 */
public class MenuScene extends StaticScene {

	private KnightsQuest knightsquest;

	/**
	 * Maakt een nieuwe menu scene aan
	 * @param knightsquest referentie naar het hoofdspel voor scènetransities
	 */
	public MenuScene(KnightsQuest knightsquest) {
		this.knightsquest = knightsquest;
	}

	/**
	 * Stelt de scene-instellingen in:
	 * - Achtergrondafbeelding (titlescreen.jpg)
	 * - Achtergrondmuziek (time_for_adventure.mp3)
	 */
	@Override
	public void setupScene() {
		setBackgroundImage("images/titlescreen.jpg");
		setBackgroundAudio("music/time_for_adventure.mp3");
	}

	/**
	 * Plaatst alle menu-entiteiten:
	 * - Startknop
	 * - Levelselectieknop
	 * - Instellingenknop
	 * - Afsluitknop
	 *
	 * Knoppen worden gecentreerd en gelijkmatig verdeeld
	 */
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
