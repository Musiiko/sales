package Sales.src.utils;

public class Rounder {
    public static double getValue(double number) {
        number = Math.round(number * 100);
        number = number / 100;
        return number;
    }

}
