import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        List<Integer> list = qsort(List.of(12, 10, 7, 2, 4, 6, 9, 15));
        System.out.println(list);
    }


    private static void qsort(int[] array, int low, int high) {
        if (array.length < 2 || low >= high) {
            return;
        }
        // Опорный элемент
        int pivot = array[low + (high - low) / 2];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                // меняем местами i-ый элемент и j-ый
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // Рекурсия для сортировки левой и правой части

    }

    // TODO Разобраться и исправить ошибку
    private static List<Integer> qsort(List<Integer> array) {
        // Базовый случай
        if (array.size() < 2) {
            return array;
        }
        // Опорный элемент
        int pivot = array.get(0);
        // Массив элементов, меньших pivot
        ArrayList<Integer> less = new ArrayList<>();
        // Массив элементов, больших pivot
        ArrayList<Integer> greater = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < pivot) {
                less.add(array.get(i));
            } else {
                greater.add(array.get(i));
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(qsort(less));
//        result.add(pivot);
        result.addAll(qsort(greater));
        return result;
    }

}
