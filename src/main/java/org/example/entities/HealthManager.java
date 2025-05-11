package org.example.entities;

import java.util.ArrayList;
import java.util.List;


import com.github.hanyaeger.api.Coordinate2D;

/**
 * Beheert de levens (harten) van een speler.
 */
public class HealthManager {

	private final List<Heart> hearts = new ArrayList<>();
	private int maxHealth;
	private int currentHealth;

	/**
	 * Maakt een nieuwe {@code HealthManager} met het opgegeven aantal levens.
	 *
	 * @param initialHealth Aantal levens bij de start.
	 */
	public HealthManager(int initialHealth) {
		this.maxHealth = initialHealth;
		this.currentHealth = initialHealth;
		initHearts();
	}

	// Initialiseert de hartjes op het scherm
	private void initHearts() {
		for(int i = 0; i < maxHealth; i++) {
			double x = 1920 - 10 - (i + 1) * 40;
			double y = 10;
			var heart = new Heart(new Coordinate2D(x, y));
			hearts.add(heart);
		}
	}

	/**
	 * Geeft de huidige lijst van hartjes.
	 *
	 * @return Lijst met {@code Heart}-objecten.
	 */
	public List<Heart> getHearts() {
		return hearts;
	}

	/**
	 * Vermindert het aantal levens met één en verwijdert een hartje.
	 */
	public void decrease() {
		if(currentHealth > 0) {
			currentHealth--;
			hearts.remove(currentHealth).remove();
		}
	}

	/**
	 * Controleert of de speler geen levens meer heeft.
	 *
	 * @return {@code true} als health 0 is, anders {@code false}.
	 */
	public boolean isDead() {
		return currentHealth <= 0;
	}

	/**
	 * Geeft het huidige aantal levens terug.
	 *
	 * @return Huidige healthwaarde.
	 */
	public int getCurrentHealth() {
		return currentHealth;
	}

	/**
	 * Reset de levens naar het maximum en toont opnieuw alle hartjes.
	 */
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
	

