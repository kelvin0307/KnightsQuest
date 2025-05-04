package org.example.entities.slime;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class PurpleSlime extends SlimeBase {

    public PurpleSlime(Coordinate2D location) {
        super("sprites/slime_row_1.png", location, new Size(32, 32)); // pas sprite aan
        startMovingLeft(); // bijv. begint naar links te bewegen
    }
}
