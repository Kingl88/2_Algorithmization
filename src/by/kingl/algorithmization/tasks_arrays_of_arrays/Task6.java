//Сформировать квадратную матрицу порядка n по заданному образцу (n-четное).
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task6 {

    public static void main(String[] args) {
        int n = 10;
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                for (int j = i; j < n - i; j++) {
                    mass[i][j] = 1;
                }
            } else {
                for (int j = n - i - 1; j <= i; j++) {
                    mass[i][j] = 1;
                }
            }

        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
