package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices: " + prices.length);
        String[] names = new String[4];
        names[0] = "Alex";
        names[1] = "Nikolay";
        names[2] = "Petr";
        names[3] = "Maria";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
