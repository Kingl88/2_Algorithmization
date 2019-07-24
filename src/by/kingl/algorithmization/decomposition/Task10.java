package by.kingl.algorithmization.decomposition;

import java.util.Arrays;

public class Task10 {

    public static int ArraySize(int n) { // Нахождение разрядности числа, т.е. размера массива.
        int count = 0;
        while (n % 10 != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int[] Mass_n(int n) { // Получение массива состоящего из цифр в числе n.
        int[] mass = new int[ArraySize(n)];
        for (int i = mass.length - 1; i >= 0; i--) {
            mass[i] = n % 10;
            n /= 10;
        }
        return mass;
    }

    public static void main(String[] args) {
        int n = 789324768;
        System.out.println(Arrays.toString(Mass_n(n)));
    }
}
