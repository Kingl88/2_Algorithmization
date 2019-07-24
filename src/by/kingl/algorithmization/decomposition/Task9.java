package by.kingl.algorithmization.decomposition;

public class Task9 {

    public static boolean IsQuadrangleExist(int a, int b, int c, int d) { // Проверка на существование четырехугольника
        int max = Math.max(Math.max(a, b), Math.max(c, d));
        return max < (a + b + c + d - max);
    }

    public static double Square(int a, int b, int c, int d) { // Нахождение площади четырехугольника,
        double S1, S2, hypotenuse, perimeter;                // путем разбиения его на треугольники.
        hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        S1 = (a * b) / 2;
        perimeter = c + d + hypotenuse;
        S2 = Math.sqrt(perimeter * (perimeter - c) * (perimeter - d) * (perimeter - hypotenuse));
        return S1 + S2;
    }

    public static void main(String[] args) {
        int sideX = 5, sideY = 5, sideZ = 3, sideT = 6;
        if (IsQuadrangleExist(sideX, sideY, sideZ, sideT)) {
            System.out.println("Area is equal to " + Square(sideX, sideY, sideZ, sideT));
        } else {
            System.out.println("Quadrangle does not exist");
        }
    }
}
