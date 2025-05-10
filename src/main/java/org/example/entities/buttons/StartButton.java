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
 * De hoofdstartknop om het spel te beginnen.
 * Biedt interactieve feedback en start het hoofdlevel.
 */
public class StartButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener{

	private KnightsQuest knightsquest;

	/**
	 * Maakt een nieuwe startknop aan
	 * @param initialLocation positie (x,y) in het scherm
	 * @param knightsquest hoofdspelreferentie voor scènewisseling
	 */
	public StartButton(Coordinate2D initialLocation, KnightsQuest knightsquest) {
		super(initialLocation, "Play Game");
		this.knightsquest = knightsquest;
		setFill(Color.ORANGE);
		 Font pixelFont = Font.loadFont(
		            getClass().getResource("/fonts/PixelOperator8-Bold.ttf").toExternalForm(),
		            50 
		        );
		 setFont(pixelFont);
	}

	/**
	 * Reset de knopstijl wanneer de muis weg beweegt
	 */
	@Override
	public void onMouseExited() {
		setFill(Color.ORANGE);
		setCursor(Cursor.DEFAULT);
		
	}

	/**
	 * Activeert hover-effect wanneer de muis over de knop beweegt
	 */
	@Override
	public void onMouseEntered() {
		setFill(Color.YELLOW);
		setCursor(Cursor.HAND);
		
	}

	/**
	 * Start het hoofdspel bij klikken
	 * @param button gebruikt muisknop
	 * @param coordinate2d kliklocatie
	 */
	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) {
		knightsquest.setActiveScene(1);
	}

}
