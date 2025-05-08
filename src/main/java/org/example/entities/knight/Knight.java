package org.example.entities.knight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;



public class Knight extends DynamicSpriteEntity {
    public float jumpForce = 12f;
    public boolean isOnGround;
    
    private final Animation idleAnimation = new LoopingAnimation(0, 0, 0, 3);
    private final Animation runAnimation = new LoopingAnimation(2, 0, 3, 7);
    private final Animation rollAnimation = new LoopingAnimation(5, 0, 5, 7);
    private final Animation jumpAnimation = new LinkedAnimation(5, 0, 5, 7, rollAnimation);
   

    public Knight(Coordinate2D location) {
        super("sprites/knight.png", location, new Size(64, 64), 8, 8);
        playAnimation(idleAnimation);
    }

    protected void idle() {
    	playAnimation(idleAnimation);
    }
    
    protected void run() {
    	playAnimation(runAnimation);
    }

    protected void roll( ) {
    	playAnimation(rollAnimation);
    }
    
    protected void jump(){
    	playAnimation(jumpAnimation);
    }


}
