//Сформировать квадратную матрицу порядка n по заданному образцу (n-четное).
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task4 {

    public static void main(String[] args) {
        int n = 10;
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0)
                    mass[i][j] = j + 1;
                else
                    mass[i][j] = n - j;
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
