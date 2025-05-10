package org.example.entities.slime;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een groene slijm vijand die heen en weer beweegt.
 * Langzamere variant van de standaard slijm.
 */
public class GreenSlime extends SlimeBase {
    public static double speed = 1;

    /**
     * Maakt een groene slijm aan op de opgegeven locatie
     * @param location startpositie (x,y coördinaten)
     */
    public GreenSlime(Coordinate2D location) {
        super("sprites/slime_green.png", location, new Size(64, 64), speed); // pas sprite aan


    }

}
