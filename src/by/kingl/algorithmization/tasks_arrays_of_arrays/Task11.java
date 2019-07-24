//Матрицу 10х20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task11 {

    public static void main(String[] args) {
        int[][] mass = new int[10][20];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 15);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < mass.length; i++) {
            int count = 0;
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] == 5)
                    count++;
                if (count == 3) {
                    System.out.println("Line №" + (i + 1));
                    break;
                }
            }
        }
    }
}
