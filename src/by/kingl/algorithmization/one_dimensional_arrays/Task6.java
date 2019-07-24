//Задана последовательность N вещественных чисел.
//Вычислить сумму чисел, порядковые номера которых являются простыми числами.
package by.kingl.algorithmization.one_dimensional_arrays;

public class Task6 {

    public static void main(String[] args) {
        int N = 10000000;
        double sum = 0;
        double[] mass = new double[N];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Math.random();
        }
        int[] mass1 = new int[N];
        mass1[0] = mass1[1] = 1;
        for (int i = 2; i * i < N; i++)//решето Эратосфена
            if (mass1[i] == 0)
                for (int j = i * i; j < N; j += i)
                    mass1[j] = 1;
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] == 0)
                sum += mass[i];
        }
        System.out.println(sum);
    }
}
