//Пусть даны две неубывающие последовательности действительных чисел.
// Требуется указать те места, на которые нужно вставлять элементы последовательности 2 в последовательность 1 так,
// что бы новая последовательность оставалась возрастающей.
package by.kingl.algorithmization.one_dimensional_arrays_sorting;

public class Task7 {

    public static void main(String[] args) {
        double[] a = new double[]{3,4,5,7,9,11,13,14,15,17,19,20,21,22,29,100,165};
        double[] b = new double[]{2,4,6,8,10,12,14,16,18,20,21,45,67,89};
        for(int i = 0; i < b.length; i++){
            if(BinSearch(a, b[i]) == b[i]){
                System.out.println("Ничего не надо вставлять");
            } else
            System.out.println("Число b[" + i + "] вставить на место " + BinSearch(a, b[i]));
        }

	// write your code here
    }
    public static int BinSearch(double[] array, double i){ // функция бинарного поиска
        int low = 0; //нижняя граница для поиска
        double key = i; // значение, которое будем сравнивать
        int hight = array.length; // верхняя граница поиска
        while (low < hight) // условие, искомый элемент не находится по середине отрезка.
        {
            int middle =(hight + low)/2; // поиск середины отрезка
            if(key == array[middle]){
                return (int)array[middle]; //Если искомое и найденное число равны
            }
            if(array[middle] > key) // Сравнение элемента в найденной серидине с искомым элементом, если искомый элемент меньше элемента в середине
                // смещаемся влевой для этого верхней границе массива присваиваем индекс найденного среднего элемента hight = middle,
                // в противном случае смещаемся вправо и присваиваем уже нижней границе массива индекс найденного среднего элемента
                // low = middle + 1 - так как при расчете middle у нас округление в меньшую сторону.
                hight = middle;
            else
                low = middle + 1;
        }

        return low;
    }
}
