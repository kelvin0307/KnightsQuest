package org.example.entities.slime;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

import java.util.List;

public abstract class SlimeBase extends DynamicSpriteEntity implements Newtonian, Collided {

    public double speed;
    public int moveCounter = 0;


    public SlimeBase(String spritePath, Coordinate2D location, Size size, double speed) {
        super(spritePath, location, size, 3, 4); // 3 rijen, 4 kolommen in sprite sheet
        this.speed = speed;
        playAnimation(new LoopingAnimation(1, 3, 0, 3)); // Rij 1 (middelste rij), kolommen 0 t/m 3
        setGravityConstant(0.5);
        setFrictionConstant(0.02);
    }

    @Override
    public void onCollision(List<Collider> list) {

        setMotion(0, Direction.DOWN);
        moveCounter++;

        if (moveCounter < 100) {
            setMotion(speed, Direction.RIGHT);
        } else {
            setMotion(speed, Direction.LEFT);
        }

        if(moveCounter == 200) {
            moveCounter = 0;
        }
    }
}
