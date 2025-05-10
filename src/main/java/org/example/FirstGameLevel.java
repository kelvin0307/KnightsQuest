package org.example;
import org.example.entities.Coin;
import org.example.entities.FirstFlag;
import org.example.entities.knight.KnightComposition;
import org.example.entities.slime.GreenSlime;
import org.example.entities.slime.PurpleSlime;
import org.example.entities.tiles.PredefinedTileSets;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

import javafx.scene.paint.Color;

public class FirstGameLevel extends DynamicScene  {

	private KnightComposition knight;
	private final KnightsQuest knightsquest;
	
	public FirstGameLevel(KnightsQuest knightsquest) {
		this.knightsquest = knightsquest;
	}

	@Override
	public void setupScene() {
		setBackgroundColor(Color.BLACK);
		}

	@Override
	public void setupEntities() {
	
	    for(var tile : PredefinedTileSets.hoofdPlatform()) addEntity(tile);
	    for(var tile : PredefinedTileSets.tweedePlatform()) addEntity(tile);
	    for(var tile : PredefinedTileSets.eersteSprong()) addEntity(tile);
	    for(var tile : PredefinedTileSets.derdePlatform()) addEntity(tile);
	    
	    var coin = new Coin(new Coordinate2D(500, 550));
	    addEntity(coin);

		knight = new KnightComposition(new Coordinate2D(0, 0), knightsquest);
		addEntity(knight);
	

		var purpleSlime = new PurpleSlime(new Coordinate2D(710, 500));
		addEntity(purpleSlime);

		var greenSlime = new GreenSlime(new Coordinate2D(1100, 400));
		addEntity(greenSlime);
		
		var flag = new FirstFlag(new Coordinate2D(1600, 400));
		addEntity(flag);

	}



}