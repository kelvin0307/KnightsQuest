package org.example.entities.tiles;

import java.util.ArrayList;
import java.util.List;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class TileGenerator {
 
	public static final int TILE_SIZE = 64;

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
	                }
	            }
	        }

	    return tiles;
	}

}
