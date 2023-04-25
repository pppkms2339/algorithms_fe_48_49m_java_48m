import java.util.Arrays;

public class DynamicArray {
    private int[] array;
    private int count;  // количество занятых ячеек массива
    private int size;   // длина массива

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }

    /**
     * Добавление элемента в конец массива
     *
     * @param data значение, которое нужно добавить в массив
     */
    public void add(int data) {
        // Проверим, нужно ли расширять массив
        if (count == size) {
            increaseArray();    // делаем массив в два раза больше
        }
        array[count] = data;
        count++;
    }

    // Увеличение массива в два раза
    private void increaseArray() {
        size = size * 2;
        int[] temp = new int[size];
        for (int i = 0; i < count; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    /**
     * Добавление элемента в ячейку с указанным индексом
     *
     * @param data  значение, которое нужно добавить в массив
     * @param index индекс, куда нужно добавить новый элемент
     */
    public void add(int data, int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds!!!");
            return;
        }
        if (count == size) {
            increaseArray();
        }
        for (int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = data;
        count++;
    }

    /**
     * Удаление последнего элемента
     */
    public void remove() {
        if (count > 0) {
            array[count - 1] = 0;
            count--;
        }
    }

    /**
     * Удаление элемента с позиции index
     *
     * @param index индекс удаляемого элемента
     */
    public void remove(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Index out of bounds!!!");
            return;
        }
        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];    // сдвигаем элементы влево
        }
        array[count - 1] = 0;
        count--;
    }

    /**
     * Уменьшение размера массива по его содержимому
     */
    public void trim() {
        int[] temp = new int[count];
        for (int i = 0; i < count; i++) {
            temp[i] = array[i];
        }
        size = count;
        array = temp;
    }

    public void printArray() {
        System.out.println(Arrays.toString(array) + ", count = " + count + ",  size = " + size);

    }


}
