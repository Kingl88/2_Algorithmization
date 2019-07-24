package by.kingl.algorithmization.decomposition;

public class Task8 {
    public static int SumThree(int[] mass, int low, int hight) { // Метод нахождения суммы трех последовательных элемента
        int sum = 0;
        for (int i = low; i < hight; i += 3) {
            sum += mass[i] + mass[i + 1] + mass[i + 2];
        }
        return sum;
    }

    public static int[] CreateMass(int number) { // Метод создания и заполнения массива
        int[] mass = new int[number];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
        }
        return mass;
    }

    public static void main(String[] args) {
        int[] mass = CreateMass(100);
        int k = 5, m = 15;
        if (m < k) {
            System.out.println("Неверный диапазон");
        } else {
            System.out.println("Total = " + SumThree(mass, k, m));
        }
    }
}
