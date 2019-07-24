//Отсортировать дробную последовательность.
package by.kingl.algorithmization.one_dimensional_arrays_sorting;

public class Task8 {

    public static void main(String[] args) {
        int n = 10;
        int[] chislitel = new int[n];
        int[] znamenatel = new int[n];
        zapoln(chislitel);
        zapoln(znamenatel);
        System.out.println("Исходная последовательность");
        for (int i = 0; i < n; i++) {
            System.out.print(chislitel[i] + "/" + znamenatel[i] + ", ");
        }
        System.out.println();
        int nok = znamenatel[0];
        int max = 0;
        for (int i = 0; i < znamenatel.length; i++) {
            max = Math.max(znamenatel[i], max);
        }
        for (int i = 1; i < znamenatel.length; i++) {
            nok = NOK(znamenatel[i], nok);
        }
        for (int i = 0; i < n; i++) {
            chislitel[i] *= nok/znamenatel[i];
        }
        for(int i = 0; i < chislitel.length; i++){ // проходим по всем элементам массива.
            int insertIndex = BinSearch(chislitel, i); // функция бинарного поиска
            int temp1 = chislitel[i];
            int temp2 = znamenatel[i];
            for(int j = i; j > insertIndex; j--){//смещение элементов при необходимости вправо.
                chislitel[j] = chislitel[j - 1];
                znamenatel[j] = znamenatel[j - 1];
            }
            chislitel[insertIndex] = temp1;
            znamenatel[insertIndex] = temp2;
        }
        for (int i = 0; i < n; i++) {
            chislitel[i] /= nok/znamenatel[i];
        }
        System.out.println("Отсортированная последовательность");
        for (int i = 0; i < n; i++) {
            System.out.print(chislitel[i] + "/" + znamenatel[i] + ", ");
        }

	// write your code here
    }
    public static void zapoln (int[] mass){
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random()*20 + 1);
        }
    }
    public static int NOK (int a, int b)
    {
        if(a%b == 0)
            return a;
        else
        if(b%a == 0)
            return b;
        else
            if(a%2 == 0 && b%2 == 0){
                return (a*b)/2;
            }
            else
                return a*b;
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
