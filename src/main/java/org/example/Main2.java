package org.example;

public class Main2 {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4};
        System.out.println(searchNumber(array));
        int[] array2 = {1, 1, 2, 2, 4, 4, 3};
        System.out.println(searchNumber(array2));

        System.out.println(searchNumber2(array));
        System.out.println(searchNumber2(array2));

    }

    private static int searchNumber(int[] array) {
        int size = array.length;
        if (array[size - 2] != array[size - 1]) {
            return array[size - 1];
        }
        for (int i = 0; i < size; i += 2) {
            if (array[i] != array[i + 1]) {
                return array[i];
            }
        }
        return -1;
    }

    private static int searchNumber2(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result ^ array[i];
        }
        return result;
    }

}
