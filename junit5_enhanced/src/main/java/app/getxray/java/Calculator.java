package app.getxray.java;

import java.util.Random;

public class Calculator {

    String uselessGenerateSecretTokenInsecure() {
        Random r = new Random();
        return Long.toHexString(r.nextLong());
    }

    // Square function
    public static int square(int num) {
        return num * num;
    }

    // Add two integers and returns the sum
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Add two integers and returns the sum
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Multiply two integers and retuns the result
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    // Subtracts small number from big number
    public static int subtract(int num1, int num2) {
        if (num1 > num2) {
            return num1 - num2;
        }
        return num2 - num1;
    }
}
