package org.example.entities.buttons;

import org.example.KnightsQuest;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;

import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;

/**
 * Een knop die de speler naar het tweede niveau van het spel brengt wanneer erop wordt geklikt.
 * Verandert de cursor wanneer de muis over de knop beweegt.
 */
public class SecondLevelButton extends SpriteEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener{

	private KnightsQuest knightsQuest;

	/**
	 * Maakt een nieuwe knop voor het tweede niveau van het spel.
	 *
	 * @param initialLocation De startlocatie van de knop.
	 * @param knightsQuest De {@code KnightsQuest} instantie die het spel beheert.
	 */
	public SecondLevelButton(Coordinate2D initialLocation, KnightsQuest knightsQuest) {
		super("images/level2.png", initialLocation, new Size(500, 750));
		this.knightsQuest = knightsQuest;
	}

	/**
	 * Verandert de cursor naar de standaardcursor wanneer de muis de knop verlaat.
	 */
	@Override
	public void onMouseExited() {
		setCursor(Cursor.DEFAULT);
	}

	/**
	 * Verandert de cursor naar een handcursor wanneer de muis over de knop beweegt.
	 */
	@Override
	public void onMouseEntered() {
		setCursor(Cursor.HAND);
	}

	/**
	 * Verandert het actieve scene naar het tweede niveau wanneer de knop wordt ingedrukt.
	 *
	 * @param button De muisknop die ingedrukt werd.
	 * @param coordinate2d De locatie van de muisklik.
	 */
	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) {
		knightsQuest.setActiveScene(3);

	}
}
