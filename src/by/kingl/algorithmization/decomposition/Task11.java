package by.kingl.algorithmization.decomposition;

public class Task11 {
    public static int CountNumber(int n) { // Нахождение количества цифр в числе.
        int count = 0;
        while (n % 10 != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int numberOne = 464566751, numberTwo = 4235435;
        if (CountNumber(numberOne) > CountNumber(numberTwo)) {
            System.out.println("Цифр больше в первом числе.");
        } else {
            System.out.println("Цифр больше во втором числе");
        }
    }
}
