package org.example.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class CoinManager {
    private int totalCoins;
    private int collectedCoins = 0;
    private final TextEntity display;

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

    public void addCoin() {
        collectedCoins++;
        updateDisplay();
    }

    public TextEntity getDisplay() {
        return display;
    }

    private void updateDisplay() {
        display.setText(formatText());
    }

    private String formatText() {
        return collectedCoins + " / " + totalCoins + " Coins";
    }
}
