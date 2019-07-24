package by.kingl.algorithmization.one_dimensional_arrays;
//Даны действительные числа a1, a2, a3 ... an. Поменять местами наибольший и наименьший элементы.

public class Task4 {

    public static void main(String[] args) {
        double[] mass = new double[10];
        double max, min;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Math.random() * 51 - 25;
        }
        max = min = mass[0];
        for (double number : mass) {
            if (max < number)
                max = number;
            if (min > number)
                min = number;
        }
        System.out.println("Before");
        print(mass);
        for (int i = 0; i < mass.length; i++) {
            if (max == mass[i])
                mass[i] = min;
            else if (min == mass[i])
                mass[i] = max;
        }
        System.out.println("After");
        print(mass);
    }

    static void print(double[] mass) {
        for (double number : mass) {
            System.out.println(number);
        }
    }
}
