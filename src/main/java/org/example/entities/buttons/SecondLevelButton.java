package org.example.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;

import javafx.scene.input.MouseButton;

public class SecondLevelButton extends SpriteEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener{

	protected SecondLevelButton(Coordinate2D initialLocation) {
		super("images/level2.png", initialLocation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onMouseExited() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMouseEntered() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) {
		// TODO Auto-generated method stub
		
	}

}
