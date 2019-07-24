//Найдите наибольший элемент матрицы и замените все нечетные элементы на него.
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task15 {

    public static void main(String[] args) {
        int n = 6;
        int[][] mass = new int[n][n];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Before");
        printmass(mass);
        int max = mass[0][0];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (max < mass[i][j])
                    max = mass[i][j];
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] % 2 != 0)
                    mass[i][j] = max;
            }
        }
        System.out.println("After");
        printmass(mass);
        // write your code here
    }

    public static void printmass(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
