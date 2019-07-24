//Написать метод(методы) для нахождения наибольшего общего делителя(НОД) и наименьшего общего кратного двух натуральных чисел.
package by.kingl.algorithmization.decomposition;

public class Task1 {

    public static void main(String[] args) {
        int numberA = 17;
        int numberB = 11;
        System.out.println(NOK(numberA, numberB));
    }

    public static int NOK(int a, int b) {   //Вычисления НОК
        return (a * b) / NOD(a, b);
    }

    public static int NOD(int a, int b) { //Бинарный алгоритм вычисления НОД https://ru.wikipedia.org/wiki/Бинарный_алгоритм_вычисления_НОД
        if (a == b)
            return a;
        if (a == 0)
            return b;
        else if (b == 0)
            return a;
        else if (a == 1 || b == 1)
            return 1;
        else if (a % 2 == 0 && b % 2 == 0)
            return 2 * NOD(a / 2, b / 2);
        else if (a % 2 == 0 && b % 2 != 0)
            return NOD(a / 2, b);
        else if (a % 2 != 0 && b % 2 == 0)
            return NOD(a, b / 2);
        else if (a % 2 != 0 && b % 2 != 0 && b > a)
            return NOD((b - a) / 2, a);
        else
            return NOD((a - b) / 2, b);
    }
}
