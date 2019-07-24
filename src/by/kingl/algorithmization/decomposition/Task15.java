package by.kingl.algorithmization.decomposition;

public class Task15 {

    public static boolean CheckNumber(long number) { // Проверка удовлетворяет число заданию или нет.
        long previousDigit = 10;
        long currentDigit = number % 10;
        do {
            if (previousDigit > currentDigit && currentDigit != 0) { // Проверяем на "0" для того,
                previousDigit = currentDigit;                      // что бы обойти числа оканчивающиеся на "0".
                number = number / 10;
                currentDigit = number % 10;
                if ((previousDigit - currentDigit) > 1 && currentDigit != 0) // Проверяем на "0", так как если у числа в
                    return false; // последнем разряде цифра больше 1, то это число не явялется неверным (например 23, 34, 45...)
            } else
                return false;

        } while (number > 0);
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 123456789; i++) {
            if (CheckNumber(i))
                System.out.println(i);
        }
    }
}
