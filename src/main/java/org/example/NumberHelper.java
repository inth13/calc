package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class NumberHelper {
    public static String toRoman(int num) {
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return C[num / 100] + X[(num % 100) / 10] + I[num % 10];
    }

    public static int romanToArabic(String roman) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);

        int n = roman.length();
        int num = romanMap.get(roman.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            if (romanMap.get(roman.charAt(i)) >= romanMap.get(roman.charAt(i + 1))) {
                num += romanMap.get(roman.charAt(i));
            } else {
                num -= romanMap.get(roman.charAt(i));
            }
        }
        return num;
    }

    public static boolean isArabic(String str) {
        Pattern compile = Pattern.compile("\\d*");
        return compile.matcher(str).matches();
    }

    public static boolean isRoman(String str) {
        //O'reilly Regular Expressions Cookbook
//        ^(?=[MDCLXVI])M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$  IX - не валидно ?!
        Pattern compile = Pattern.compile("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
        return compile.matcher(str).matches();
    }

    public static boolean expressionIsValid(String[] arr) throws RuntimeException {
        if (arr.length != 3) {
            throw new RuntimeException("некорректное выражение");
        }
        boolean matchOperator = Pattern.compile("\\+|\\*|\\-|\\/").matcher(arr[1]).matches();
        if (!matchOperator) {
            throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        if (isRoman(arr[0]) != isRoman(arr[2]) || isArabic(arr[0]) != isArabic(arr[2])){
            throw new RuntimeException("используются одновременно разные системы счисления");
        }

        return true;
    }
}
