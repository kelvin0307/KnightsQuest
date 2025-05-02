package org.example;

import org.example.entities.Coin;
import org.example.entities.knight.Player;
import org.example.entities.objects.Floor;
import org.example.entities.tiles.PredefinedTileSets;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.ScrollableDynamicScene;

import javafx.scene.paint.Color;

public class FirstGameLevel extends ScrollableDynamicScene {

	@Override
	public void setupScene() {
		setBackgroundColor(Color.BLACK);
		setSize(new Size(3840, 1080));
		
		}

	@Override
	public void setupEntities() {

	    var bottomFloor = new Floor(new Coordinate2D(0, 670), new Size(550, 10));
	    addEntity(bottomFloor);

	    for (var tile : PredefinedTileSets.hoofdVloer()) addEntity(tile);
	    for (var tile : PredefinedTileSets.opstapLinks()) addEntity(tile);
	    for (var tile : PredefinedTileSets.middenPlatform()) addEntity(tile);
	    for (var tile : PredefinedTileSets.hogeSprong()) addEntity(tile);
	    for (var tile : PredefinedTileSets.rechterPlateau()) addEntity(tile);
	    for (var tile : PredefinedTileSets.trapOmhoog()) addEntity(tile);
	    for (var tile : PredefinedTileSets.bovenstePlatform()) addEntity(tile);
	    for (var tile : PredefinedTileSets.gatInDeGrond()) addEntity(tile);
	    for (var tile : PredefinedTileSets.zwevendPlatform()) addEntity(tile);
	    for (var tile : PredefinedTileSets.langeSprong()) addEntity(tile);
	    for (var tile : PredefinedTileSets.rechtsKlim()) addEntity(tile);
	    for (var tile : PredefinedTileSets.finalePlatform()) addEntity(tile);
	    
	    var coin = new Coin(new Coordinate2D(500, 550));
	    addEntity(coin);

		var player = new Player(new Coordinate2D(200, 700));
		addEntity(player);


	}


}
