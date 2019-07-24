//Даны целые числа a1, a2, a3 ... an. Вывести на печать только те числа, для которых ai > i.
package by.kingl.algorithmization.one_dimensional_arrays;

import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        int[] mass = new int[5];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(5);
            if (mass[i] > i)
                System.out.println(mass[i]);
        }
    }
}
