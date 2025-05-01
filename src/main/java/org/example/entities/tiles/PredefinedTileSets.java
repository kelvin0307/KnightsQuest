package org.example.entities.tiles;

import java.util.List;

public class PredefinedTileSets {

    public static List<Tile> hoofdVloer() {
        int[][] map = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        return TileGenerator.generateTiles(map, 0, 880);
    }

    public static List<Tile> opstapLinks() {
        int[][] map = {
            {0, 0}
        };
        return TileGenerator.generateTiles(map, 100, 816); // iets hoger
    }

    public static List<Tile> middenPlatform() {
        int[][] map = {
            {0, 0, 0}
        };
        return TileGenerator.generateTiles(map, 300, 720);
    }

    public static List<Tile> hogeSprong() {
        int[][] map = {
            {0}
        };
        return TileGenerator.generateTiles(map, 500, 600);
    }

    public static List<Tile> rechterPlateau() {
        int[][] map = {
            {0, 0, 0, 0}
        };
        return TileGenerator.generateTiles(map, 700, 720);
    }

    public static List<Tile> trapOmhoog() {
        int[][] map = {
            {0},
            {0},
            {0}
        };
        return TileGenerator.generateTiles(map, 1024, 680);
    }

    public static List<Tile> bovenstePlatform() {
        int[][] map = {
            {0, 0, 0}
        };
        return TileGenerator.generateTiles(map, 1100, 600);
    }
    
    public static List<Tile> gatInDeGrond() {
        int[][] map = {
            {0, 0, 0}, // opening zit in hoofdvloer
            {0, 0}
        };
        return TileGenerator.generateTiles(map, 704, 880); // past in het midden
    }

    public static List<Tile> zwevendPlatform() {
        int[][] map = {
            {0, 0}
        };
        return TileGenerator.generateTiles(map, 900, 620);
    }

    public static List<Tile> langeSprong() {
        int[][] map = {
            {0}
        };
        return TileGenerator.generateTiles(map, 1200, 720);
    }

    public static List<Tile> rechtsKlim() {
        int[][] map = {
            {0},
            {0},
            {0},
            {0}
        };
        return TileGenerator.generateTiles(map, 1350, 680);
    }

    public static List<Tile> finalePlatform() {
        int[][] map = {
            {0, 0, 0, 0, 0}
        };
        return TileGenerator.generateTiles(map, 1400, 500);
    }

}
