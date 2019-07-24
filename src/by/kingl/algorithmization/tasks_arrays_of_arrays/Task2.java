//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task2 {

    public static void main(String[] args) {
        int[][] mass = new int[10][5];
        for (int i = 0; i < mass.length; i++)
            for (int j = 0; j < mass[i].length; j++)
                mass[i][j] = (int) (Math.random() * 100);
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j || j == mass[i].length - 1 - i)
                    System.out.print(mass[i][j] + "\t");
                else
                    System.out.print(" " + "\t");
            }
            System.out.println();
        }
    }
}
