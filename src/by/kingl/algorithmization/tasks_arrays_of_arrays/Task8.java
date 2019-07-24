//В числовой матрице поменять местами два столбца (любых столбца),
// т.е. все элементы одного столбца поставить на соответствующие им позиции другого,
// а его элементы переместить в мервый.
package by.kingl.algorithmization.tasks_arrays_of_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

    public static void main(String[] args) throws IOException {
        int n = 6, a, b;
        int[][] mass = new int[n][n];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 100);
            }
        }
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("1 stolbec");
                a = Integer.parseInt(reader.readLine());
                if (a > n)
                    throw new Exception();
                System.out.println("2 stolbec");
                b = Integer.parseInt(reader.readLine());
                if (b > n)
                    throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Povtorite vvod");
            }
        }
        System.out.println("Before");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        if (a < b)
            obmen(a, b, mass);
        else
            obmen(b, a, mass);
        System.out.println("After");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void obmen(int a, int b, int[][] mass) {
        int temp = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (j == a - 1)
                    temp = mass[i][j];
                if (j == b - 1) {
                    mass[i][a - 1] = mass[i][j];
                    mass[i][j] = temp;
                }
            }
        }
    }
}
