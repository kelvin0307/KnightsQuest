package org.example.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.LoopingAnimation;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Coin extends DynamicSpriteEntity {
	public int value;

	public Coin(Coordinate2D initialLocation) {
		super("sprites/coinresized1.png", initialLocation, 1, 12);
		playAnimation(new LoopingAnimation(0, 0, 0, 11));
		

	}


	
	}


