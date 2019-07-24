package by.kingl.algorithmization.one_dimensional_arrays;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        double z = 24.3;
        int amount = 0;
        double[] mass = new double[100];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(100) + rand.nextDouble();
            if (mass[i] > z) {
                mass[i] = z;
                amount++;
            }
        }
        System.out.println("Number of replacements = " + amount);
    }
}
