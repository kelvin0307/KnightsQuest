package org.example;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

/**
 * De hoofdklasse van het Knight's Quest spel.
 * Beheert het spelvenster en scene-transities.
 */
public class KnightsQuest extends YaegerGame
{
    /**
     * Main methode om het spel te starten
     * @param args command line argumenten
     */
    public static void main(String[] args)
    {
        launch(args);
    }

    /**
     * Stelt basis spelinstellingen in:
     * - Titel van het spel
     * - Grootte van het spelvenster (1920x1080 - Full HD)
     */
    @Override
    public void setupGame() {
    	setGameTitle("Knight's Quest");
    	setSize(new Size(1920, 1080));
    }

    /**
     * Initialiseert alle scenes van het spel:
     * 0 - Titelscherm
     * 1 - Menuscherm
     * 2 - Eerste level
     */
    @Override
    public void setupScenes() {
    	addScene(0, new TitleScene(this));
    	addScene(1, new MenuScene(this));
    	addScene(2, new FirstGameLevel(this));
    	addScene(3, new SecondGameLevel(this));
    }
}
