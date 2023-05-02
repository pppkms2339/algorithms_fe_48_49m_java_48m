import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        sum1();
        System.out.println();
        sum2();
        System.out.println();
        sum3();
    }

    public static void sum1() {
        int[] number = {3, 4, 5};
        int s = 0;
        int len = number.length;
        for (int i = 0; i < len; i++) {
            s = s + number[len - i - 1] * (int)Math.pow(10, i);
        }
        s = s + 1;
        ArrayList<Integer> number2 = new ArrayList<>();
        while (s > 0) {
            number2.add(0, s % 10);
            s = s / 10;
        }
        System.out.println(number2);
    }

    public static void sum2() {
        int[] number = {3, 4, 5};
        String s = "";
        for (int i = 0; i < number.length; i++) {
            s = s + number[i];
        }
        int a = Integer.parseInt(s) + 1;
        String b = String.valueOf(a);
        int[] number2 = new int[b.length()];
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            number2[i] = Integer.parseInt("" + c);
        }
        System.out.println(Arrays.toString(number2));
    }

    public static void sum3() {
        int[] number = {9, 9, 9};
        for (int i = number.length - 1; i >= 0; i--) {
            if (number[i] != 9) {
                number[i] = number[i] + 1;
                break;
            } else {
                number[i] = 0;
            }
        }
        if (number[0] == 0) {
            int[] array = new int[number.length + 1];
            array[0] = 1;
            number = array;
        }
        System.out.println(Arrays.toString(number));
    }

}