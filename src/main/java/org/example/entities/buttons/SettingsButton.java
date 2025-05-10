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
 * Een interactieve instellingenknop voor het hoofdmenu.
 * Biedt visuele feedback bij muisinteracties en navigeert naar instellingenscherm.
 */
public class SettingsButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

	private KnightsQuest knightsquest;

	/**
	 * Maakt een nieuwe instellingenknop aan
	 * @param initialLocation positie (x,y) in het scherm
	 * @param knightsquest hoofdspelreferentie voor scènemanagement
	 */
	public SettingsButton(Coordinate2D initialLocation, KnightsQuest knightsquest) {
		super(initialLocation, "Settings");
		this.knightsquest = knightsquest;
		setFill(Color.ORANGE);
		 Font pixelFont = Font.loadFont(
		            getClass().getResource("/fonts/PixelOperator8-Bold.ttf").toExternalForm(),
		            50 
		        );
		 setFont(pixelFont);
	}

	/**
	 * Reset knopstijl bij muisverlatingsgebeurtenis
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
	 * Behandelt klikgebeurtenis - navigeert naar instellingenscherm
	 * @param button gebruikt muisknop
	 * @param coordinate2d kliklocatie
	 */
	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) {
		knightsquest.setActiveScene(0);
	}

}
