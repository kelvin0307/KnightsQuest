package org.example.entities.slime;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

import java.util.List;

/**
 * Basisklasse voor alle slijm-vijanden in het spel.
 * Handelt de basisbeweging, zwaartekracht en animaties voor slijmachtige vijanden.
 */
public abstract class SlimeBase extends DynamicSpriteEntity implements Newtonian, Collided, Collider {

    public double speed;
    public int moveCounter = 1;

    /**
     * Maakt een nieuwe basis slijm aan
     * @param spritePath pad naar het sprite plaatje
     * @param location startpositie (x,y)
     * @param size grootte van de slijm
     * @param speed beweegsnelheid
     */
    public SlimeBase(String spritePath, Coordinate2D location, Size size, double speed) {
        super(spritePath, location, size, 3, 4); // 3 rijen, 4 kolommen in sprite sheet
        this.speed = speed;
        playAnimation(new LoopingAnimation(1, 3, 0, 3)); // Rij 1 (middelste rij), kolommen 0 t/m 3
        setGravityConstant(0.5);
        setFrictionConstant(0.02);
    }

    /**
     * Wordt aangeroepen bij botsingen.
     * Handelt de automatische heen-en-weer beweging van de slijm.
     * @param list lijst van objecten waarmee gebotst is
     */
    @Override
    public void onCollision(List<Collider> list) {
        setMotion(0, Direction.DOWN);
        moveCounter++;

        if (moveCounter <= 40) {
            setMotion(speed, Direction.RIGHT);
        } else {
            setMotion(speed, Direction.LEFT);
        }

        if(moveCounter == 80) {
            moveCounter = 0;
        }
    }
}
