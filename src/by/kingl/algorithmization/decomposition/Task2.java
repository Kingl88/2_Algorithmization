
package by.kingl.algorithmization.decomposition;

public class Task2 {

    public static void main(String[] args) {
        int number1 = 234, number2 = 240, number3 = 36, number4 = 72;
        System.out.println(NOD(NOD(NOD(number1, number2), number3), number4));
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
