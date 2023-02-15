package org.example.impl;

import org.example.NumberHelper;
import org.example.NumericalOperations;

public class RomanNumeralSystem implements NumericalOperations {

    @Override
    public String sum(String a, String b) {
        int result = NumberHelper.romanToArabic(a) + NumberHelper.romanToArabic(b);
        return NumberHelper.toRoman(result);
    }

    @Override
    public String sub(String a, String b) throws RuntimeException {
        int result = NumberHelper.romanToArabic(a) - NumberHelper.romanToArabic(b);
        if (result <= 0) {
            throw new RuntimeException("В римской системе нет нуля и отрицательных чисел");
        }
        return NumberHelper.toRoman(result);
    }

    @Override
    public String mult(String a, String b) {
        int result = NumberHelper.romanToArabic(a) * NumberHelper.romanToArabic(b);
        return NumberHelper.toRoman(result);
    }

    @Override
    public String div(String a, String b) throws RuntimeException {
        int result = NumberHelper.romanToArabic(a) / NumberHelper.romanToArabic(b);
        if (result < 1) {
            throw new RuntimeException("Результа вычисления меньше единицы");
        }
        return NumberHelper.toRoman(result);
    }
}
