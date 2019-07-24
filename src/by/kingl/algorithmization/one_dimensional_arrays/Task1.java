package by.kingl.algorithmization.one_dimensional_arrays;

public class Task1 {

    public static void main(String[] args) {
        int sum = 0, k = 4;
        int[] mass = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        for (Integer number : mass) {
            if (number % k == 0)
                sum += number;
        }
        System.out.println(sum);
    }
}