package by.kingl.algorithmization.decomposition;

public class Task6 {
    public static boolean NOD(int one, int two) {
        while (one != 0 && two != 0) {
            if (one > two) {
                one = one % two;
            } else {
                two = two % one;
            }
        }
        return one + two == 1;
    }

    public static void main(String[] args) {
        int numberOne = 56;
        int numberTwo = 63;
        int numberThree = 43;
        if (NOD(numberOne, numberTwo)) {
            if (NOD(numberOne, numberThree)) {
                if (NOD(numberTwo, numberThree)) {
                    System.out.println("Числа взаимнопростые");
                } else {
                    System.out.println("Числа невзаимнопростые");
                }
            } else {
                System.out.println("Числа невзаимнопростые");
            }
        } else {
            System.out.println("Числа невзаимнопростые");
        }

    }
}
