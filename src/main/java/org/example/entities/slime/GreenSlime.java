package org.example.entities.slime;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;

import java.util.List;

public class GreenSlime extends SlimeBase {
    public static double speed = 1;

    public GreenSlime(Coordinate2D location) {
        super("sprites/slime_green.png", location, new Size(64, 64), speed); // pas sprite aan


    }

}
