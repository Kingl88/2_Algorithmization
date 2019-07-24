package by.kingl.algorithmization.decomposition;

public class Task4 {

    public static void main(String[] args) {
        int numberPoints = 6;
        System.out.println(MaxDistance(CreatMass(numberPoints)));
    }

    public static int[][] CreatMass(int number) { // Метод создания и заполнения массива.
        int[][] mass = new int[number][number];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 10);

            }

        }
        return mass;

    }

    public static double MaxDistance(int[][] mass) { // Метод нахождения максимальной дистанции между точками.
        double distance = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 1; j < mass.length - 1 - i; j++) {
                double distanceTemp = Math.sqrt(Math.pow((mass[i][0] - mass[i + j][0]), 2) + Math.pow((mass[i][1] - mass[i + j][1]), 2));
                if (distanceTemp > distance) {
                    distance = distanceTemp;
                }
            }

        }
        return distance;
    }
}
