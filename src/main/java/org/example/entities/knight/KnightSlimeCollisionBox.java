package org.example.entities.knight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import org.example.KnightsQuest;
import org.example.entities.FirstFlag;
import org.example.entities.HealthManager;
import org.example.entities.slime.SlimeBase;

import java.util.List;

public class KnightSlimeCollisionBox extends KnightCollisionBox {

    private HealthManager healthManager;

    public KnightSlimeCollisionBox(Coordinate2D initialLocation, KnightComposition parent, HealthManager healthManager) {
        super(initialLocation, parent, new Size(20, 20));
        this.healthManager = healthManager;
    }

    @Override
    public void onCollision(List<Collider> colliders) {
        for (var collider : colliders) {
            if (collider instanceof SlimeBase) {
                healthManager.decrease();
            }
        }
    }
}
