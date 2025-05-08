package org.example;
import org.example.entities.Coin;
import org.example.entities.knight.Knight;
import org.example.entities.knight.KnightComposition;
import org.example.entities.slime.GreenSlime;
import org.example.entities.slime.PurpleSlime;
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

		var knight = new KnightComposition(new Coordinate2D(0, 0));
		addEntity(knight);

		var purpleSlime = new PurpleSlime(new Coordinate2D(800, 500));
		addEntity(purpleSlime);

		var greenSlime = new GreenSlime(new Coordinate2D(1100, 400));
		addEntity(greenSlime);
	}


}
