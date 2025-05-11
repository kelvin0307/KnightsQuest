package org.example;

import org.example.entities.Coin;
import org.example.entities.CoinManager;
import org.example.entities.FirstFlag;
import org.example.entities.HealthManager;
import org.example.entities.knight.KnightComposition;
import org.example.entities.slime.GreenSlime;
import org.example.entities.slime.PurpleSlime;
import org.example.entities.tiles.PredefinedTileSets;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

import javafx.scene.paint.Color;

/**
 * Het eerste level van het spel, met platforms, vijanden en verzamelobjecten.
 * Een niet-scrollbaar level met meerdere uitdagingen voor de speler.
 */
public class FirstGameLevel extends DynamicScene {

	private KnightComposition knight;
	private final KnightsQuest knightsquest;
	private HealthManager healthManager;
	private CoinManager coinManager;
	
	public FirstGameLevel(KnightsQuest knightsquest, HealthManager healthManager) {
		this.knightsquest = knightsquest;
		this.healthManager = healthManager;
	}

	/**
	 * Stelt de basisinstellingen van het level in:
	 * - Zwarte achtergrond
	 */
	@Override
	public void setupScene() {
		setBackgroundImage("images/greenworld/forest.png");
	}

	/**
	 * Plaatst alle entiteiten in het level:
	 * - Platforms en obstakels
	 * - De speler (ridder)
	 * - Vijanden (slijmmonsters)
	 * - Verzamelobjecten (munten)
	 */
	@Override
	public void setupEntities() {
		for (var tile : PredefinedTileSets.hoofdPlatform1()) addEntity(tile);
		for (var tile : PredefinedTileSets.tweedePlatform1()) addEntity(tile);
		for (var tile : PredefinedTileSets.eersteSprong1()) addEntity(tile);
		for (var tile : PredefinedTileSets.derdePlatform1()) addEntity(tile);

		var coin1 = new Coin(new Coordinate2D(500, 550));
		addEntity(coin1);
		
		var coin2 = new Coin(new Coordinate2D(670, 850));
		addEntity(coin2);
		
		var coin3 = new Coin(new Coordinate2D(720, 850));
		addEntity(coin3);
		
		var coin4 = new Coin(new Coordinate2D(1200, 440));
		addEntity(coin4);
		
		coinManager = new CoinManager(4);
		addEntity(coinManager.getDisplay());

		knight = new KnightComposition(new Coordinate2D(0, 0), knightsquest, healthManager, coinManager);
		addEntity(knight);
		
		healthManager.reset();
		for(var heart : healthManager.getHearts()) {
			addEntity(heart);
		}
		
		var purpleSlime = new PurpleSlime(new Coordinate2D(710, 500));
		addEntity(purpleSlime);

		var greenSlime = new GreenSlime(new Coordinate2D(900, 400));
		addEntity(greenSlime);

		var flag = new FirstFlag(new Coordinate2D(1600, 400));
		addEntity(flag);
	}
}
