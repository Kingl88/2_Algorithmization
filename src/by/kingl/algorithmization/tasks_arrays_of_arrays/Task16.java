//Магический квадрат 3х3
package by.kingl.algorithmization.tasks_arrays_of_arrays;

import java.util.Random;

public class Task16 {

    public static void main(String[] args) {
        while (true) {
            boolean flag = true;
            int n = 3;
            Random rand = new Random();
            int[] a = new int[n * n];
            for (int i = 0; i < a.length; ++i) {
                int j = rand.nextInt(i + 1);
                a[i] = a[j];
                a[j] = i + 1;
            }
            int[][] mass = new int[n][n];
            int k = 0;
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                    mass[i][j] = a[k];
                    k++;
                }
            }
            int magicSum = 0;
            for (int i = 0; i < mass.length; i++) {
                magicSum += mass[0][i];
            }
            if (magicSum != (n * (n * n + 1) / 2)) {
                continue;
            }
            int sumDiag = 0;
            for (int i = 0; i < mass.length; i++) {
                int sumStr = 0, sumStolb = 0;
                for (int j = 0; j < mass.length; j++) {
                    sumStr += mass[i][j];
                    sumStolb += mass[j][i];
                }
                sumDiag += mass[i][i];
                if ((sumStr != magicSum) || (sumStolb != magicSum)) {
                    flag = false;
                    break;
                }
            }
            if (!flag)
                continue;
            if (sumDiag == magicSum) {
                for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j < mass.length; j++) {
                        System.out.print(mass[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("Квадрат магический");
                break;
            }
        }
    }
}
