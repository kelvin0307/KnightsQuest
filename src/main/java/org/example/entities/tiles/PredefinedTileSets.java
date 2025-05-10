package org.example.entities.tiles;

import java.util.List;

public class PredefinedTileSets {

    public static List<Tile> hoofdPlatform() {
    	int[][] map = {
    			{50, 50, 0, 0, 50, 50, 50},
    			{50, 1, 2, 2, 50, 50, 50},
    			{0, 0, 2, 2, 3, 3, 3, 6, 6, 6, 3, 3, 50, 50, 8, 8},
    			{2, 2, 2, 1, 4, 5, 4, 50, 50, 50, 4, 5, 50, 50, 7, 7},
    			{2, 1, 2, 2, 5, 4, 4, 50, 50, 50, 4, 4, 50, 50, 7, 7}
    			
    	};
    	return TileGenerator.generateTiles(map, 0, 800);
    }
    
    public static List<Tile> eersteSprong(){
    	int[][] map = {
    			{0}
    };
    	return TileGenerator.generateTiles(map, 200, 700);
    }
    	
    	
    public static List<Tile> tweedePlatform() {
    	int[][] map = {
    			{50, 50, 0, 0, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50},
    			{50, 0, 2, 2, 50, 50, 50, 50, 50, 0, 0, 50, 50, 50, 50},
    			{1, 2, 1, 2, 0, 0, 6, 6, 0, 2, 2, 0, 50, 50, 50},
    			{50, 50, 50, 50, 2, 1, 50, 50, 1, 2, 1, 1, 9, 9, 9},
    			{50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 11, 10, 10, 11},
    			{50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 10, 10, 11},
    			{ 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 10, 10}
    	};
    	return TileGenerator.generateTiles(map, 300, 550);
    }
  
    public static List<Tile> derdePlatform(){
    	int[][] map = {
    			{3, 50, 5, 5, 50, 50, 50},
    			{50, 50, 50, 50, 50, 50, 0},
    			{50, 50, 50, 50, 50, 3, 4},
    			{50, 50, 50, 50, 9, 50, 50},
    			{50, 50, 3, 9, 50, 50, 50},
    			{50, 0, 1, 4, 50, 50, 50, 50},
    			{3, 5, 50, 50, 50, 50, 50}
    	};
    	return TileGenerator.generateTiles(map, 1200, 500);
    }
   


}
