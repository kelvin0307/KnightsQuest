package org.example.entities.knight;

import java.util.List;

import org.example.KnightsQuest;
import org.example.entities.FirstFlag;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

public class KnightFlagCollisionBox extends KnightCollisionBox {

    private final KnightsQuest knightsQuest;

    public KnightFlagCollisionBox(Coordinate2D initialLocation, KnightComposition parent, KnightsQuest knightsQuest) {
        super(initialLocation, parent, new Size(20, 20));
        this.knightsQuest = knightsQuest;
    }

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
