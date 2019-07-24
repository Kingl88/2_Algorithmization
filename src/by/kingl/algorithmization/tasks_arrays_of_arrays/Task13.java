//Отсортировать столбцы матрицы по возрастанию и убыванию значений.
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task13 {

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
        for (int j = 0; j < mass[0].length; j++) {
            int count = 0;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i + 1][j] < mass[i][j]) {
                    int temp = mass[i][j];
                    mass[i][j] = mass[i + 1][j];
                    mass[i + 1][j] = temp;
                    count++;
                }
            }
            if (count != 0)
                j--;
        }
        System.out.println("Ascending");
        printmass(mass);
        for (int j = 0; j < mass[0].length; j++) {
            int count = 0;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i + 1][j] > mass[i][j]) {
                    int temp = mass[i][j];
                    mass[i][j] = mass[i + 1][j];
                    mass[i + 1][j] = temp;
                    count++;
                }
            }
            if (count != 0)
                j--;
        }
        System.out.println("In descending order");
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
