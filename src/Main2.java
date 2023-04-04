import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        int[] array = {10, 8, 7, 5, 13, 11};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = {10, 8, 7, 5, 13, 11};
        selectSort(array2);
        System.out.println(Arrays.toString(array2));

        int[] array3 = {10, 8, 7, 5, 13, 11};
        mergeSort(array3);
        System.out.println(Arrays.toString(array3));
    }

    private static void mergeSort(int[] array) {
        mergeSortRecursive(array, array.length);
    }

    private static void mergeSortRecursive(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        // Два подмассива
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        // Копируем в подмассивы элементы из исходного массива
        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        mergeSortRecursive(l, mid);
        mergeSortRecursive(r, n - mid);

        // Объединяем отсортированные l и r массивы в один
        merge(array, l, r, mid, n - mid);
    }

    /**
     * Объединение двух отсортированных подмассивов в один массив
     * @param array исходный массив (в него объединяем l и r)
     * @param l левый подмассив
     * @param r правый подмассив
     * @param left длина левого подмассива
     * @param right длина правого подмассива
     */
    private static void merge(int[] array, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] < r[j]) {
                array[k++] = l[i++];
            } else {
                array[k++] = r[j++];
            }
        }
        // Возможно в одном из подмассивов остался "хвост"
        while (i < left) {
            array[k++] = l[i++];
        }
        while (j < right) {
            array[k++] = r[j++];
        }
    }

    /**
     * Пузырьковая сортировка одномерного массива
     * @param array исходный сортируемый массив
     */
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }

    private static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int nmin = i;           // номер минимального элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[nmin]) {
                    nmin = j;
                }
            }
            // меняем i-ый элемент массива с nmin-ным
            int t = array[i];
            array[i] = array[nmin];
            array[nmin] = t;
        }
    }

}
