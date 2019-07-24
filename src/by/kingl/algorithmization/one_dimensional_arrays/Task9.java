//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких несколько, то определить наименьшее из них.
package by.kingl.algorithmization.one_dimensional_arrays;

public class Task9 {

    public static void main(String[] args) {
        int[] mass = new int[100];
        int[] mass_count = new int[100];
        int count;
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < mass.length; i++) {
            count = 0;
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j])
                    count++;
            }
            mass_count[i] = count;
            if (count > max)
                max = count;
        }
        count = 0;
        for (int i = 0; i < mass_count.length; i++) {
            if (max == mass_count[i])
                count++;
        }
        int[] newMass = new int[count];
        count = 0;
        for (int i = 0; i < mass_count.length; i++) {
            if (mass_count[i] == max) {
                newMass[count] = mass[i];
                count++;
            }
        }
        int min = newMass[0];
        for (int i = 0; i < newMass.length; i++) {
            if (newMass[i] < min)
                min = newMass[i];
        }
        System.out.println(min);
    }
}
