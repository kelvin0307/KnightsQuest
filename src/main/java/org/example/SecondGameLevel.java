package org.example;

import org.example.entities.knight.KnightComposition;
import org.example.entities.tiles.IceTile;
import org.example.entities.tiles.PredefinedTileSets;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;

public class SecondGameLevel extends DynamicScene{
	private KnightComposition knight;
	private final KnightsQuest knightsquest;
	
	public SecondGameLevel(KnightsQuest knightsquest) {
		this.knightsquest = knightsquest;
	}
	
	@Override
	public void setupScene() {
		setBackgroundImage("images/greenworld/water.png");
	}

	@Override
	public void setupEntities() {
		knight = new KnightComposition(new Coordinate2D(0, 0), knightsquest);
		addEntity(knight);
		
		for (var tile : PredefinedTileSets.eerstePlatform2()) addEntity(tile);
		for (var tile : PredefinedTileSets.tweedePlatform2()) addEntity(tile);
		for (var tile : PredefinedTileSets.derdePlatform2()) addEntity(tile);
		for (var tile : PredefinedTileSets.vierdePlatform2()) addEntity(tile);
		for (var tile : PredefinedTileSets.vijfdePlatform2()) addEntity(tile);
		for (var tile : PredefinedTileSets.zesdePlatform2()) addEntity(tile);
		for (var tile : PredefinedTileSets.zevendePlatform2()) addEntity(tile);
		for(var tile : PredefinedTileSets.achtstePlatform2()) addEntity(tile);
		
		var firstJumpTile = new IceTile(new Coordinate2D(680, 600), new Size(48, 48));
		addEntity(firstJumpTile);
		
		var secondJumpTile = new IceTile(new Coordinate2D(800, 500), new Size(48,48));
		addEntity(secondJumpTile);
		
		var thirdJumpTile = new IceTile(new Coordinate2D(920, 400), new Size(48, 48));
		addEntity(thirdJumpTile);
	}

}
