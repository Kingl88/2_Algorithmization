package by.kingl.algorithmization.decomposition;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;

public class Task14 {

    public static boolean checkNumber(long n) { // Проверка стоит проверять число дальше или нет
        long previousDigit = 0;
        while (n > 0) {
            long currentDigit = n % 10;
            if (previousDigit > currentDigit) {
                return false;
            }
            previousDigit = currentDigit;
            n = n / 10;
        }
        return true;
    }

    public static long Sum(long number, long[][] mass) { // Нахождение суммы цифр в числе.
        int count = Long.toString(number).length();
        long sum = 0;
        while (number != 0) {
            sum += mass[(int) (number % 10)][count];
            //sum += Math.pow(number%10, count);
            number /= 10;
        }
        if (Long.toString(sum).length() != count)
            return -1;
        else
            return sum;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        SimpleDateFormat sdf = new SimpleDateFormat("ss.SSS");


        long[][] mass = new long[10][10]; // Массив цифр возведенных в стемень.
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (long) Math.pow(i, j);
            }
        }
        //TreeSet<Long> set = new TreeSet<>();
        for (long i = 0; i < 1000000000; i++) {
            if (checkNumber(i)) {
                long number = Sum(i, mass);
                if (number != -1) {
                    long temp = Sum(number, mass);
                    if (temp != -1 && number == temp && Long.toString(i).length() == Long.toString(temp).length()) {
                        System.out.println(number);
                    }
                }
            }
        }
        /*for(Long number : set){
            System.out.println(number);
        }*/
        long end = System.currentTimeMillis() - start;
        long memore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println();
        System.out.println("Time = " + sdf.format(new Date(end)));
        System.out.println("Memory = " + memore / 1048576);
    }
}
