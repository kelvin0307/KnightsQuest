package org.example.entities.slime;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.LoopingAnimation;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

import java.util.List;

public abstract class SlimeBase extends DynamicSpriteEntity implements Newtonian, Collided {

    protected double speed = 1.5;

    public SlimeBase(String spritePath, Coordinate2D location, Size size) {
        super(spritePath, location, size, 3, 4); // 3 rijen, 4 kolommen in sprite sheet
        playAnimation(new LoopingAnimation(1, 3, 0, 3)); // Rij 1 (middelste rij), kolommen 0 t/m 3
        setGravityConstant(0.5);
        setFrictionConstant(0.02);
    }

    public void startMovingLeft() {
        setMotion(speed, 270d); // 270 graden = naar links
    }

    public void startMovingRight() {
        setMotion(speed, 90d); // 90 graden = naar rechts
    }

    @Override
    public void onCollision(List<Collider> list) {
        System.out.println("Collision!");
        setSpeed(0);
    }
}
