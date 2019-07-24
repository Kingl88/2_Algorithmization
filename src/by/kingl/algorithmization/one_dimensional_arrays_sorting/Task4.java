//Сортировка обменами.
package by.kingl.algorithmization.one_dimensional_arrays_sorting;

public class Task4 {

    public static void main(String[] args) {
        int[] mass = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length - 1; j++) {
                if (mass[j] > mass[j + 1]) {
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                    count++;
                }
            }
        }
        for (int number : mass)
            System.out.print(number + " ");
        System.out.println();
        System.out.println("The number of permutations =" + count);
    }
}
