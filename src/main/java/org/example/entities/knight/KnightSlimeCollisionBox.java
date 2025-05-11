package org.example.entities.knight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import org.example.KnightsQuest;
import org.example.entities.FirstFlag;
import org.example.entities.HealthManager;
import org.example.entities.slime.SlimeBase;

import java.util.List;

/**
 * Een collision box die detecteert wanneer de ridder in botsing komt met een slime.
 * Vermindert de gezondheid van de ridder bij een botsing.
 */
public class KnightSlimeCollisionBox extends KnightCollisionBox {

    private HealthManager healthManager;

    /**
     * Maakt een nieuwe collision box aan voor het detecteren van een botsing met een slime.
     *
     * @param initialLocation De startlocatie van de collision box.
     * @param parent De {@code KnightComposition} waartoe deze box behoort.
     * @param healthManager De {@code HealthManager} die de gezondheid van de ridder beheert.
     */
    public KnightSlimeCollisionBox(Coordinate2D initialLocation, KnightComposition parent, HealthManager healthManager) {
        super(initialLocation, parent, new Size(20, 20));
        this.healthManager = healthManager;
    }

    /**
     * Controleert op botsingen met een slime. Als de ridder met een slime botst, wordt de gezondheid verminderd.
     *
     * @param colliders Een lijst van objecten waarmee gebotst wordt.
     */
    @Override
    public void onCollision(List<Collider> colliders) {
        for (var collider : colliders) {
            if (collider instanceof SlimeBase) {
                healthManager.decrease();
            }
        }
    }
}
