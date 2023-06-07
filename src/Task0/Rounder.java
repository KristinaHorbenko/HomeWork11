package Task0;

import java.text.DecimalFormat;

public class Rounder {
    public static String roundValue(double value, int i) {
        return new DecimalFormat("#.00").format(value);
    }
}
