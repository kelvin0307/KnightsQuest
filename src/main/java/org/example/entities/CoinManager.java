package org.example.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * Beheert het verzamelen en weergeven van munten in de game.
 * Wordt gebruikt in compositie met {@code Knight}.
 */

public class CoinManager {
    private int totalCoins;
    private int collectedCoins = 0;
    private final TextEntity display;

    /**
     * Maakt een {@code CoinManager} aan met het totaal aantal te verzamelen munten.
     *
     * @param totalCoins Het totaal aantal munten in het level.
     */
    public CoinManager(int totalCoins) {
        this.totalCoins = totalCoins;
        double screenWidth = 1920; 
        double textWidthApprox = 200; 
        double centerX = (screenWidth - textWidthApprox) / 2;

        this.display = new TextEntity(new Coordinate2D(centerX, 30), formatText());

        Font pixelFont = Font.loadFont(
	            getClass().getResource("/fonts/PixelOperator8-Bold.ttf").toExternalForm(),
	            50 
	        );
        display.setFont(pixelFont);
        display.setFill(Color.WHITE);
    }

    /**
     * Verhoogt het aantal verzamelde munten met één en werkt de tekstweergave bij.
     */
    public void addCoin() {
        collectedCoins++;
        updateDisplay();
    }

    /**
     * Geeft de {@code TextEntity} terug die de muntenweergave bevat.
     *
     * @return De tekstweergave van het aantal verzamelde munten.
     */
    public TextEntity getDisplay() {
        return display;
    }

    // Werkt de weergavetekst bij
    private void updateDisplay() {
        display.setText(formatText());
    }

    // Formatteert de tekst als
    private String formatText() {
        return collectedCoins + " / " + totalCoins + " Coins";
    }
}
