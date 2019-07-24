package by.kingl.algorithmization.decomposition;

public class Task5 {

    public static int[] SortMass(int[] mass) { // Сортировка по возрастанию выбором.
        for (int i = 0; i < mass.length - 1; i++) {
            int indexMax = i;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[j] < mass[indexMax]) {
                    indexMax = j;
                }
            }
            if (i != indexMax) {
                int temp = mass[indexMax];
                mass[indexMax] = mass[i];
                mass[i] = temp;
            }
        }
        return mass;
    }

    public static int BeforeMax(int[] mass) { // Нахождение числа меньше максимального, но больше остальных чисел.
        int max = mass[mass.length - 1];
        for (int i = mass.length - 1; i > 0; i--) {
            if (max > mass[i]) {
                return mass[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] mass = new int[]{1, 5, 23, 64, 12, 46, 321, 56, 321};
        System.out.println(BeforeMax(SortMass(mass)));
    }
}
