//Сортировка выбором
package by.kingl.algorithmization.one_dimensional_arrays_sorting;

public class Task3 {

    public static void main(String[] args) {
        int[] mass = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 34, 34, 34, 2, 34, 234, 234, 234, 2};
        for (int i = 0; i < mass.length - 1; i++) {
            int count = i;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[count] < mass[j]) {
                    count = j;
                }
            }
            int temp = mass[count];
            mass[count] = mass[i];
            mass[i] = temp;
        }
        for (int number : mass)
            System.out.print(number + " ");
    }
}
