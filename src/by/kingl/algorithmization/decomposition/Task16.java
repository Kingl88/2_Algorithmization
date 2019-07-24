package by.kingl.algorithmization.decomposition;

public class Task16 {

    public static boolean isOddDigit(int number) { // Проверяем все ли цифры в числе нечетные.
        int countIn = Integer.toString(number).length();
        int countOut = 0;
        while (number > 0) {
            if ((number % 10) % 2 != 0) {
                countOut++;
            }
            number /= 10;

        }
        if (countIn == countOut) {
            return true;
        } else {
            return false;
        }
    }

    public static int Sum(int number) { // Сумма всех цифр числа.
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int EvenNumber(int sum) { // Определяем количество четных цифр в числе.
        int count = 0;
        while (sum > 0) {
            if ((sum % 10) % 2 == 0) {
                count++;
            }
            sum /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000000000; i++) {
            if (i % 2 != 0) {
                if (isOddDigit(i)) {
                    System.out.println("Число со всеми нечетными цифрами = " + i + " Сумма всех цифр = " + Sum(i) + " Количество четных цифр = " + EvenNumber(Sum(i)));
                }
            }
        }
    }
}
