//Даны действительные числа a1, a2, a3 ... an. Найти max(a1 + a2, a2 + a3, ..., an + a(n+1).
package by.kingl.algorithmization.one_dimensional_arrays;

import static java.lang.Math.random;

public class Task7 {

    public static void main(String[] args) {
        double[] mass = new double[5];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random() * 10;
        }
        double max = mass[0] + mass[1];
        for (int i = 0; i < mass.length - 1; i++) {
            if ((mass[i] + mass[i + 1]) > max)
                max = mass[i] + mass[i + 1];
        }
        for (double number : mass) {
            System.out.println(number);
        }
        System.out.println(max);
    }
}
