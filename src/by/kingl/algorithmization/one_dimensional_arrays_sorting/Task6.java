//сортировка Шелла
package by.kingl.algorithmization.one_dimensional_arrays_sorting;

import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {
        int[] mass = new int[15];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] > mass[i + 1]) {
                int temp = mass[i + 1];
                mass[i + 1] = mass[i];
                mass[i] = temp;
                i = i - 2;
            }
            if (i < 0)
                i = -1;

        }
        System.out.println(Arrays.toString(mass));
    }
}
