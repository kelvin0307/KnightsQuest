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

public class StartGameButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
	private KnightsQuest knightsquest;
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
	@Override
	public void onMouseExited() {
		setFill(Color.ORANGE);
		setCursor(Cursor.DEFAULT);
	}
	@Override
	public void onMouseEntered() {
		setFill(Color.YELLOW);
		setCursor(Cursor.HAND);
	}
	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) {
		knightsquest.setActiveScene(0);
	}

}
