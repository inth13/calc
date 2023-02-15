package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void sum_I_I() {
        String actual = Main.calc("I + I");
        assertEquals("II", actual);
    }

    @Test
    public void sum_IV_II() {
        String actual = Main.calc("IV + II");
        assertEquals("VI", actual);
    }

    @Test
    public void sum_3_2() {
        String actual = Main.calc("3 + 2");
        assertEquals("5", actual);
    }

    @Test(expected = RuntimeException.class)
    public void sum_I_2() {
        Main.calc("I + 2");
    }

    @Test(expected = RuntimeException.class)
    public void sub_I_V_nagative() {
        Main.calc("I - V");
    }

    @Test(expected = RuntimeException.class)
    public void roman_zero_answer() {
        Main.calc("V - V");
    }

    @Test
    public void mult_X_X() {
        String result = Main.calc("X * X");
        assertEquals("C", result);
    }

    @Test
    public void div_X_II() {
        String result = Main.calc("X / II");
        assertEquals("V", result);
    }

    @Test
    public void div_X_III() {
        String result = Main.calc("X / III");
        assertEquals("III", result);
    }

    @Test(expected = RuntimeException.class)
    public void not_valid_input() {
        Main.calc("I");
    }

    @Test(expected = RuntimeException.class)
    public void not_valid_input_many_arguments() {
        Main.calc("I + I + III");
    }

    @Test(expected = RuntimeException.class)
    public void not_valid_input3() {
        Main.calc("I +");
    }

    @Test(expected = RuntimeException.class)
    public void to_many_spaces() {
        Main.calc("III *  VI");
    }
}
