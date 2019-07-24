//Отсортировать строки матрицы по возрастанию и убыванию значений.
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task12 {

    public static void main(String[] args) {
        int n = 6, count;
        int[][] mass = new int[n][n];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Before");
        printmass(mass);
        for (int i = 0; i < mass.length; i++) {
            count = 0;
            for (int j = 0; j < mass[i].length - 1; j++) {
                if (mass[i][j + 1] < mass[i][j]) {
                    int temp = mass[i][j];
                    mass[i][j] = mass[i][j + 1];
                    mass[i][j + 1] = temp;
                    count++;
                }
            }
            if (count != 0)
                i--;
        }
        System.out.println("After ascending");
        printmass(mass);
        for (int i = 0; i < mass.length; i++) {
            count = 0;
            for (int j = 0; j < mass[i].length - 1; j++) {
                if (mass[i][j + 1] > mass[i][j]) {
                    int temp = mass[i][j];
                    mass[i][j] = mass[i][j + 1];
                    mass[i][j + 1] = temp;
                    count++;
                }
            }
            if (count != 0)
                i--;
        }
        System.out.println("After in descending order");
        printmass(mass);
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
