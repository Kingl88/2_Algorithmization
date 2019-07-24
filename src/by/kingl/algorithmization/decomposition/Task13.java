package by.kingl.algorithmization.decomposition;

public class Task13 {

    public static boolean isSimple(int number) { // Проверка на то является число простым или нет.
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return number != 1;
    }

    public static void main(String[] args) {
        int n = 12345;
        for (int i = n; i < 2 * n; i++) {
            if (isSimple(i) && isSimple(i + 2)) {
                System.out.println("Числа близнецы " + i + ", " + (i + 2));
            }

        }
    }
}
