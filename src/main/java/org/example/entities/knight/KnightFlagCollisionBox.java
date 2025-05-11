package org.example.entities.knight;

import java.util.List;

import org.example.KnightsQuest;
import org.example.entities.FirstFlag;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

/**
 * Een collision box die detecteert wanneer de ridder de vlag bereikt.
 * Verandert de scene afhankelijk van het huidige level.
 */
public class KnightFlagCollisionBox extends KnightCollisionBox {

    private final KnightsQuest knightsQuest;

    /**
     * Maakt een nieuwe collision box aan voor het detecteren van een vlag.
     *
     * @param initialLocation De startlocatie van de collision box.
     * @param parent De {@code KnightComposition} waartoe deze box behoort.
     * @param knightsQuest De hoofdapplicatie voor toegang tot scene-wissels.
     */
    public KnightFlagCollisionBox(Coordinate2D initialLocation, KnightComposition parent, KnightsQuest knightsQuest) {
        super(initialLocation, parent, new Size(20, 20));
        this.knightsQuest = knightsQuest;
    }

    /**
     * Controleert op botsing met een vlag. Als die plaatsvindt, wisselt het spel naar de volgende scene.
     *
     * @param colliders Een lijst van objecten waarmee gebotst wordt.
     */
    @Override
    public void onCollision(List<Collider> colliders) {
        for (var collider : colliders) {
            if (collider instanceof FirstFlag) {
                int currentScene = knightsQuest.getActiveSceneId();
                
                switch(currentScene) {
                case 2 -> knightsQuest.setActiveScene(3);
                case 3 -> knightsQuest.setActiveScene(1);
                }
            }
        }
    }
}
