//Задана матрица неотрицательных чисел. Посчитать сумму элементовв каждом столбце.
// Определить, какой столбец содержит максимальную сумму.
package by.kingl.algorithmization.tasks_arrays_of_arrays;

public class Task9 {

    public static void main(String[] args) {
        int n = 6;
        int sum, temp_sum = 0, stolbec = 0;
        int[][] mass = new int[7][10];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int j = 0; j < mass[0].length; j++) { //ставим "0", т.к. минимальный размер матрицы это 1 столбец с индексом 0.
            sum = 0;                            // т.е. так узнаем количество строк в матрице. Далее идем по матреце по столбцам.
            for (int i = 0; i < mass.length; i++) {
                sum += mass[i][j];
            }
            if (temp_sum < sum) {
                temp_sum = sum;
                stolbec = j + 1;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Summa = " + temp_sum + " Column = " + stolbec);
    }
}
