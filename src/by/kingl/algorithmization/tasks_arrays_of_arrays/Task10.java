//Найти положительные элементы главной диагонали квадратной матрицы.
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task10 {

    public static void main(String[] args) {
        int n = 5;
        int[][] mass = new int[n][n];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if ((i == j) && mass[i][j] > 0)
                    System.out.println(mass[i][j]);
            }
        }
    }
}