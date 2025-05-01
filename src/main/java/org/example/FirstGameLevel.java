package org.example;

import org.example.entities.objects.Floor;
import org.example.entities.tiles.GrassTile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.ScrollableDynamicScene;

import javafx.scene.paint.Color;

public class FirstGameLevel extends ScrollableDynamicScene {

	@Override
	public void setupScene() {
		setBackgroundColor(Color.BLACK);
	}

	@Override
	public void setupEntities() {
		var bottomFloor = new Floor(new Coordinate2D(0, 670), 
				new Size(550, 10));
		addEntity(bottomFloor);
		
		
		int[][] map = {
				{0, 0, 0, 0},
				{0, 0, 0},
				{0, 0, 0, 0}
		};
		
		int tileSize = 64;
		for(int y = 0; y < map.length; y++) {
			for(int x = 0; x < map[y].length; x++) {
				Coordinate2D location = new Coordinate2D(x * tileSize, y * tileSize);
				Size size = new Size(tileSize, tileSize);
				
				if(map[y][x] == 0) {
					addEntity(new GrassTile(location, size));
				}
			}
		}
	}

}
