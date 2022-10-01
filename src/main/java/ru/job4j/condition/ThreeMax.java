package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int thrid) {
        int result = first;
        if (second > first && second >= thrid) {
            result = second;
        }
        if (thrid > first && thrid > second) {
            result = thrid;
        }
        return result;
    }
}
