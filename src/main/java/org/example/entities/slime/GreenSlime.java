package org.example.entities.slime;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class GreenSlime extends SlimeBase {

    public GreenSlime(Coordinate2D location) {
        super("sprites/slime_green.png", location, new Size(64, 64)); // pas sprite aan
        startMovingRight(); // bijv. begint naar rechts te bewegen
    }
}
