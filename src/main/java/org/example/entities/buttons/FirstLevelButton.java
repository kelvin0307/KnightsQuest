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
import javafx.scene.paint.Color;

public class FirstLevelButton extends SpriteEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener{
	private KnightsQuest knightsQuest;
	
	public FirstLevelButton(Coordinate2D initialLocation, KnightsQuest knightsQuest) {
		super("images/level1.png", initialLocation, new Size(500, 750));
		this.knightsQuest = knightsQuest;
		
	}

	@Override
	public void onMouseExited() {
		setCursor(Cursor.DEFAULT);
	}

	@Override
	public void onMouseEntered() {
		setCursor(Cursor.HAND);
	}

	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) {
		knightsQuest.setActiveScene(2);;
	}

}
