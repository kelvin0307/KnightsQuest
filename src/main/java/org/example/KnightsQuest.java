package org.example;

import org.example.entities.HealthManager;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

/**
 * De hoofdklasse van het Knight's Quest spel.
 * Beheert het spelvenster en scene-transities.
 */
public class KnightsQuest extends YaegerGame {
    private int currentSceneId = 0;
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
        HealthManager healthManager = new HealthManager(5); 

        addScene(0, new TitleScene(this));
        addScene(1, new MenuScene(this));
        addScene(2, new FirstGameLevel(this, healthManager));
        addScene(3, new SecondGameLevel(this, healthManager)); 
        addScene(4, new SelectLevelScene(this));
    }

    
    public int getActiveSceneId() {
    	return currentSceneId;
    }
    
    @Override
    public void setActiveScene(int id) {
    	this.currentSceneId = id;
    	super.setActiveScene(id);
    }
    
}
