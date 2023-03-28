import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Start
        // Number input: x, Y
        // IF X > Y THEN output X
        // ELSE output Y
        // End

        // Линейный поиск
        // Шаг 1. Начать
        // Шаг 2. Получить массив array и число для поиска X
        // Шаг 3. Начните с крайнего левого элемента массива array
        // и один за другим сравните Х с каждым элементом из array
        // Шаг 4. Если Х соответствует элементу Print true
        // Шаг 5. Если Х не совпадает ни с одним из элементов,
        // выводим false.
        // Шаг 6. Конец

        // Time complexity: O(1) + O(1) + O(n) + O(1) + O(1) + O(1) =
        // O(n) линейная

        int[] arr = {0, 1, 2, 3, 10, 20};
        System.out.println(isExist(arr, 6));
        // 1. Написать псевдокод для алгоритма: сложить три числа и
        // вывести сумму
        // 2. Реализовать алгоритм в коде.
        // START
        // Number input: a, b, c
        // declare sum
        // sum = a + b + c
        // print sum
        // END
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        System.out.println("Enter c");
        int c = scanner.nextInt();
        sum = a + b + c;
        System.out.println("sum = " + sum);

        String[] names = {"Aleks", "Thea", "Thomas", "Sergey", "Azriel"};
        String[] copyNames = copy(names);

        // Формула НОД, НОД(a, b)
        // 1 Большее число поделить на меньшее.
        // 2 Меньшее число поделить на остаток, который получается после
        //   деления.
        // 3 Первый остаток поделить на второй остаток.
        // 4 Второй остаток поделить на третий и т. д.
        // 5 Деление продолжается до тех пор, пока в остатке не получится
        //   нуль. Последний делитель и есть наибольший общий делитель.
        System.out.println(gcd(48, 8));
    }

    private static int gcd(int a, int b) {
        return 0;
    }

    private static String[] copy(String[] names) {
        String[] array = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            array[i] = names[i];
        }
        return array;
    }

    private static boolean isExist(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Space complexity O(1) + O(1) = O(2) => O(1) Constant
    private static int sum(int[] arr) {
        int sum = 0;    // 1
        for (int i = 0; i < arr.length; i++) {  // 1
            sum = sum + arr[i];
        }
        return sum;
    }


}