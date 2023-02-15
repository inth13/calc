package org.example;

import org.example.impl.ArabicNumeralSystem;
import org.example.impl.RomanNumeralSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter expression: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(calc(input));
    }

    public static String calc(String input) {
        String[] arr = input.split("\\s");
        Calculator calculator = new Calculator();
        String result = null;
        if (NumberHelper.expressionIsValid(arr)) {

            String a = arr[0];
            String b = arr[2];
            String operation = arr[1];

            if (NumberHelper.isArabic(a)) {
                calculator.setOperations(new ArabicNumeralSystem());
            } else if (NumberHelper.isRoman(a)) {
                calculator.setOperations(new RomanNumeralSystem());
            }

            switch (operation) {
                case "+":
                    result = calculator.sum(a, b);
                    break;
                case "-":
                    result = calculator.sub(a, b);
                    break;
                case "*":
                    result = calculator.mult(a, b);
                    break;
                case "/":
                    result = calculator.div(a, b);
            }

        }
        return result;
    }
}
