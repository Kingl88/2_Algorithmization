//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task3 {

    public static void main(String[] args) {
        int[][] mass = new int[10][10];
        int k = 3, p = 5;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if ((i + 1 == k) || (j + 1 == p))
                    System.out.print(mass[i][j] + "\t");
                else
                    System.out.print(" " + "\t");
            }
            System.out.println();
        }
    }
}
