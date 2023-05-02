public class Main2 {

    public static void main(String[] args) {
        System.out.println(fibonacci(40));
        System.out.println(fibonacci2(40));
        int n = 40;
        int[] array = new int[n + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        array[0] = 1;
        array[1] = 1;
        System.out.println(fibonacci3(n, array));
    }

    private static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Метод табуляции
    private static int fibonacci2(int n) {
        if (n < 2) {
            return 1;
        }
        int[] array = new int[n + 1];
        array[0] = array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

    private static int fibonacci3(int n, int[] array) {
        if (array[n] != -1) {
            return array[n];
        }
        if (n < 2) {
            return 1;
        } else {
            array[n] = fibonacci3(n - 1, array) + fibonacci3(n - 2, array);
            return array[n];
        }

    }

}
