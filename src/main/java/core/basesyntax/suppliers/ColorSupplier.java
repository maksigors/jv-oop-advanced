package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random randColor = new Random();
        return Color.values()[randColor.nextInt(Color.values().length)];
    }
}
