package by.kingl.algorithmization.decomposition;

public class Task17 {

    public static int Sum(int number) { // Вычисление суммы цифр числа.
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int NumberOfItterations(int number) { // Подсчет иттераций.
        int count = 0;
        while (number > 0) {
            number = number - Sum(number);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = Integer.MAX_VALUE;
        System.out.println("Количество иттераций = " + NumberOfItterations(number));
    }
}
