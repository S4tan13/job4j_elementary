package ru.job4j.calculator;

public class Calculator {

    public static int plus(int first, int second) {
        int result = first + second;
        return result;
    }

    public static void main(String[] args) {
        int onePlusTwo = Calculator.plus(1, 2);
        int thenPlusEleven = Calculator.plus(10, 11);
    }
}
