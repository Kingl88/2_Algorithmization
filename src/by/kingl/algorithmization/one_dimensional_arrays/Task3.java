package by.kingl.algorithmization.one_dimensional_arrays;
/*Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.*/

public class Task3 {

    public static void main(String[] args) {
        int positive = 0, negative = 0, zero = 0, n = 1000;
        double[] mass = new double[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Math.random() * (50 + 1) - 25;
        }
        for (double number : mass) {
            if (number > 0)
                positive++;
            if (number < 0)
                negative++;
            if (number == 0)
                zero++;
        }
        System.out.println("Positive number = " + positive + "\nNegative number = " + negative + "\nZero number = " + zero);
    }
}
