//Сформируйте случайную матрицу mxn, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task14 {

    public static void main(String[] args) {
        int[][] mass = new int[20][19];
        for (int i = 0; i < mass.length; i++) {
            for (int j = i; j < mass[i].length; j++) {
                mass[i][j] = 1;
            }
        }
        if (mass.length >= mass[0].length) {
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                    System.out.print(mass[i][j] + "\t");
                }
                System.out.println();
            }
        } else
            System.out.println("Нет решения");
    }
}
