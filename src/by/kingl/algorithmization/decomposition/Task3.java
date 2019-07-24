//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
package by.kingl.algorithmization.decomposition;

public class Task3 {

    public static void main(String[] args) {
        int sideA = 6;
        double areaOfTriangle;
        int numberOfTrianglesInHexagon = 6; //Так как шестиугольник с равнми сторонами, то он разбивается на 6 равносторонних треугольника.
        areaOfTriangle = AreaOfTriangle(sideA) * numberOfTrianglesInHexagon;
        System.out.println(areaOfTriangle);
    }

    public static double AreaOfTriangle(int side) { // Площадь равностороннего треугольника.
        return Math.pow(side, 2) * Math.sqrt(3) / 4;
    }
}
