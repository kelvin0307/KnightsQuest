package org.example.entities;

import java.util.ArrayList;
import java.util.List;


import com.github.hanyaeger.api.Coordinate2D;

public class HealthManager {

	private final List<Heart> hearts = new ArrayList<>();
	private int maxHealth;
	private int currentHealth;
	
	public HealthManager(int initialHealth) {
		this.maxHealth = initialHealth;
		this.currentHealth = initialHealth;
		initHearts();
	}
	
	private void initHearts() {
		for(int i = 0; i < maxHealth; i++) {
			double x = 1920 - 10 - (i + 1) * 40;
			double y = 10;
			var heart = new Heart(new Coordinate2D(x, y));
			hearts.add(heart);
		}
	}

	public List<Heart> getHearts() {
		return hearts;
	}
	
	public void decrease() {
		if(currentHealth > 0) {
			currentHealth--;
			hearts.remove(currentHealth).remove();
		}
	}
	
	public boolean isDead() {
		return currentHealth <= 0;
	}
	
	public int getCurrentHealth() {
		return currentHealth;
	}
	
	public void reset() {
		
	    for (var heart : hearts) {
	        heart.remove();
	    }
	    hearts.clear();

	    currentHealth = maxHealth;

	    for (int i = 0; i < maxHealth; i++) {
	        double x = 1920 - 10 - (i + 1) * 40;
	        double y = 10;
	        var heart = new Heart(new Coordinate2D(x, y));
	        hearts.add(heart);
	    }
	}

}
	

