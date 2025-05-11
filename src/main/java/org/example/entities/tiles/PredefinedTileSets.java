package org.example.entities.tiles;

import java.util.List;

/**
 * Bevat vooraf gedefinieerde tegelopstellingen voor levels.
 * Elke methode maakt een specifiek platform of levelgedeelte aan.
 */
public class PredefinedTileSets {

    public static List<Tile> hoofdPlatform1() {
    	int[][] map = {
    			{50, 50, 0, 0, 50, 50, 50},
    			{50, 1, 2, 2, 50, 50, 50},
    			{0, 0, 2, 2, 3, 3, 3, 6, 6, 6, 3, 3, 50, 50, 8, 8},
    			{2, 2, 2, 1, 4, 5, 4, 50, 50, 50, 4, 5, 50, 50, 7, 7},
    			{2, 1, 2, 2, 5, 4, 4, 50, 50, 50, 4, 4, 50, 50, 7, 7}
    			
    	};
    	return TileGenerator.generateTiles(map, 0, 800);
    }
    
    public static List<Tile> eersteSprong1(){
    	int[][] map = {
    			{0}
    };
    	return TileGenerator.generateTiles(map, 200, 700);
    }
    	
    	
    public static List<Tile> tweedePlatform1() {
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
  
    public static List<Tile> derdePlatform1(){
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
   
    public static List<Tile> eerstePlatform2() {
    	int[][] map = {
    			{8, 50, 50, 50, 50, 50},
    			{7, 8, 50, 50, 50, 50},
    			{5, 5, 50, 3, 50, 50},
    			{4, 5, 50, 5, 50, 4},
    			{50, 50, 50, 50, 50, 5},
    			{50, 50, 50, 50, 50, 5}
    	};
    	return TileGenerator.generateTiles(map, 0, 50);
    }

    public static List<Tile> tweedePlatform2() {
    	int[][] map = {
    			{4, 50, 50, 50, 50, 50, 50},
    			{50, 4, 50, 50, 50, 50, 50},
    			{50, 5, 4, 50, 4, 6, 4},
    			{50, 5, 50, 50, 50, 50, 50, 50}
    	};
    	return TileGenerator.generateTiles(map, 50, 400);
    }
    
    public static List<Tile> derdePlatform2() {
    	int[][] map = {
    			{4, 4, 50, 4, 4, 4, 50, 50, 50, 7},
    			{50, 50, 50, 50, 50, 50, 5, 4, 50, 50, 50},
    			{50, 50, 50, 50, 50, 50, 50, 5, 4, 50, 50},
    			{50, 50, 50, 50, 50, 50, 50, 50, 5, 4, 50},
    			{50, 50, 50, 50, 50, 50, 50, 50, 50, 5, 4}
    	};
    	return TileGenerator.generateTiles(map, 0, 700);
    }
    
    public static List<Tile> vierdePlatform2() {
    	int[][] map = {
    			{50, 50, 3, 3, 50, 50},
    			{50, 50, 4, 4, 50, 50},
    			{50, 3, 5, 5, 3},
    			{3, 5, 5, 5, 5, 3}
    	};
    	return TileGenerator.generateTiles(map, 675, 725);
    }
    
    public static List<Tile> vijfdePlatform2(){
    	int[][] map = {
    			{8, 8, 50, 50},
    			{7, 7, 50, 50},
    			{7, 7, 8, 50},
    			{50, 3, 3, 3}
    	};
    	return TileGenerator.generateTiles(map, 600, 200);
    }
    
    public static List<Tile> zesdePlatform2() {
    	int[][] map = {
    			{8, 8, 50, 8, 50, 8, 50, 50, 8}
    	};
    	return TileGenerator.generateTiles(map, 850, 200);
    }
    
    public static List<Tile> zevendePlatform2() {
    	int[][] map = {
    			{3, 50, 3, 50, 50, 50, 50},
    			{4, 3, 4, 50, 50, 50, 3},
    			{5, 5, 5, 50, 3, 50, 4},
    			{5, 50, 50, 50, 4, 50, 5}
    	};
    	return TileGenerator.generateTiles(map, 1150, 400);
    }
    
    public static List<Tile> achtstePlatform2() {
    	int[][] map = {
    			{50, 50, 50, 50, 50, 50, 50, 50, 50, 3},
    			{3, 50, 50, 50, 50, 50, 50, 50, 50, 4},
    			{4, 3, 50, 50, 50, 50, 50, 50, 50, 50, 4},
    			{5, 5, 3, 50, 3, 3, 50, 50, 50, 5},
    			{5, 5, 5, 3, 5, 5, 3, 3, 3, 5}
    	};
    	return TileGenerator.generateTiles(map, 1100, 725);
    }
}
