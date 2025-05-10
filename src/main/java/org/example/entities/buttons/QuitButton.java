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
 * Een interactieve knop om het spel af te sluiten.
 * Reageert op muisbewegingen en klikken voor een betere gebruikerservaring.
 */
public class QuitButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

	private KnightsQuest knightsquest;

	/**
	 * Maakt een nieuwe Quit-knop aan
	 * @param initialLocation positie (x,y) waar de knop komt
	 * @param knightsquest referentie naar het hoofdspel voor afsluitfunctionaliteit
	 */
	public QuitButton(Coordinate2D initialLocation, KnightsQuest knightsquest) {
		super(initialLocation, "Quit");
		this.knightsquest = knightsquest;
		setFill(Color.ORANGE);
		 Font pixelFont = Font.loadFont(
		            getClass().getResource("/fonts/PixelOperator8-Bold.ttf").toExternalForm(),
		            50 
		        );
		 setFont(pixelFont);
	}

	/**
	 * Wordt aangeroepen wanneer de muis de knop verlaat
	 * Reset de kleur naar standaard
	 */
	@Override
	public void onMouseExited() {
		setFill(Color.ORANGE);
		setCursor(Cursor.DEFAULT);
	}

	/**
	 * Wordt aangeroepen wanneer de muis over de knop beweegt
	 * Verandert kleur en cursor voor hover-effect
	 */
	@Override
	public void onMouseEntered() {
		setFill(Color.YELLOW);
		setCursor(Cursor.HAND);
	}

	/**
	 * Wordt aangeroepen wanneer op de knop wordt geklikt
	 * Sluit het spel af
	 * @param button welke muisknop werd ingedrukt
	 * @param coordinate2d waar op de knop werd geklikt
	 */
	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) {
		knightsquest.quit();
	}

}
