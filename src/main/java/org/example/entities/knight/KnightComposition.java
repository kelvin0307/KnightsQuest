package org.example.entities.knight;

import java.util.Set;

import org.example.KnightsQuest;
import org.example.entities.Coin;
import org.example.entities.tiles.Tile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.userinput.KeyListener;

import javafx.scene.input.KeyCode;

/**
 * Vertegenwoordigt de volledige ridder met alle onderdelen en gedrag.
 * Bevat de ridder zelf, botsingsvakjes en besturing.
 */
public class KnightComposition extends DynamicCompositeEntity implements KeyListener, Newtonian {

    public boolean isOnGround;
    public int health = 5;
    public int coinsCollected;

    private Knight knight;
    private final KnightsQuest knightsQuest;

    /**
     * Maakt een nieuwe ridder aan
     * @param initialLocation De startpositie
     * @param knightsQuest Verwijzing naar de game voor scene-wissels
     */
    public KnightComposition(Coordinate2D initialLocation, KnightsQuest knightsQuest) {
        super(initialLocation);
        this.knightsQuest = knightsQuest;
        setGravityConstant(0.5);
    }

    /**
     * Zet ridderonderdelen klaar:
     * - Sprite voor animaties
     * - Botsingsvakjes voor voeten, zijkanten en hoofd
     */
    @Override
    protected void setupEntities() {
        knight = new Knight(new Coordinate2D(0, 0));
        addEntity(knight);

        var floorBox = new KnightFloorCollisionBox(new Coordinate2D(22, 60), this);
        addEntity(floorBox);

        var wallBox = new KnightWallCollisionBox(new Coordinate2D(59, 7), this);
        addEntity(wallBox);

        var ceilingBox = new KnightCeilingCollisionBox(new Coordinate2D(22, 0), this);
        addEntity(ceilingBox);

        var flagBox = new KnightFlagCollisionBox(new Coordinate2D(22, 22), this, knightsQuest);
        addEntity(flagBox);
    }

    /**
     * Besturing via toetsenbord:
     * - Pijltjes voor lopen
     * - Spatie om te springen
     * - Stopt animatie bij loslaten toetsen
     */
    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.contains(KeyCode.LEFT)) {
            setMotion(3, 270d);
            knight.run();
        } else if (pressedKeys.contains(KeyCode.RIGHT)) {
            setMotion(3, 90d);
            knight.run();
            setDirection(Direction.RIGHT);
        } else if (pressedKeys.contains(KeyCode.SPACE)) {
            if (knight.isOnGround) {
                knight.isOnGround = false;
                addToMotion(knight.jumpForce, Direction.UP);
                knight.jump();
            }
        } else if (pressedKeys.isEmpty()) {
            setSpeed(0);
            knight.idle();
        }
    }

    /**
     * Zorgt dat ridder op platform blijft staan
     */
    public void handleFloorCollision(Tile tile) {
        double tileTop = tile.getBoundingBox().getMinY();
        double knightHeight = knight.getHeight();
        setAnchorLocationY(tileTop - (knightHeight - 1));
        nullifySpeedInDirection(Direction.DOWN);
        knight.isOnGround = true;
    }

    /**
     * Blokkeert beweging door muren
     */
    public void handleWallCollision(Tile tile) {
        double rightSpeed = getSpeedInDirection(Direction.RIGHT);
        double leftSpeed = getSpeedInDirection(Direction.LEFT);

        if (getDirection() == Direction.RIGHT.getValue() && rightSpeed > 0) {
            setAnchorLocationX(tile.getBoundingBox().getMinX() - knight.getWidth());
            nullifySpeedInDirection(Direction.RIGHT);
        } else if (getDirection() == Direction.LEFT.getValue() && leftSpeed > 0) {
            setAnchorLocationX(tile.getBoundingBox().getMaxX() + 1);
            nullifySpeedInDirection(Direction.LEFT);
        }
    }

    /**
     * Voorkomt door plafond gaan
     */
    public void handleCeilingCollision(Tile tile) {
        double tileBottom = tile.getBoundingBox().getMaxY();
        setAnchorLocationY(tileBottom + 1);
        nullifySpeedInDirection(Direction.UP);
    }
    
    public void handleCoinCollision(Coin coin) {
    	coin.remove();
    	coinsCollected ++;
    	
    }
}
