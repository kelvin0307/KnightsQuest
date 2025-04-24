package org.example;

import com.github.hanyaeger.api.YaegerGame;

/**
 * Hello world!
 *
 */
public class KnightsQuest extends YaegerGame
{
    public static void main( String[] args )
    {
        launch(args);
    }

    @Override
    public void setupGame() {

    }

    @Override
    public void setupScenes() {
    	addScene(0, new TitleScene());
    }
}
