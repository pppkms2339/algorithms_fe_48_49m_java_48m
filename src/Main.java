public class Main {

    public static void main(String[] args) {
        // Дано натуральное число n. Вычислить сумму его цифр.
        // 436 = 4 + 3 + 6 = 13
        int a = 436;
        int sum = 0;
        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        System.out.println(sum);
        System.out.println();
        System.out.println(sum(436));
        split1(436);
        System.out.println();
        System.out.println(split2(436));
    }

    private static int sum(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }
        return n % 10 + sum(n / 10);
    }

    private static int split1(int n) {
        // Базовый случай
        if (n < 10) {
            System.out.println(n + " ");
            return n;
        }
        System.out.print(n % 10 + " ");
        return split1(n / 10);
    }

    private static String split2(int n) {
        // Базовый случай
        if (n < 10) {
            return Integer.toString(n);
        }
        return split2(n / 10) + " " + n % 10;
    }

}
