package org.example;

public class Calculator {
    NumericalOperations notation;

    public void setNotation(NumericalOperations notation) {
        this.notation = notation;
    }

    public String sum(String a, String b) {
        return notation.sum(a, b);
    }

    public String sub(String a, String b) throws RuntimeException {
        return notation.sub(a, b);
    }


    public String mult(String a, String b) {
        return notation.mult(a, b);
    }


    public String div(String a, String b) throws RuntimeException {
        return notation.div(a, b);
    }
}
