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
 * De primaire startknop die het eigenlijke spel lanceert.
 * Biedt visuele feedback en start het hoofdspel in scene 2.
 */
public class StartGameButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

	private KnightsQuest knightsquest;

	/**
	 * Initialiseert een nieuwe startknop
	 * @param initialLocation positie (x,y) voor de knop
	 * @param knightsquest hoofdspelinstantie voor scenebeheer
	 */
	public StartGameButton(Coordinate2D initialLocation, KnightsQuest knightsquest) {
		super(initialLocation, "Start Game");
		this.knightsquest = knightsquest;
		setFill(Color.ORANGE);
		 Font pixelFont = Font.loadFont(
		            getClass().getResource("/fonts/PixelOperator8-Bold.ttf").toExternalForm(),
		            50 
		        );
		 setFont(pixelFont);
	}

	/**
	 * Reset de knopstijl bij muisverlating
	 */
	@Override
	public void onMouseExited() {
		setFill(Color.ORANGE);
		setCursor(Cursor.DEFAULT);
	}

	/**
	 * Activeert hover-effect bij muisovergang
	 */
	@Override
	public void onMouseEntered() {
		setFill(Color.YELLOW);
		setCursor(Cursor.HAND);
	}

	/**
	 * Start het hoofdspel in scene 2 bij klikken
	 * @param button gebruikt muisknop
	 * @param coordinate2d positie van de klik
	 */
	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) {
		knightsquest.setActiveScene(2);
	}

}
