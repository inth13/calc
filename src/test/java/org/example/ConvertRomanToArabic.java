package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertRomanToArabic {
    @Test
    public void convert_1_to_I() {
        String romanNumber = ConvertNumber.toRoman(1);
        assertEquals("I", romanNumber);
    }
}
