package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberHelperTest {
    @Test
    public void convert_1_to_I() {
        String romanNumber = NumberHelper.toRoman(1);
        assertEquals("I", romanNumber);
    }

    @Test
    public void convert_2_to_II() {
        String romanNumber = NumberHelper.toRoman(2);
        assertEquals("II", romanNumber);
    }

    @Test
    public void convert_3_to_III() {
        String romanNumber = NumberHelper.toRoman(3);
        assertEquals("III", romanNumber);
    }

    @Test
    public void convert_XXII_to_22() {
        int result = NumberHelper.romanToArabic("XXII");

        assertEquals(22, result);
    }

    @Test
    public void convert_IX_to_9() {
        int result = NumberHelper.romanToArabic("IX");
        assertEquals(9, result);
    }

    @Test
    public void number_1_is_arabic() {
        boolean result = NumberHelper.isArabic("1");
        assertTrue(result);
    }

    @Test
    public void number_15_is_arabic() {
        boolean result = NumberHelper.isArabic("15");
        assertTrue(result);
    }

    @Test
    public void number_100500_is_arabic() {
        boolean result = NumberHelper.isArabic("100500");
        assertTrue(result);
    }

    @Test
    public void number_0_is_arabic() {
        boolean result = NumberHelper.isArabic("0");
        assertTrue(result);
    }

    @Test
    public void number_X_is_arabic() {
        boolean result = NumberHelper.isArabic("X");
        assertFalse(result);
    }

    @Test
    public void number_11X_is_arabic() {
        boolean result = NumberHelper.isArabic("11X");
        assertFalse(result);
    }

    @Test
    public void number_X_is_roman() {
        boolean result = NumberHelper.isRoman("X");
        assertTrue(result);
    }

    @Test
    public void number_XII_is_roman() {
        boolean result = NumberHelper.isRoman("XII");
        assertTrue(result);
    }

    @Test
    public void number_IX_is_roman() {
        boolean result = NumberHelper.isRoman("IX");
        assertTrue(result);
    }

    @Test
    public void number_IIX_is_roman() {
        boolean result = NumberHelper.isRoman("IIX");
        assertFalse(result);
    }

    @Test
    public void number_IIIX_is_roman() {
        boolean result = NumberHelper.isRoman("IIIX");
        assertFalse(result);
    }

    @Test
    public void number_V_is_roman() {
        boolean result = NumberHelper.isRoman("V");
        assertTrue(result);
    }

    @Test
    public void number_IV_is_roman() {
        boolean result = NumberHelper.isRoman("IV");
        assertTrue(result);
    }

    @Test
    public void number_IIV_is_roman() {
        boolean result = NumberHelper.isRoman("IIV");
        assertFalse(result);
    }

    @Test
    public void number_XIIII_is_roman() {
        boolean result = NumberHelper.isRoman("XIIII");
        assertFalse(result);
    }

    @Test
    public void expression_arabic_operation_arabic() {
        String[] arr = {"1", "+", "1"};
        boolean result = NumberHelper.expressionIsValid(arr);
        assertTrue(result);
    }

    @Test(expected = Exception.class)
    public void expression_roman_operation_arabic() {
        String[] arr = {"V", "+", "1"};
        NumberHelper.expressionIsValid(arr);
    }

    @Test
    public void expression_roman_operation_roman() {
        String[] arr = {"V", "+", "X"};
        boolean result = NumberHelper.expressionIsValid(arr);
        assertTrue(result);
    }

    @Test(expected = RuntimeException.class)
    public void expression_roman_double_operation_roman() {
        String[] arr = {"V", "++", "X"};
        NumberHelper.expressionIsValid(arr);
    }
}
