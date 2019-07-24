//Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin((I^2-J^2)/N) и подсчитать количество положительных элементов
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task7 {

    public static void main(String[] args) {
        int n = 4, count = 0;
        double[][] mass = new double[n][n];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (mass[i][j] > 0)
                    count++;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The number of positive elements:=" + count);
    }
}
