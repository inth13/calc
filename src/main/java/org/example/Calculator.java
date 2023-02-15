package org.example;

public class Calculator {
    NumericalOperations operations;

    public void setOperations(NumericalOperations operations) {
        this.operations = operations;
    }

    public String sum(String a, String b) {
        return operations.sum(a, b);
    }

    public String sub(String a, String b) throws RuntimeException {
        return operations.sub(a, b);
    }


    public String mult(String a, String b) {
        return operations.mult(a, b);
    }


    public String div(String a, String b) throws RuntimeException {
        return operations.div(a, b);
    }
}
