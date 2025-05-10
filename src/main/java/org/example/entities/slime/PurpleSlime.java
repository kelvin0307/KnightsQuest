package org.example.entities.slime;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

/**
 * Een paarse slijm vijand die sneller beweegt dan de groene variant.
 * Erft basisgedrag van SlimeBase maar met hogere snelheid.
 */
public class PurpleSlime extends SlimeBase {
    public static double speed = 2;

    /**
     * Maakt een nieuwe paarse slijm aan
     * @param location startpositie (x,y) waar de slijm verschijnt
     */
    public PurpleSlime(Coordinate2D location) {
        super("sprites/slime_purple.png", location, new Size(32, 32), speed); // pas sprite aan
    }


}
