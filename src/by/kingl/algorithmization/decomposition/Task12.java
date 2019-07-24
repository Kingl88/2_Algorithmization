package by.kingl.algorithmization.decomposition;

import java.util.Arrays;

public class Task12 {

    public static int SumNumber(int n) { // Нахождение суммы цифр числа
        int sum = 0;
        while (n % 10 != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int[] MassA(int k, int n) { // Создание и заполнение массива
        int count = 0;
        int leightMassA = 0;
        for (int i = 0; i <= n; i++) {
            if (SumNumber(i) == k) {
                leightMassA++;
            }
        }
        int[] massA = new int[leightMassA];
        for (int i = 0; i < n; i++) {
            if (SumNumber(i) == k) {
                massA[count] = i;
                count++;
            }
        }
        return massA;
    }

    public static void main(String[] args) {
        int k = 50, n = 836871;
        System.out.println(Arrays.toString(MassA(k, n)));
    }
}
