package org.example.entities.tiles;

import java.util.ArrayList;
import java.util.List;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class TileGenerator {
 
	private static final int TILE_SIZE = 48;

	public static List<Tile> generateTiles(int[][] map, int startX, int startY) {
	    List<Tile> tiles = new ArrayList<>();

	    for (int y = 0; y < map.length; y++) {
	        for (int x = 0; x < map[y].length; x++) {
	            int tileType = map[y][x];

	            Coordinate2D location = new Coordinate2D(
	                startX + (x * TILE_SIZE),
	                startY + (y * TILE_SIZE)
	            );
	            Size size = new Size(TILE_SIZE, TILE_SIZE);

	            switch (tileType) {
	                case 0 -> tiles.add(new GrassTile(location, size));
	                case 1 -> tiles.add(new RockTile(location, size));
	                case 2 -> tiles.add(new DirtTile(location, size));
	                case 3 -> tiles.add(new IceTile(location, size));
	                case 4 -> tiles.add(new StoneTile(location, size));
	                case 5 -> tiles.add(new StoneRockTile(location, size));
	                case 6 -> tiles.add(new BridgeTile(location, size));
	                case 7 -> tiles.add(new BlueIceTile(location, size));
	                case 8 -> tiles.add(new BlueIceTopTile(location, size));
	                case 9 -> tiles.add(new OrangeTopTile(location, size));
	                case 10 -> tiles.add(new OrangeStoneTile(location, size));
	                case 11 -> tiles.add(new OrangeRockTile(location, size));
	                case 50 -> {}
	                	
	                	
	            
	        }

	    
	}
	    
}
	    return tiles;
	}
}
