//Сортировка выборкой, двоичный поиск.
package by.kingl.algorithmization.one_dimensional_arrays_sorting;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        int[] mass = new int[10000];
        for(int i = 0; i < mass.length; i++){
            mass[i] =(int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(mass));
        for(int i = 0; i < mass.length; i++){ // проходим по всем элементам массива.
            int insertIndex = BinSearch(mass, i); // функция бинарного поиска
            int temp = mass[i];
            for(int j = i; j > insertIndex; j--){//смещение элементов при необходимости вправо.
                mass[j] = mass[j - 1];
            }
            mass[insertIndex] = temp;
        }
        System.out.println(Arrays.toString(mass));

	// write your code here
    }
    public static int BinSearch(int[] array, int i){ // функция бинарного поиска
        int low = 0; //нижняя граница для поиска
        int key = array[i]; // значение, которое будем сравнивать
        int hight = i; // верхняя граница поиска
        while (low < hight) // условие, искомый элемент не находится по середине отрезка.
        {
           int middle =(hight + low)/2; // поиск середины отрезка
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
