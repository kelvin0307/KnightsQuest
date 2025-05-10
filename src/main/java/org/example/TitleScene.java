package org.example;

import org.example.entities.buttons.StartButton;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * Het titelscherm van Knight's Quest met game logo en startknop.
 * Toont de game branding en biedt toegang tot het hoofdmenu.
 */
public class TitleScene extends StaticScene{

	private KnightsQuest knightsquest;

	/**
	 * Maakt een nieuwe titelscene aan
	 * @param knightsquest referentie naar het hoofdspel voor navigatie
	 */
	public TitleScene(KnightsQuest knightsquest) {
		this.knightsquest = knightsquest;
	}

	/**
	 * Initialiseert scene-instellingen:
	 * - Achtergrondafbeelding (titlescreen.jpg)
	 * - Achtergrondmuziek (time_for_adventure.mp3)
	 */
	@Override
	public void setupScene() {
		System.out.println(getClass().getResource("/images/titlescreen.jpg"));
		setBackgroundImage("images/titlescreen.jpg");
		setBackgroundAudio("music/time_for_adventure.mp3");
	}

	/**
	 * Plaatst entiteiten in de scene:
	 * - Game titel tekst
	 * - Startknop
	 */
	@Override
	public void setupEntities() {
		var knightsQuestText = new TextEntity(new Coordinate2D(getWidth() /2, getHeight() /2), "Knight's Quest");
		knightsQuestText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		knightsQuestText.setFill(Color.ORANGE);
		
		System.out.println(getClass().getResource("/fonts/PixelOperator8.ttf"));
		Font PixelOperator8 = Font.loadFont(
			    getClass().getResource("/fonts/PixelOperator8-Bold.ttf").toExternalForm(), 
			    80
			);
		knightsQuestText.setFont(PixelOperator8);
		addEntity(knightsQuestText);
		
		var startButton = new StartButton(new Coordinate2D(getWidth() / 2, getHeight() / 1.5), knightsquest);
		startButton.setAnchorPoint(AnchorPoint.BOTTOM_CENTER);
		addEntity(startButton);
	}

}
