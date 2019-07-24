//Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность,
// выбросив из исходной те члены, которые равны min(a1,a2, ..., an).
package by.kingl.algorithmization.one_dimensional_arrays;

public class Task8 {

    public static void main(String[] args) {
        int[] mass = new int[1000];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
        }
        System.out.println("Before");
        for (int numb : mass)
            System.out.print(numb + ", ");
        int min = mass[0];
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min)
                min = mass[i];
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == min)
                count++;
        }
        int[] newMass = new int[mass.length - count];
        count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != min) {
                newMass[i - count] = mass[i];
            } else
                count++;
        }
        System.out.println("\nAfter");
        for (int numb : newMass)
            System.out.print(numb + ", ");
    }
}
