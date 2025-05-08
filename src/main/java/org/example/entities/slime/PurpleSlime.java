package org.example.entities.slime;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;

import java.util.List;

public class PurpleSlime extends SlimeBase {
    public static double speed = 2;

    public PurpleSlime(Coordinate2D location) {
        super("sprites/slime_purple.png", location, new Size(32, 32), speed); // pas sprite aan
    }


}
