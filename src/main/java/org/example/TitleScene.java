package org.example;

import com.github.hanyaeger.api.scenes.StaticScene;

public class TitleScene extends StaticScene{

	@Override
	public void setupScene() {
		setBackgroundAudio("time_for_adventure.mp3");
		setBackgroundImage("titlescreen.jpg");
	}

	@Override
	public void setupEntities() {
		// TODO Auto-generated method stub
		
	}

}
