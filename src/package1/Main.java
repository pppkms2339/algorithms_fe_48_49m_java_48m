package package1;

public class Main {

    public static void main(String[] args) {
        hanoiIter(3);
        System.out.println();
        hanoiRecursive(3);
    }

    // Рекурсивное решение
    // n - количество дисков
    public static void hanoiRecursive(int n) {
        recursive(n, 1, 3, 2);
    }

    private static void recursive(int n, int from, int to, int inter) {
        if (n <= 0) {
            return;
        }
        recursive(n - 1, from, inter, to);
        System.out.println(from + "->" + to);
        recursive(n - 1, inter, to, from);
    }

    // Итерационное решение
    // n - количество дисков
    // TODO Сделать для четного количества дисков
    private static void hanoiIter(int n) {
        Stack first = new Stack("1");
        Stack second = new Stack("2");
        Stack third = new Stack("3");

        for (int i = n; i >= 1; i--) {
            first.push(i);
        }
        while (true) {
            // 1 - 3
            swap(first, third);
            if (first.isEmpty() && second.isEmpty()) {
                break;
            }
            // 1 - 2
            swap(first, second);
            if (first.isEmpty() && second.isEmpty()) {
                break;
            }
            // 2 - 3
            swap(second, third);
            if (first.isEmpty() && second.isEmpty()) {
                break;
            }
        }
    }

    // Перекладывание из а в b
    private static void swap(Stack a, Stack b) {
        if (a.isEmpty()) {
            System.out.println(b.getName() + "->" + a.getName());
            a.push(b.pop());
        } else if (b.isEmpty()) {
            System.out.println(a.getName() + "->" + b.getName());
            b.push(a.pop());
        } else {
            if (a.peek() > b.peek()) {
                System.out.println(b.getName() + "->" + a.getName());
                a.push(b.pop());
            } else {
                System.out.println(a.getName() + "->" + b.getName());
                b.push(a.pop());
            }
        }
    }
}