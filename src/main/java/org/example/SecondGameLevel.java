package org.example;

import org.example.entities.FirstFlag;
import org.example.entities.HealthManager;
import org.example.entities.knight.KnightComposition;
import org.example.entities.slime.GreenSlime;
import org.example.entities.slime.PurpleSlime;
import org.example.entities.tiles.IceTile;
import org.example.entities.tiles.PredefinedTileSets;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;

public class SecondGameLevel extends DynamicScene{
	private KnightComposition knight;
	private final KnightsQuest knightsquest;
	private HealthManager healthManager;
	
	public SecondGameLevel(KnightsQuest knightsquest, HealthManager healthManager) {
		this.knightsquest = knightsquest;
		this.healthManager = healthManager;
	}
	
	@Override
	public void setupScene() {
		setBackgroundImage("images/greenworld/water.png");
	}

	@Override
	public void setupEntities() {
		knight = new KnightComposition(new Coordinate2D(0, 0), knightsquest, healthManager);
		addEntity(knight);
		
		healthManager.reset();
		for(var heart : healthManager.getHearts()) {
			addEntity(heart);
		}
		
		for (var tile : PredefinedTileSets.eerstePlatform2()) addEntity(tile);
		for (var tile : PredefinedTileSets.tweedePlatform2()) addEntity(tile);
		for (var tile : PredefinedTileSets.derdePlatform2()) addEntity(tile);
		for (var tile : PredefinedTileSets.vierdePlatform2()) addEntity(tile);
		for (var tile : PredefinedTileSets.vijfdePlatform2()) addEntity(tile);
		for (var tile : PredefinedTileSets.zesdePlatform2()) addEntity(tile);
		for (var tile : PredefinedTileSets.zevendePlatform2()) addEntity(tile);
		for(var tile : PredefinedTileSets.achtstePlatform2()) addEntity(tile);
		
		var firstJumpTile = new IceTile(new Coordinate2D(680, 630), new Size(48, 48));
		addEntity(firstJumpTile);
		
		var secondJumpTile = new IceTile(new Coordinate2D(800, 530), new Size(48,48));
		addEntity(secondJumpTile);
		
		var thirdJumpTile = new IceTile(new Coordinate2D(920, 430), new Size(48, 48));
		addEntity(thirdJumpTile);

		
		var flag = new FirstFlag(new Coordinate2D(1600, 500));
		addEntity(flag);

		var purpleSlime = new PurpleSlime(new Coordinate2D(710, 500));
		addEntity(purpleSlime);

		var greenSlime = new GreenSlime(new Coordinate2D(1300, 600));
		addEntity(greenSlime);
	}
	
	public void resetHealthDisplay() {
	    for (var heart : healthManager.getHearts()) {
	        addEntity(heart);
	    }

	}


}
