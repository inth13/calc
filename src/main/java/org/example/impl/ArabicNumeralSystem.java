package org.example.impl;

import org.example.NumericalOperations;

public class ArabicNumeralSystem implements NumericalOperations {
    @Override
    public String sum(String a, String b) {
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        return String.valueOf(result);
    }

    @Override
    public String sub(String a, String b) {
        int result = Integer.parseInt(a) - Integer.parseInt(b);
        return String.valueOf(result);
    }

    @Override
    public String mult(String a, String b) {
        int result = Integer.parseInt(a) * Integer.parseInt(b);
        return String.valueOf(result);
    }

    @Override
    public String div(String a, String b) {
        int result = Integer.parseInt(a) / Integer.parseInt(b);
        return String.valueOf(result);
    }
}
