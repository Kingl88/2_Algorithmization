//Дан целочисленный массив с количеством элементов n. Сжать массив,
// выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
package by.kingl.algorithmization.one_dimensional_arrays;

public class Task10 {

    public static void main(String[] args) {
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
        }
        for (int number : mass)
            System.out.print(number + ", ");
        int count = 1;
        for (int i = 1; i < mass.length; i++) {
            if (i >= mass.length / 2)
                mass[i] = 0;
            else {
                mass[i] = mass[i + count];
                count++;
            }
        }
        System.out.println();
        for (int number : mass)
            System.out.print(number + ", ");
    }
}
