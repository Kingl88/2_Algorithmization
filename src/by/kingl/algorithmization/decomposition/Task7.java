package by.kingl.algorithmization.decomposition;

public class Task7 {
    public static int Factorial(int number) { // Функция нахождения факториала
        if (number == 1 || number == 0) {
            return number;
        } else {
            return number * Factorial(number - 1);
        }

    }

    public static int Sum(int number) { // Функция подсчета суммы факториалов всех нечетный чисел, до заданного числа.
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                sum += Factorial(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Sum(9));
    }
}
