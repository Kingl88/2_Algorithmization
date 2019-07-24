//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task1 {

    public static void main(String[] args) {
        int[][] mass = new int[5][20];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if ((j % 2 == 0) && (mass[0][j] > mass[mass.length - 1][j]))
                    System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
