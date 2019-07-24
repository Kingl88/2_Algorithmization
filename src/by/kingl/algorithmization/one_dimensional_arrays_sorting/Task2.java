//Даны две неубывающих последовательности.
// Образовать новую последовательность чисел так, что бы она тоже была неубывающей.
package by.kingl.algorithmization.one_dimensional_arrays_sorting;

public class Task2 {

    public static void main(String[] args) {
        int[] mass1 = new int[]{22, 24, 25, 54, 55, 56};
        int[] mass2 = new int[]{21, 22, 23, 24, 25};
        int[] mass = new int[mass1.length + mass2.length];
        System.arraycopy(mass1, 0, mass, 0, mass1.length);
        System.arraycopy(mass2, 0, mass, mass1.length, mass2.length);
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length - 1; j++) {
                if (mass[j] > mass[j + 1]) {
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }
        }
        for (int number : mass)
            System.out.print(number + " ");
    }
}
