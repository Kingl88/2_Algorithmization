//Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м жлементами первого,
// при этом не используя дополнительный массив.
package by.kingl.algorithmization.one_dimensional_arrays_sorting;

public class Task1 {

    public static void main(String[] args) {
        int[] mass1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] mass2 = new int[]{6, 7, 8, 9, 5, 6, 7, 6, 5, 4, 5};
        int k = 3;
        int[] mass = new int[mass1.length + mass2.length];
        System.arraycopy(mass1, 0, mass, 0, mass1.length);
        System.arraycopy(mass2, 0, mass, k, mass2.length);
        System.arraycopy(mass1, k, mass, k + mass2.length, mass1.length - k);
        for (int number : mass)
            System.out.print(number + " ");
    }
}