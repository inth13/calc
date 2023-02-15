package org.example;

public interface NumericalOperations {
    String sum(String a, String b);

    String sub(String a, String b) throws RuntimeException;

    String mult(String a, String b);

    String div(String a, String b) throws RuntimeException;

}
