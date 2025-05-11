package org.example.entities.buttons;

import org.example.KnightsQuest;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;

import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * Een interactieve knop om naar het levelselectiescherm te gaan.
 * Reageert op muisinteracties voor een betere gebruikerservaring.
 */
public class SelectLevelButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

	private KnightsQuest knightsquest;

	/**
	 * Maakt een nieuwe levelselectie-knop aan
	 * @param initialLocation positie (x,y) waar de knop komt
	 * @param knightsquest referentie naar het hoofdspel voor scènewisseling
	 */
	public SelectLevelButton(Coordinate2D initialLocation, KnightsQuest knightsquest) {
		super(initialLocation, "Select Level");
		this.knightsquest = knightsquest;
		setFill(Color.ORANGE);
		 Font pixelFont = Font.loadFont(
		            getClass().getResource("/fonts/PixelOperator8-Bold.ttf").toExternalForm(),
		            50 
		        );
		 setFont(pixelFont);
	}

	/**
	 * Reset de knop wanneer de muis weg beweegt
	 */
	@Override
	public void onMouseExited() {
		setFill(Color.ORANGE);
		setCursor(Cursor.DEFAULT);
	}

	/**
	 * Toont hover-effect wanneer de muis over de knop gaat
	 */
	@Override
	public void onMouseEntered() {
		setFill(Color.YELLOW);
		setCursor(Cursor.HAND);
	}

	/**
	 * Voert actie uit bij klikken
	 * @param button de muisknop die ingedrukt werd
	 * @param coordinate2d de positie van de klik
	 */
	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) {
		knightsquest.setActiveScene(4);
	}

}
