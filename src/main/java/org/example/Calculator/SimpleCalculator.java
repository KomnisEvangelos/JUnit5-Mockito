package org.example.Calculator;

public class SimpleCalculator {

    public int add(int a, int b) {

            return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }else if (b == 1){
            return a;
        }
        return a / b;
    }
}
