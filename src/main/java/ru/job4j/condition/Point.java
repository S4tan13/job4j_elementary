package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int xMinus = x2 - x1;
        int yMinus = y2 - y1;
        double xSquare = Math.pow(xMinus, 2);
        double ySquare = Math.pow(yMinus, 2);
        double sum = xSquare + ySquare;
        double rsl = Math.sqrt(sum);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        double result2 = Point.distance(1, 7, 4, 11);
        System.out.println("result (1, 3) to (7, 11) " + result2);
    }
}
